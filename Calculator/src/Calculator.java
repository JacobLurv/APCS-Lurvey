import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator implements ActionListener{
	
	JFrame calc = new JFrame();
	JPanel text = new JPanel();
	JPanel buttons = new JPanel();
	JPanel dc = new JPanel();
	JLabel answer = new JLabel("                  ");
	JButton one = new JButton("1");
	JButton two = new JButton("2");
	JButton three = new JButton("3");
	JButton four = new JButton("4");
	JButton five = new JButton("5");
	JButton six = new JButton("6");
	JButton seven = new JButton("7");
	JButton eight = new JButton("8");
	JButton nine = new JButton("9");
	JButton zero = new JButton("0");
	JButton add = new JButton("+");
	JButton sub = new JButton("-");
	JButton times = new JButton("x");
	JButton div = new JButton("/");
	JButton equal = new JButton("=");
	JButton clear = new JButton("C");
	JButton del = new JButton("Del");
	JButton point = new JButton(".");
		
	double first; 
	double second; 
	double ans; 
	int op; //operator for numbers: 1=add 2=subtract 3=multiply 4=divide
	
	public Calculator() {
		calc.setLayout(new GridLayout(3,1)); 
		buttons.setLayout(new GridLayout(4,4)); 
		
		//adds listeners to the buttons
		one.addActionListener(this);
		two.addActionListener(this);
		three.addActionListener(this);
		four.addActionListener(this);
		five.addActionListener(this);
		six.addActionListener(this);
		seven.addActionListener(this);
		eight.addActionListener(this);
		nine.addActionListener(this);
		zero.addActionListener(this);
		add.addActionListener(this);
		sub.addActionListener(this);
		times.addActionListener(this);
		div.addActionListener(this);
		equal.addActionListener(this);
		clear.addActionListener(this);
		del.addActionListener(this);
		point.addActionListener(this);

		text.add(answer);
		
		//adds buttons to grid in proper order
		buttons.add(six);
		buttons.add(seven);
		buttons.add(eight);
		buttons.add(nine);
		
		buttons.add(two);
		buttons.add(three);
		buttons.add(four);
		buttons.add(five);
		
		buttons.add(zero);
		buttons.add(one);
		buttons.add(equal);
		buttons.add(point);
		
		buttons.add(add);
		buttons.add(times);
		buttons.add(sub);
		buttons.add(div);
		
		//add the delete and clear buttons to the del/clear panel
		dc.add(del);
		dc.add(clear);

		//adds everything to calculator
		calc.add(text);
		calc.add(buttons);
		calc.add(dc);
		calc.setTitle("Calculator");
		calc.setSize(200, 300);
		calc.setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		String str = e.getActionCommand();
		
		if(str.equals("C")) 
		{
			answer.setText("");
			op = 0;
		}
		else if(str.equals("Del")){
			String s=answer.getText();
			answer.setText("");
			for(int i=0;i<s.length()-1;i++)
				answer.setText(answer.getText()+s.charAt(i));
		}
		
		//if the action command came from each specific button, the operation is prepped for
		else if(str.equals("+")){ 
			first=Double.parseDouble(answer.getText()); 
			op=1; 
			answer.setText(""); 
		} 
		else if(e.getSource()==sub){
			first=Double.parseDouble(answer.getText());
			op=2; 
			answer.setText("");
		}	
		else if(e.getSource()==times){
			first=Double.parseDouble(answer.getText());
			op=3; 
			answer.setText("");
		}
		else if(e.getSource()==div){
			first=Double.parseDouble(answer.getText());
			op=4; 
			answer.setText("");
		}
		else if(e.getSource()==equal){
			second=Double.parseDouble(answer.getText()); //sets second number to value entered for computation
			switch(op){
				case 1: ans = first+second;
					break;
				case 2: ans = first-second;
					break;
				case 3: ans = first*second;
					break;		
				case 4: ans = first/second;
					break;
				default: ans = 0; //defaults to 0
			}
			answer.setText(""+ans);
		}
		else /*if(!str.equals("+") && !str.equals("-") && !str.equals("x") && !str.equals("/") && !str.equals("="))*/ {
			answer.setText(answer.getText() + str);
		}
		
	}
	
	public static void main (String args[])
	{
		new Calculator();
	}
}