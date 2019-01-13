package hotelRoom;
import java.awt.*;
import java.applet.*;

public class BathRoom extends HotelRoom{
	
	private int bathTub;
	
	public BathRoom(int x, int y, int d, int bath, Graphics g) {
		super(x,y,d,g);
		
		bathTub = bath;
		buildBath(x,y,bathTub, g);
		buildToilet(x,y,g);
	}
	
	private void buildBath(int x, int y, int bath, Graphics g) {
		switch(bath) {
		
		case 1:
			g.drawOval(x, y, 140, 50); //Top Left
			g.fillOval(x, y, 30, 30);
			break;
		case 2:
			g.drawOval(x+160,y,140,50); //top right
			g.fillOval(x+160, y+10, 30, 30);
			break;
		case 3:
			g.drawOval(x, y+250, 140, 50); //bottom left
			g.fillOval(x, y+260, 30, 30);
			break;
		case 4:
			g.drawOval(x+160, y+240, 140, 50); //bottom right
			g.fillOval(x+160, y+240, 30, 30);
			break;
		}
		
	}
	private void buildToilet(int x, int y, Graphics g) {
		g.fillOval(x+20, y+140, 40, 40);
		g.fillRect(x, y+140, 20, 40);
	}
	
}
