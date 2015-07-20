package metro10068;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;

public class GreenLine10068 extends JComponent{
	private int[] stationX = {5,35,65,95,125,155,185,215,245,275,305,335,365,395};
	private int[] stationY = {255,255,255,255,255,255,255,255,255,255,255,255,255,255};
	private int[] noOfPlatforms = {2,2,2,2,2,2,2,2,2,2,2,2,2,2};
	private String[] stations = {"Mundka","Rajdhani Park","Nangloi Station","Nangloi","Surajmal Stadium",
			"Udyog Nagar","Peera Garhi","Sahdev Park","Paschim Vihar","Madi Pur","Shivaji Park","Punjabi Bagh","Ashok Park","Inderlok"};
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		g2.setStroke(new BasicStroke(3));
		int x,y,i;
		g.setColor(Color.GREEN);
		g2.drawLine(5, 260, 402, 260);
		g.setColor(Color.BLACK);
		x=5;
		y=255;
		for(i=1;i<=13;i++)
		{
			g.fillOval(x,y,13,13);
			x=x+30;
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