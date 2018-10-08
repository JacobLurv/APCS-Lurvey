
import java.applet.Applet;
import java.awt.*;
import java.lang.Math;;

public class GraphicsLab01v110 extends Applet {
	public void paint(Graphics screen) {
		
		//square
		screen.drawRect(25,25,300,300);
		screen.drawRect(125,125,300,300);
		
		//connectors
		screen.drawLine(25, 25, 125, 125);
		screen.drawLine(325, 325, 425, 425);
		screen.drawLine(25, 325, 125, 425);
		screen.drawLine(325, 25, 425, 125);
		
		//circle
		screen.drawOval(75,75,300,300);
		
		//horizontal connectors
		screen.drawOval(75, 115, 300, 225);
		screen.drawOval(75, 150, 300, 150);
		screen.drawOval(75, 190,300,75);
		
		//vertical connectors
		screen.drawOval(115, 75, 225, 300);
		screen.drawOval(150, 75, 150, 300);
		screen.drawOval(190, 75, 75, 300);
	
		//triangle
		screen.drawLine(450,400,1050,400);
		screen.drawLine(450,400,750,100);
		screen.drawLine(750,100,1050,400);
		
		//cross lines
		screen.drawLine(750,100,750,400);
		screen.drawLine(600,250,1050,400);
		screen.drawLine(900,250,450,400);
		
		
	}
}
