package metro10068;
import java.awt.*;
import java.util.*;
import javax.swing.*;
public class metros_10068 extends JComponent {
	public void add(metroR_10068 m)
	   {
	      metrosR.add(m);
	   }
	public void add(metroY_10068 m)
	{
		metrosY.add(m);
	}
	public void add(metroB_10068 m)
	   {
	      metrosB.add(m);
	   }
	public void add(metroO_10068 m)
	{
		metrosO.add(m);
	}
	public void add(metroV_10068 m)
	   {
	      metrosV.add(m);
	   }
	public void add(metroG_10068 m)
	{
		metrosG.add(m);
	}

	public void paintComponent(Graphics g)
	   {
	      Graphics2D g2 = (Graphics2D) g;
	      for (metroR_10068 m : metrosR)
	      {
	         g2.fill(m.getShape());
	      }
	      for (metroY_10068 m : metrosY)
	      {
	         g2.fill(m.getShape());
	      }
	      for (metroB_10068 m : metrosB)
	      {
	         g2.fill(m.getShape());
	      }
	      for (metroO_10068 m : metrosO)
	      {
	         g2.fill(m.getShape());
	      }
	      for (metroV_10068 m : metrosV)
	      {
	         g2.fill(m.getShape());
	      }
	      for (metroG_10068 m : metrosG)
	      {
	         g2.fill(m.getShape());
	      }
	  }
	   private ArrayList<metroR_10068> metrosR = new ArrayList<metroR_10068>();
	   private ArrayList<metroY_10068> metrosY = new ArrayList<metroY_10068>();
	   private ArrayList<metroB_10068> metrosB = new ArrayList<metroB_10068>();
	   private ArrayList<metroO_10068> metrosO = new ArrayList<metroO_10068>();
	   private ArrayList<metroV_10068> metrosV = new ArrayList<metroV_10068>();
	   private ArrayList<metroG_10068> metrosG = new ArrayList<metroG_10068>();
}
