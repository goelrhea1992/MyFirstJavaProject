package metro10068;

import java.awt.Component;

public class MetroRunnable_10068 implements Runnable{
	int flagR=0;
	int flagY=0;
	int flagB=0;
	int flagG =0;
	int flagV =0;
	int flagO =0;

			public MetroRunnable_10068(metroR_10068 aMetro, Component aComponent)
			{
				  metror = aMetro;
	     	      component = aComponent;
	     	      flagR=1;
			}
		   public MetroRunnable_10068(metroY_10068 aMetroY,Component aComponent)
		   {
			      metroy = aMetroY;
			      component = aComponent;
			      flagY=1;
		   }
		   public MetroRunnable_10068(metroB_10068 aMetroB,Component aComponent)
		   {
			      metrob = aMetroB;
			      component = aComponent;
			      flagB=1;

		   }public MetroRunnable_10068(metroO_10068 aMetroO,Component aComponent)
		   {
			      metroo = aMetroO;
			      component = aComponent;
			      flagO=1;

		   }public MetroRunnable_10068(metroV_10068 aMetroV,Component aComponent)
		   {
			      metrov = aMetroV;
			      component = aComponent;
			      flagV=1;

		   }public MetroRunnable_10068(metroG_10068 aMetroG,Component aComponent)
		   {
			      metrog = aMetroG;
			      component = aComponent;
			      flagG=1;
		   }
		public void run() {
			try
		      {
				while(true)
		         {
					if(flagR==1)
		            metror.move();
					else if(flagY==1)
		            metroy.move();
					else if(flagO==1)
		            metroo.move();
					else if(flagG==1)
		            metrog.move();
					else if(flagV==1)
		            metrov.move();
					else if(flagB==1)
		            metrob.move();
		           
		            component.repaint();
		            Thread.sleep(DELAY);
		         }
		      }
		      catch (InterruptedException e)
		      {
		      }
		}
		private metroR_10068 metror;
		private metroY_10068 metroy;
		private metroB_10068 metrob;
		private metroV_10068 metrov;
		private metroG_10068 metrog;
		private metroO_10068 metroo;
   	    private Component component;
		public static final int STEPS = 1000;
		public static final int DELAY = 10;
}

