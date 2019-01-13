package hotelRoom;
import java.applet.*;
import java.awt.*;

public class Kitchen extends HotelRoom{
	public Kitchen(int x, int y, int stove, int door, Graphics g) {
		super(x,y,door,g);
		
		drawCounters(x,y,g);
		drawStovetop(x,y,g);
		
	}
	
	private void drawCounters(int x, int y, Graphics g) {
		g.drawRect(x, y, 300, 30);
		g.drawRect(x, y, 30, 300);
		g.drawRect(x+270, y, 30, 300);
		g.drawRect(x, y+270, 300, 30);
	}

	private void drawStovetop(int x,int y, Graphics g) {
		g.setColor(Color.gray);
		g.fillOval(x+270, y+140, 15, 15);
		g.fillOval(x+285, y+140, 15, 15);
		g.fillOval(x+270, y+155, 15, 15);
		g.fillOval(x+285, y+155, 15, 15);
		
	}
}
