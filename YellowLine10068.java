package metro10068;
import javax.swing.*;
import java.awt.*;
public class YellowLine10068 extends JComponent
{
	private int[] stationX = {470,510,550,590,630,670,683,694,699,699,699,699,695,673,651,644,643,642,
			641,640,639,638,637,636,635,606,572,538,504,470,436,402,368,334};
	private int[] stationY = {88,106,124,142,160,178,216,254,281,303,323,343,368,380,392,418,443,468,
			493,518,543,568,593,618,643,645,647,649,651,653,655,657,659,661};
	private int[] noOfPlatforms = {2,2,2,2,2,2,2,2,4,2,2,4,4,2,4,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2};
	
	private String[] stations = {"Jahangirpuri","Adarsh Nagar","Azadpur","Model Town","GTB Nagar","Vishvavidyalaya",
			"Vidhan Sabha","Civil Lines","Kashmere Gate","Chandni Chowk","Chawri Bazaar","New Delhi","Rajiv Chowk",
			"Patel Chowk","Central Secretariat","Udyog Bhawan","Race Course","Jor Bagh","INA","AIIMS","Green Park",
			"Hauz Khas","Sarvpriya Vihar","Malviya Nagar","Saket","Qutab Minar","Chattarpur","Ghitorni","Arjan Garh",
			"Garden Estate","Sikandarpur","DT City Centre","IFFCO Chowk","HUDA City Centre"};
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		int x,y,i;
		g2.setStroke(new BasicStroke(3));
		g.setColor(Color.YELLOW);
		g2.drawLine(470, 88, 680, 187);
		x = 470;
		y = 88;
		g.setColor(Color.BLACK);
		for(i=1;i<=6;i++)
		{
			g.fillOval(x,y,13,13);
			x=x+40;
			y=y+18;
		}
		g.setColor(Color.YELLOW);
		g2.drawLine(682, 189, 704, 281);
		x=683;
		y=216;
		g.setColor(Color.BLACK);
		for(i=1;i<=2;i++)
		{
			g.fillOval(x,y,13,13);
			x=x+11;
			y=y+38;
		}
		x=x-6;
		y=y-11;
		g.fillOval(x,y,13,13);
		g.setColor(Color.YELLOW);
		g2.drawLine(704, 295, 704, 371);
		g.setColor(Color.BLACK);
		x=699;
		y=303;
		for(i=1;i<=3;i++)
		{
			g.fillOval(x,y,13,13);
			y=y+20;
		}
		g.setColor(Color.YELLOW);
		g2.drawLine(700, 371, 650, 400);
		g.setColor(Color.BLACK);
		x=695;
		y=368;
		for(i=1;i<=3;i++)
		{
			g.fillOval(x,y,13,13);
			x=x-22;
			y=y+12;
		}
		g.setColor(Color.YELLOW);
		g2.drawLine(651, 401, 643, 645);
		g.setColor(Color.BLACK);
		x=644;
		y=418;
		for(i=1;i<=10;i++)
		{
			g.fillOval(x,y,13,13);
			x=x-1;
			y=y+25;
		}
		g.setColor(Color.YELLOW);
		g2.drawLine(638, 652, 336, 668);
		g.setColor(Color.BLACK);
		x=640;
		y=643;
		for(i=1;i<=9;i++)
		{
			x=x-34;
			y=y+2;
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