package metro10068;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


class ViewMetroLine_10068 extends JPanel implements ActionListener {
	metros_10068 comp = new metros_10068();
	public ViewMetroLine_10068()
	{
		OverlayLayout layout=new OverlayLayout(this);
		setLayout(layout);
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		int screenH = screenSize.height;
		int screenW = screenSize.width;
		setSize(screenW,screenH);
		String[] options = {"Add a Train","Red","Green","Blue","Yellow","Orange","Violet"};
		JComboBox cb = new JComboBox(options);
		add(cb);
		cb.setName("Add a Train");
		cb.setMaximumSize(new Dimension(100,25));
		cb.setAlignmentX(0.5f);
		cb.setAlignmentY(0.05f);
		cb.addActionListener(this);
		RedLine10068 redLine = new RedLine10068();
		add(redLine);
		YellowLine10068 yellowLine = new YellowLine10068();
		add(yellowLine);
		GreenLine10068 greenLine = new GreenLine10068();
		add(greenLine);
		BlueLine10068 blueLine = new BlueLine10068();
		add(blueLine);
		OrangeLine10068 orangeLine = new OrangeLine10068();
		add(orangeLine);
		VioletLine10068 violetLine = new VioletLine10068();
		add(violetLine);
		MouseComponent10068 c = new MouseComponent10068();
		add(c);
		add(comp);
		setVisible(true);
	}
		
	public void addMetroR()
	{
		metroR_10068 mR = new metroR_10068();
		comp.add(mR);
	    Runnable r = new MetroRunnable_10068(mR,this);
	    Thread t = new Thread(r);
		t.start();
	}
	public void addMetroY()
	{
		metroY_10068 mY = new metroY_10068();
		comp.add(mY);
		Runnable r = new MetroRunnable_10068(mY,this);
		Thread t = new Thread(r);
		t.start();
	}
	public void addMetroG()
	{
		metroG_10068 mG = new metroG_10068();
		comp.add(mG);
		Runnable r = new MetroRunnable_10068(mG,this);
		Thread t = new Thread(r);
		t.start();
	}
	public void addMetroB()
	   {
		 metroB_10068 mB = new metroB_10068();
	     comp.add(mB);
	     Runnable r = new MetroRunnable_10068(mB,this);
	      Thread t = new Thread(r);
	      t.start();
	   }
	public void addMetroO()
	   {
		 metroO_10068 mO = new metroO_10068();
	     comp.add(mO);
	     Runnable r = new MetroRunnable_10068(mO,this);
	      Thread t = new Thread(r);
	      t.start();
	   }
	public void addMetroV()
	  {
		 metroV_10068 mV = new metroV_10068();
	     comp.add(mV);
	     Runnable r = new MetroRunnable_10068(mV,this);
	      Thread t = new Thread(r);
	      t.start();
	   }
	public void actionPerformed(ActionEvent e) 
	{
		String str =(String) ((JComboBox) e.getSource()).getSelectedItem();
			if(str.equals("Red"))
				addMetroR();
			else if(str.equals("Yellow"))
				addMetroY();
			else if(str.equals("Green"))
				addMetroG();
			else if(str.equals("Blue"))
				addMetroB();
			else if(str.equals("Orange"))
				addMetroO();
			else if(str.equals("Violet"))
				addMetroV();
	}

}
