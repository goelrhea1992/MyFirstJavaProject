package metro10068;

import java.awt.geom.*;

public class metroR_10068 {
	RedLine10068 redLine = new RedLine10068();
	int[] rx = redLine.getStationX();
	int[] ry = redLine.getStationY();
	public metroR_10068()
	{
		x = rx[0];
		y = ry[0]-15;
	}
	public void move()
	{
		if(x<=rx[10]-20 && y<=ry[10]-13)
			{
				x+=dx;
				y+=dy;
			}
			else
			{
				x+=dx;
				if(x>=rx[rx.length-2]-1 && x<=rx[rx.length-2]+1)
				{
					x=rx[0];
					y=ry[0]-15;
				}
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