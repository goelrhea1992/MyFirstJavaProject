package metro10068;
import javax.swing.*;
import java.awt.*;

public class BlueLine10068 extends JComponent{
	private int[] stationX = {668,636,604,572,540,508,476,444,412,380,348,316,284,249,225,205,185,165,145,125,105,138,161,184,207,230,253,276,718,734,750,766,803,829,855,881,907,933,959,987,850,870,890,910,930,950,970,1000,1030,1060};
	private int[] stationY = {365,365,365,365,365,365,365,365,365,365,365,365,365,365,372,384,396,408,420,432,447,462,473,484,495,506,517,528,375,383,391,399,400,400,400,400,400,400,400,400,423,436,449,462,475,488,501,503,503,503};
	private int[] noOfPlatforms = {2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2};
	private String[] stations = {"RK Ashram Marg","Jhandewalan","Karol Bagh","Rajendra Place","Patel Nagar",
			"Shaadipur","Kirti Nagar","Moti Nagar","Ramesh Nagar","Rajouri Garden","Tagore Garden","Subhash Nagar",
			"Tilak nagar","Janakpuri East","Janakpuri West","Uttam Nagar East","Uttam Nagar West","Nawada",
			"Dwarka Mor","Dwarka","Dwarka Sector 14","Dwarka Sector 13","Dwarka Sector 12","Dwarka Sector 11",
			"Dwarka Sector 10","Dwarka Sector 9","Dwarka Sector 8","Dwarka Sector 21","Barakhamba Road",
			"Mandi House","Pragati Maidan","Indraprastha","Yamuna Bank","Laxmi Nagar","Nirman Vihar",
			"Preet Vihar","Karkardooma","Anand Vihar","Kaushambi","Vaishali","Akshardham","Mayur Vihar",
			"Mayur Vihar Extension","New Ashok Nagar","Noida Sector 15","Noida Sector 16","Noida Sector 18",
			"Botanical Garden","Golf Course","Noida City Centre"};

	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		g2.setStroke(new BasicStroke(3));
		int x,y,i;
		g.setColor(Color.BLUE);
		g2.drawLine(700, 370, 255, 370);
		g.setColor(Color.BLACK);
		x=700;
		y=365;
		for(i=1;i<=13;i++)
		{
			x=x-32;
			g.fillOval(x,y,13,13);
		}
		g.fillOval(x-35,y,13,13);
		g.setColor(Color.BLUE);
		g2.drawLine(249, 373, 115, 450);
		g.setColor(Color.BLACK);
		x=245;
		y=360;
		for(i=1;i<=6;i++)
		{
			x=x-20;
			y=y+12;
			g.fillOval(x,y,13,13);
		}
		g.fillOval(x-20,y+15,13,13);
		g.setColor(Color.BLUE);
		g2.drawLine(113, 452, 285, 535);
		g.setColor(Color.BLACK);
		x=115;
		y=451;
		for(i=1;i<=7;i++)
		{
			x=x+23;
			y=y+11;
			g.fillOval(x,y,13,13);
		}
		g.setColor(Color.BLUE);
		g2.drawLine(704, 372, 775, 405);
		g.setColor(Color.BLACK);
		x=702;
		y=367;
		for(i=1;i<=4;i++)
		{
			x=x+16;
			y=y+8;
			g.fillOval(x,y,13,13);
		}
		g.setColor(Color.BLUE);
		g2.drawLine(777, 406, 989, 406);
		g.setColor(Color.BLACK);
		x=777;
		y=400;
		for(i=1;i<=8;i++)
		{
			x=x+26;
			g.fillOval(x,y,13,13);
		}
		g.setColor(Color.BLUE);
		g2.drawLine(822, 408, 979, 510);
		g2.drawLine(979, 510, 1059, 510);
		g.setColor(Color.BLACK);
		x=830;
		y=410;
		for(i=1;i<=7;i++)
		{
			x=x+20;
			y=y+13;
			g.fillOval(x,y,13,13);
		}
		x=970;
		y=503;
		for(i=1;i<=3;i++)
		{
			x=x+30;
			g.fillOval(x,y,13,13);
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