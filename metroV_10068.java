package metro10068;

import java.awt.geom.*;

public class metroV_10068 {
	VioletLine10068 violetLine = new VioletLine10068();
	int[] rx = violetLine.getStationX();
	int[] ry = violetLine.getStationY();
	public metroV_10068()
	{
		x = rx[0]-8;
		y = ry[0]-15;
	}
	public void move()
	{
			if(x<=rx[8]+11 && y<=ry[8])
			{
				x+=dx;
				y+=dy;
			}
			else if(y<=ry[10]-7)
				{
					y+=dy;
				}
			else if(x<=rx[rx.length-1])
				{
					x=x+dx;
				}
				else
					{
					x=rx[0]-8;
					y=ry[0]-15;
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
	   private double dx = 1.2;
	   private double dy = 0.8;


}