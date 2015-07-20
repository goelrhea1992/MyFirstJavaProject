package metro10068;
import javax.swing.*;
import java.awt.*;

public class RedLine10068 extends JComponent{
	private int[] stationX = {150,180,210,240,270,300,330,360,390,439,504,569,634,699,764,829,894,959,1024,1089,1154};
	private int[] stationY = {110,128,146,164,182,200,218,236,254,280,280,280,280,280,280,280,280,280,280,280};
	private int[] noOfPlatforms = {2,2,2,2,2,2,2,2,4,2,2,2,2,4,2,2,2,2,2,2};
	private String[] stations = {"Rithala","Rohini West","Rohini East","Pitampura","Kohat Enclave","Netaji Subhash Place",
			"Keshav Puram","Kanhaiya Nagar","Inderlok","Shastri Nagar","Pratap Nagar","Pul Bangash","Tis Hazari",
			"Kashmere Gate","Shastri Park","Seelampur","Welcome","GTB Hospital","Jhilmil","Dilshad Garden"};
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		g.setColor(Color.RED);
		g2.setStroke(new BasicStroke(3));
		g2.drawLine(150, 110, 439, 284);
		int i,x, y;
		x=150;
		y=110;
		g.setColor(Color.BLACK);
		g.fillOval(x,y,13,13);
		for(i=1;i<=8;i++)
		{
			x=x+30;
			y=y+18;
			g.fillOval(x,y,13,13);
		}
		g.setColor(Color.RED);
		g2.drawLine(439,284,1089,284);
		x = 439;
		y = 280;
		g.setColor(Color.BLACK);
		for(i=1;i<=11;i++)
		{
			g.fillOval(x,y,13,13);
			x=x+65;
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
