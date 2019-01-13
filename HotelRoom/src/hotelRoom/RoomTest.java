package hotelRoom;
import java.awt.*;
import java.applet.*;


public class RoomTest extends Applet{
	
	public void paint(Graphics g)
	{
		 HotelRoom roomOne = new HotelRoom(10,310,3,4,g);
		 BathRoom roomTwo = new BathRoom(10,10,3,2,g);
		 Kitchen roomThree = new Kitchen(310,310,4,4,g);
	}

}