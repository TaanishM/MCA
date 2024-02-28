package DepenRel;

import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
class Banner extends Frame implements Runnable {
	String str = "TAANISH";
	Banner() 
	{
		setLayout(null);
		setBackground(Color.cyan);
		setForeground(Color.red);
	}
	public void paint(Graphics g) 
	{
		Font f = new Font("Courier", Font.BOLD, 40);
		g.setFont(f);
		g.drawString(str, 10, 100);
	}
	public void run() 
	{
		for (;;)
		{
				repaint(); // refresh the frame contents
				try 
				{
					Thread.sleep(400);
				} 
				catch (InterruptedException ie)
				{}
					char ch = str.charAt(0);
					str = str.substring(1, str.length());
					str = str + ch;
					System.out.println("str length: " + str.length());
				}
	}
	

	public static void main(String args[]) 
	{
		Banner b = new Banner(); 
		b.setSize(400, 400);
		b.setTitle("Banner");
		b.setVisible(true);
		b.addWindowListener(new WindowAdapter() 
			{
			public void windowClosing(WindowEvent e)
			{
			System.exit(0);
			}
			});
	
	Thread t = new Thread(b);
	t.start();
	}
}