package train;
import java.awt.*;

public class LocomotiveTrain extends TrainCar{
	private int x1;
	
	public LocomotiveTrain (Graphics g,Color cc, int x) {
		super(g,cc, x);
		x1 =x;
		drawStack(g);
		drawCowCatcher(g);
	}

	public void drawStack(Graphics g) {
		g.setColor(Color.white);
		g.fillOval(x1+90,175,30,30);
		g.fillOval(x1+75,160,30,30);
		g.fillOval(x1+60,145,30,30);
		g.setColor(Color.black);
		g.fillRect(x1+100,200,35,50);
	}
	
	public void drawCowCatcher(Graphics g) {
		Polygon CC = new Polygon();
		CC.addPoint(x1+150, 350);
		CC.addPoint(x1+150, 300);
		CC.addPoint(x1+200, 350);
		g.fillPolygon(CC);
		}
}

