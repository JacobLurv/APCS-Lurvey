import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUI implements ActionListener{
	
	JFrame gui = new JFrame(); 
	
	JPanel text = new JPanel(); //user input
	JPanel field = new JPanel(); //output display
	JPanel buttons = new JPanel();
	
	JTextField input = new JTextField(15); 
	
	//boxes for input feedback
	JLabel qtyL = new JLabel("Quantity:"); 
	JLabel szL = new JLabel("Size:");
	JLabel prcL = new JLabel("Price:");
	JLabel nameL = new JLabel("Name:");
	JLabel idL = new JLabel("Order #:");
	
	JButton submit = new JButton("Submit");
	JButton qty = new JButton("Quantity");
	JButton size = new JButton("Size");
	JButton price = new JButton("Price");
	JButton name = new JButton("Name");
	JButton id = new JButton("Order #");
	
	//search && clear data buttons
	JButton pollNum = new JButton("Search(ID)");
	JButton delete = new JButton("Clear");
	
	Inventory inv = new Inventory();
	
	//to store drink attributes
	int q = 0;
	int s = 0;
	double p = 0;
	String n = new String();
	int i = 0;
	
	
	public GUI() {
		gui.setLayout(new GridLayout(3,1));
		buttons.setLayout(new GridLayout(2,4));
		field.setLayout(new GridLayout(5,1));
		
		submit.addActionListener(this);
		qty.addActionListener(this);
		size.addActionListener(this);
		price.addActionListener(this);
		name.addActionListener(this);
		id.addActionListener(this);
		input.addActionListener(this);
		delete.addActionListener(this);
		pollNum.addActionListener(this);
		
		text.add(qtyL);
		text.add(szL);
		text.add(prcL);
		text.add(nameL);
		text.add(idL);
		
		buttons.add(id);
		buttons.add(qty);
		buttons.add(size);
		buttons.add(price);
		buttons.add(name);
		buttons.add(submit);
		buttons.add(pollNum);
		buttons.add(delete);
		
		field.add(qtyL);
		field.add(szL);
		field.add(prcL);
		field.add(nameL);
		field.add(idL);
		
		gui.add(field);
		gui.add(input);
		gui.add(buttons);
		gui.setTitle("Online Drink Store");
		gui.setSize(200, 300);
		gui.setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent e) {//assigns chosen variable provided input based on user choice	
		if(e.getSource() == qty) {
				String text = input.getText();
				q = Integer.parseInt(text);
				qtyL.setText("Quantity: " + text);
				input.setText("");
		}
		if(e.getSource() == size) {
				String text = input.getText();
				s= Integer.parseInt(text);
				input.setText("");
				szL.setText("Size: " + text);
		}
		if(e.getSource() == price) {
				String text = input.getText();
				p = Double.parseDouble(text);
				input.setText("");
				prcL.setText("Price: $" + text);
		}
		if(e.getSource() == name) {
				String text = input.getText();
				n = text;
				input.setText("");
				nameL.setText("Name: " + text);
		}
		if(e.getSource() == id) {
				String text = input.getText();
				i = Integer.parseInt(text);
				input.setText("");
				idL.setText("Order #: " + text);
		}
		if(e.getSource() == submit) { //creates new drink object w/ obtained parameters, adds it to arrayList
				Drink d = new Drink(q,s,p,n,i);
				
				inv.addItem(d);
				
				qtyL.setText("Quantity:");
				szL.setText("Size:");
				prcL.setText("Price:");
				nameL.setText("Name:");
				idL.setText("Order #:");
		}
		if(e.getSource() == delete) { //clears inputs
			qtyL.setText("Quantity:");
			szL.setText("Size:");
			prcL.setText("Price:");
			nameL.setText("Name:");
			idL.setText("Order #:");
		}
		if(e.getSource() == pollNum) { //finds index of number with input order #, displays its attributes
			try {
				int index = inv.findIndexByID(i);
				qtyL.setText("Quantity: " + inv.getQty(index));
				szL.setText("Size:" + inv.getSize(index));
				prcL.setText("Price:" + inv.getPrice(index));
				nameL.setText("Name:" + inv.getName(index));
				idL.setText("Order #:" + inv.getID(index));
			} catch(Exception x) { //if nonexistent order number, try block throws exception
				qtyL.setText("No Such Order, Press Clear and Retry");
			}
		}
	}

	public static void main (String args[])
	{
		new GUI();
	}
}
