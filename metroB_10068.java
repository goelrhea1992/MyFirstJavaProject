package metro10068;

import java.awt.geom.*;

public class metroB_10068 {
	BlueLine10068 blueLine = new BlueLine10068();
	int[] rx = blueLine.getStationX();
	int[] ry = blueLine.getStationY();
	int flag=0;
	public metroB_10068()
	{
		x = rx[27];
		y = ry[27]-12;
	}
	public void move()
	{
		
			if(y>=ry[20]-12 && x>=rx[20]-10)
			{
				x-=dx;
				y-=dy;
			}
			else if(x<=rx[13] && y>=ry[13]-15)
			{
				x+=0.9;
				y-=dy;
			}
			else if(x<=rx[0]+35)
			{
				x+=dx;
			}
			else if(x<=rx[31] && y<=ry[31])
				{
					x+=dx;
					y=y+0.5;
				}
			else if(x<=rx[39])
			{
				x+=dx;
			}
			
			else 
				
				{
					x=rx[27];
					y=ry[27]-12;
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
	   private double dx = 1;
	   private double dy = 0.45;


}