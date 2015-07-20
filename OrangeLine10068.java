package metro10068;
import javax.swing.*;

import java.awt.*;

public class OrangeLine10068 extends JComponent{
	private int[] stationX = {550,483,416,349};
	private int[] stationY = {410,440,470,500};
	private int[] noOfPlatforms = {2,2,2,2};
	private String[] stations = {"Shivaji Stadium","Dhaula Kuan","NH-8","Indira Gandhi Airport"};
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		g.setColor(Color.ORANGE);
		g2.setStroke(new BasicStroke(3));
		g2.drawLine(700, 352, 280, 540);
		int i,x, y;
		x=550;
		y=410;
		g.setColor(Color.BLACK);
		for(i=0;i<4;i++)
		{
			g.fillOval(x,y,13,13);
			x=x-67;
			y=y+30;
		}
	}
	public String[] getStations()
	{
		return stations;
	}
	public int[] getStationX()
	{
		return stationX;
	}
	public int[] getStationY()
	{
		return stationY;
	}
	public int[] getNoOfPlatforms()
	{
		return noOfPlatforms;
	}
}
	