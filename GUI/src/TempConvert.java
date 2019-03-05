import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TempConvert implements ActionListener{
	JFrame f = new JFrame();
	JPanel p = new JPanel();
	JLabel height;
	JTextField input;
	
	public TempConvert() {
		p.setLayout(new GridLayout(2,2));
		
		JButton convert = new JButton("Convert");
		height = new JLabel("Fahrenheit");
		input = new JTextField("Input");
		
		convert.addActionListener(this);
		
		p.add(convert);
		p.add(input);
		p.add(height);
		
		f.add(p);
		f.setTitle("Temp Converter");
		f.setSize(400, 400);
		f.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent a) {
		String s = a.getActionCommand();
		double celsius;
		double converted;
		
		if(s.equals("Convert")) {
			celsius = Double.parseDouble(input.getText());
			converted = celsius*(9/5) + 32;
			height.setText(converted + " degrees F");
		}
		
	}
	
	public static void main(String[] args) {
		new TempConvert();
	}
}
