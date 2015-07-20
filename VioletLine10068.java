package metro10068;
import javax.swing.*;

import java.awt.*;

public class VioletLine10068 extends JComponent{
	private int[] stationX = {678,703,728,753,778,803,828,853,848,848,848,883,918,953};
	private int[] stationY = {406,423,440,457,474,491,508,525,551,586,621,623,623,623};
	private int[] noOfPlatforms = {2,2,2,2,2,2,2,2,2,2,2,2,2,2};
	private String[] stations = {"Khan Market","Lodhi Colony","JL Nehru Stadium","Lajpat Nagar","Moolchand",
			"Kailash Colony","Nehru Place","Kalkaji","Okhla","Jasola","Sarita Vihar","Mohan Estate","Tuglakabad","Badarpur"};
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		g.setColor(Color.MAGENTA);
		g2.setStroke(new BasicStroke(3));
		g2.drawLine(658, 396, 860, 530);
		g2.drawLine(860, 530, 860, 630);
		g2.drawLine(860, 630, 960, 630);
		int i,x,y;
		x=678;
		y=406;
		g.setColor(Color.BLACK);
		for(i=1;i<=8;i++)
		{
			g.fillOval(x,y,13,13);
			x=x+25;
			y=y+17;
		}
		x=x-25;
		y=y+9;
		for(i=1;i<=3;i++)
		{
			g.fillOval(x,y,13,13);
			y=y+35;
		}
		y=y-33;
		x=x+35;
		for(i=1;i<=3;i++)
		{
			g.fillOval(x,y,13,13);
			x=x+35;
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