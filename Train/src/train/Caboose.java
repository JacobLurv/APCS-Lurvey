package train;
import java.awt.*;

public class Caboose extends TrainCar{
	private int x1;
	
	public Caboose(Graphics g,Color cc, int x) {
		super(g,cc, x);
		x1 =x;
		drawWindows(g);
		drawRoof(g);
	}
	
	public void drawWindows(Graphics g){
	    g.setColor(Color.white);
	    g.fillRect(x1+30,280,30,30);
	    g.fillRect(x1+90,280,30,30);
	}
	
	public void drawRoof(Graphics g) {
		g.setColor(Color.black);
		g.fillRect(x1+10, 225, 130, 25);
	}
	
}
