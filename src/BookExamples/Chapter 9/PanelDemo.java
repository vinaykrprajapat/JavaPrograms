import java.awt.*;

import java.awt.event.*;

public class PanelDemo extends Frame
{
	static Panel panelobject;
	Button b1, b2;
	PanelDemo()
	{
		panelobject =new Panel();
		b1 =new Button("Button1");
		b2 =new Button("Button2");
		panelobject.add(b1);
		panelobject.add(b2);
		addWindowListener (new WindowAdapter()
		{
			public void windowClosing (WindowEvent e)
			{
				System.exit (0);
			}
		});
	}

	public static void main(String agrs[])
	{
		PanelDemo f =new PanelDemo();
		f.setVisible(true);
		f.setSize(300,300);
		f.add(panelobject); // adding panel object in frame window 
	}
}
