package metro10068;

import java.awt.geom.*;

public class metroO_10068 {
	OrangeLine10068 orangeLine = new OrangeLine10068();
	int[] rx = orangeLine.getStationX();
	int[] ry = orangeLine.getStationY();
	public metroO_10068()
	{
		x = rx[0]+150;
		y = ry[0]-80;
	}
	public void move()
	{
		if(x>=rx[3]-60 && y<=ry[3]+25)
			{
				x-=dx;
				y+=dy;
			}
			else
			{
				x = rx[0]+150;
				y = ry[0]-80;
				
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
	   private double dx = 0.7;
	   private double dy = 0.32;


}