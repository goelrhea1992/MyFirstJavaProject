package metro10068;
import javax.swing.JComponent;
import javax.swing.JOptionPane;

import java.awt.event.*;

public class MouseComponent10068 extends JComponent
{
	   public MouseComponent10068()
	   {
	       this.addMouseListener(new MouseHandler());
	   }
	   private class MouseHandler extends MouseAdapter
	   {
	      public void mousePressed(MouseEvent event)
	      {
	    	  int i,flag=0;
	    	  //orange
	    	  OrangeLine10068 orangeS = new OrangeLine10068();
		      String[] orangeStations = orangeS.getStations();
		      int[] orangeStationX = orangeS.getStationX();
		      int[] orangeStationY = orangeS.getStationY();
		      int[] orangeNoOfPlatforms = orangeS.getNoOfPlatforms();
		      if(flag==0)
		      {
		    	  for(i=0;i<orangeStations.length;i++)
		    	  {
		    		  if(event.getX()<=orangeStationX[i]+15 && event.getX()>=orangeStationX[i]-5 && event.getY()<=orangeStationY[i]+10 && event.getY()>=orangeStationY[i]-5)
		    		  {
		    			  flag=1;
		    			  JOptionPane.showMessageDialog(MouseComponent10068.this, orangeStations[i]+"\nNo. Of Platforms: "+orangeNoOfPlatforms[i]);
		    		  }
		    	  }
		      }
		      //red
		      RedLine10068 redS = new RedLine10068();
		      String[] redStations = redS.getStations();
		      int[] redStationX = redS.getStationX();
		      int[] redStationY = redS.getStationY();
		      int[] redNoOfPlatforms = redS.getNoOfPlatforms();
		      if(flag==0)
		      {
		    	  for(i=0;i<redStations.length;i++)
		    	  {
		    		  if(event.getX()<=redStationX[i]+15 && event.getX()>=redStationX[i]-5 && event.getY()<=redStationY[i]+10 && event.getY()>=redStationY[i]-5)
		    		  {
		    			  flag=1;
		    			  JOptionPane.showMessageDialog(MouseComponent10068.this, redStations[i]+"\nNo. Of Platforms: "+redNoOfPlatforms[i]);
		    		  }
		    	  }
		      }
		      //yellow
		      YellowLine10068 yellowS = new YellowLine10068();
		      String[] yellowStations = yellowS.getStations();
		      int[] yellowStationX = yellowS.getStationX();
		      int[] yellowStationY = yellowS.getStationY();
		      int[] yellowNoOfPlatforms = yellowS.getNoOfPlatforms();
		      if(flag==0)
		      {
		    	  for(i=0;i<yellowStations.length;i++)
		    	  {
		    		  if(event.getX()<=yellowStationX[i]+15 && event.getX()>=yellowStationX[i]-5 && event.getY()<=yellowStationY[i]+10 && event.getY()>=yellowStationY[i]-5)
		    		  {
		    			  flag=1;
		    			  JOptionPane.showMessageDialog(MouseComponent10068.this, yellowStations[i]+"\nNo. Of Platforms: "+yellowNoOfPlatforms[i]);
		    		  }
		    	  }
		      
		      }
		      //green
		      GreenLine10068 greenS = new GreenLine10068();
		      String[] greenStations = greenS.getStations();
		      int[] greenStationX = greenS.getStationX();
		      int[] greenStationY = greenS.getStationY();
		      int[] greenNoOfPlatforms = greenS.getNoOfPlatforms();
		      if(flag==0)
		      {
		    	  for(i=0;i<greenStations.length;i++)
		    	  {
		    		  if(event.getX()<=greenStationX[i]+15 && event.getX()>=greenStationX[i]-5 && event.getY()<=greenStationY[i]+10 && event.getY()>=greenStationY[i]-5)
		    		  {
		    			  flag=1;
		    			  JOptionPane.showMessageDialog(MouseComponent10068.this, greenStations[i]+"\nNo. Of Platforms: "+greenNoOfPlatforms[i]);
		    		  }
		    	  }
		      
		      }
		      //violet
		      VioletLine10068 violetS = new VioletLine10068();
		      String[] violetStations = violetS.getStations();
		      int[] violetStationX = violetS.getStationX();
		      int[] violetStationY = violetS.getStationY();
		      int[] violetNoOfPlatforms = violetS.getNoOfPlatforms();
		      if(flag==0)
		      {
		    	  for(i=0;i<violetStations.length;i++)
		    	  {
		    		  if(event.getX()<=violetStationX[i]+15 && event.getX()>=violetStationX[i]-5 && event.getY()<=violetStationY[i]+10 && event.getY()>=violetStationY[i]-5)
		    		  {
		    			  flag=1;
		    			  JOptionPane.showMessageDialog(MouseComponent10068.this, violetStations[i]+"\nNo. Of Platforms: "+violetNoOfPlatforms[i]);
		    		  }
		    	  }
		      
		      }
		      //blue
		      BlueLine10068 blueS = new BlueLine10068();
		      String[] blueStations = blueS.getStations();
		      int[] blueStationX = blueS.getStationX();
		      int[] blueStationY = blueS.getStationY();
		      int[] blueNoOfPlatforms = blueS.getNoOfPlatforms();
		      if(flag==0)
		      {
		    	  for(i=0;i<blueStations.length;i++)
		    	  {
		    		  if(event.getX()<=blueStationX[i]+15 && event.getX()>=blueStationX[i]-5 && event.getY()<=blueStationY[i]+10 && event.getY()>=blueStationY[i]-5)
		    		  {
		    			  flag=1;
		    			  JOptionPane.showMessageDialog(MouseComponent10068.this, blueStations[i]+"\nNo. Of Platforms: "+blueNoOfPlatforms[i]);
		    		  }
		    	  }
		      
		      }
	      }
	   }
}
