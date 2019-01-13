package hotelRoom;
import java.awt.*;
import java.applet.*;

public class HotelRoom {
	
	private int x; //top left x
	private int y; //top left y
	private int bed; //where's bed
	private int door; //where's door
	
	
	public HotelRoom(int xCoord, int yCoord, int d, Graphics g) { //chairless- for superclass use
		x = xCoord;
		y = yCoord;
		door = d;
		
		g.setColor(Color.black);
		g.fillRect(x,y,300,300);
		g.setColor(Color.white);
		g.drawRect(x,y,300,300);
		
		buildDoor(x,y,d,g);
	}
	
	public HotelRoom(int xCoord, int yCoord, int ch, int d, Graphics g) { //with chair- when standalone
		x = xCoord;
		y = yCoord;
		bed = ch;
		door = d;
		
		g.setColor(Color.black);
		g.fillRect(x,y,300,300);
		buildBed(x,y,bed,g);
		buildDoor(x,y,d,g);
	}
	
	private void buildBed(int x, int y, int ch, Graphics g) {
		g.setColor(Color.white);
		
		switch(ch) {//puts bed in corner: 1=T&L 2=T&R 3=B&L 4=B&R
			case 1:
				g.fillRect(x,y,90,50);
				g.setColor(Color.red);
				g.fillRect(x, y, 30, 50);
				break;
			case 2:
				g.fillRect(x+210, y, 90, 50);
				g.setColor(Color.red);
				g.fillRect(x+210, y, 30, 50); 
				break;
			case 3:
				g.fillRect(x, y+210, 50, 90);
				g.setColor(Color.red);
				g.fillRect(x, y+210, 50, 30);
				break;
			case 4:
				g.fillRect(x+250, y+210, 50, 90);
				g.setColor(Color.red);
				g.fillRect(x+250, y+210, 50, 30);
				break;
		}
	}
	
	private void buildDoor(int x, int y, int d, Graphics g) {
		g.setColor(Color.white);
		
		switch(d) {//puts door on wall: 1=T 2=R 3=B 4=L
			case 1:
				g.fillRect(x+130,y,40,5);
				break;
			case 2:
				g.fillRect(x+295,y+130,5,40);
				break;
			case 3:
				g.fillRect(x+130,y+295,40,5);
				break;
			case 4:
				g.fillRect(x,y+130,5,40);
				break;
		}
	
	}
}
