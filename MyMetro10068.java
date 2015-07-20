package metro10068;


import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class MyMetro10068 extends JFrame{
	
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Metro Map");
		Container contentPane = frame.getContentPane();
		contentPane.setLayout(new BorderLayout());
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		int screenH = screenSize.height;
		int screenW = screenSize.width;
		frame.setSize(screenW,screenH);
		frame.add(new ViewMetroLine_10068());
		frame.setVisible(true);
	}
}
