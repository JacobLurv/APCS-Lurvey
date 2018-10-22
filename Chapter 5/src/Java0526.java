// Java0526.java
// This program demonstrates how to draw multiple lines easily with a loop structure
// inside a rectangle to form a pattern.


import java.awt.*;
import java.applet.*;


public class Java0526 extends Applet
{
	public void paint(Graphics g)
	{
	int x1 = 0;
	int x2 = 0;
	int y1 = 0;
	int y2 = 0;
	
	g.drawRect(10,10,980,630);
	
		for(int i = 1; i <= 49; i++) {
			x1 = 10 + (i * 20);
			y1 = 640;
			x2 = 990;
			y2 = 640 - (13 * i);
			g.drawLine(x1, y1, x2, y2);
		}
		
		for(int j = 1; j <= 49; j++) {
			x1 = 10 + (j * 20);
			y1 = 10;
			x2 = 990;
			y2 = 10 + (13 * j);
			g.drawLine(x1,y1,x2,y2);
		}
		
		for(int a = 1; a <= 49; a++) {
			x1 = 10 + (a * 20);
			y1 = 640;
			x2 = 10;
			y2 = a * 13;
			g.drawLine(x1, y1, x2, y2);
		}
		
		for(int b = 1; b <= 49; b++) {
			x1 = 10 + (b * 20);
			y1 = 10;
			x2 = 10;
			y2 = 640 - (b * 13);
			g.drawLine(x1, x2, y1, y2);
		}
		
		
	}
}



