import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.ArrayList;

public class CannonBall {
	private Rectangle box;
	private double angle, force, time;
	public static final double G=5.8;
	public static final int x0=120;
	public static final int y0=250;
	private int size;
	public CannonBall(int angle, int force) {
		size=15;
		box = new Rectangle(x0,y0,size,size);
		this.angle=angle*Math.PI/180.0;
		this.force=force/1.9;
		time=0.0;
	}
	public CannonBall(int angle, int force, int size) {
		this(angle, force);
		this.size=size;

	}

	public void move(ArrayList<Target> targets) {
		time+=0.1;
		int x=x0+(int)(time*force*Math.cos(angle));
		int y=y0+(int)(-1*time*force*Math.sin(angle)+0.5*G*time*time);
		box = new Rectangle(x,y,size,size);
		int i=0;
		while(i<targets.size()){
			Target t=targets.get(i);
			if(box.intersects(t.getRect())) {
					targets.remove(t);
					BasicCannon.points++;
			} else
				i++;
		}
	}

	public int getY() {
		return box.y+box.height;
	}
	public void draw(Graphics g){
		g.setColor(Color.RED);
		g.fillOval(box.x, box.y, box.width, box.height);
	}
	public Rectangle area() {

		return box;
	}

}