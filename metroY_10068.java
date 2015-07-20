package metro10068;

import java.awt.geom.*;


public class metroY_10068 {
	YellowLine10068 yellowLine = new YellowLine10068();
	int[] rx = yellowLine.getStationX();
	int[] ry = yellowLine.getStationY();
	public metroY_10068()
	{
		x = rx[0];
		y = ry[0]-15;
	}
	public void move()
	{
			if(x<=rx[6] && y<=ry[6])
			{
				x+=dx;
				y+=dy;
			}
			else if(x<=rx[9]+6 && y<=ry[9])
			{
				x+=0.3;
				y=y+1.5;
			}
			else if(x>=rx[12]+8 && y<=ry[12])
			{
				y=y+1.1;
			}
			else if(x>=rx[14] && y<=ry[14])
			{
				x=x-1;
				y=y+0.3;
			}
			else if(x>=rx[24] && y<=ry[24])
			{
				x=x-0.11;
				y=y+3;
			}
			else if(x>=rx[33] && y<=ry[33])
			{
				x=x-2;
				y=y+0.1;
			}
			else 
				{
					x=rx[0];
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
	   private double dx = 1.7;
	   private double dy = 0.8;


}