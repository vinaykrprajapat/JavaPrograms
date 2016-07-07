import java.awt.*;
import java.applet.*;
/*
<applet code="AppletThread" width=500 height=100>
</applet>
*/
public class AppletThread extends Applet implements Runnable
{
	String mssage = " Welcome to Kogent Learning Solutions… ";
	Thread th;
	boolean flag;
	// Initialize th thread to null.
	public void init()
	{
		th = null;
	}
	// Start th thread
	public void start()
	{
		th = new Thread(this);
		flag = false;
		th.start();
	}
	// run the thread
	public void run()
	{
		char ch;
		// Display message
		for( ; ; )
		{
			try
			{
				repaint();
				Thread.sleep(250);
				ch = mssage.charAt(0);
				mssage = mssage.substring(1, mssage.length());
				mssage += ch;
				if(flag)
				break;
			} catch(InterruptedException exc) {}
		}
	}
	// Pause the message.
	public void stop()
	{
		flag = true;
		th = null;
	}
	// Display the message.
	public void paint(Graphics g)
	{
		g.drawString(mssage, 70, 40);
	}
}
