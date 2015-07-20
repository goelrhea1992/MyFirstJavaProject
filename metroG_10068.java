package metro10068;

import java.awt.geom.*;

public class metroG_10068 {
	GreenLine10068 greenLine = new GreenLine10068();
	int[] rx = greenLine.getStationX();
	int[] ry = greenLine.getStationY();
	public metroG_10068()
	{
		x = rx[0];
		y = ry[0]-12;
	}
	public void move()
	{
		if(x<=rx[rx.length-1]-5)
			{
				x+=dx;
			}
			else
			{
					x=rx[0];
					y=ry[0]-12;
			}	
	   }
	
	 public Ellipse2D getShape()
	   {
	      return new Ellipse2D.Double(x, y, XSIZE, YSIZE);
	   }
	 
	 private static final int XSIZE = 15;
	   private static final int YSIZE = 15;
	   private double x = 0;
	   private double y = 0;
	   private double dx = 1.5;
	   private double dy = 0.9;


}