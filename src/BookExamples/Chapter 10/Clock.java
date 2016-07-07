import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Label;
import java.text.DateFormat;
import java.util.Date;
/*
<applet code="Clock.class"
	width=200
	height=100>
</applet>
*/
public class Clock extends Applet implements Runnable
{
	Label showTime; 
	DateFormat timeFormat; 
	Thread timerTh; 
	volatile boolean running; 

	public void init()
	{
		showTime = new Label();
		showTime.setFont(new Font("helvetica", Font.BOLD, 20));
		showTime.setAlignment(Label.CENTER);
		setLayout(new BorderLayout());
		add(showTime, BorderLayout.CENTER);
		timeFormat = DateFormat.getTimeInstance(DateFormat.MEDIUM);
	}
	public void start()
	{
		running = true; 
		if (timerTh == null)
		{ 
			timerTh = new Thread(this); 
			timerTh.start(); 
		}
	}
	public void run()
	{
		while (running)
		{ 
			showTime.setText(timeFormat.format(new Date()));
			try
			{
				Thread.sleep(1000);
			}
			catch (InterruptedException e)
			{ }
		}
		timerTh = null;
	}
	public void stop()
	{
		running = false;
	}
}
