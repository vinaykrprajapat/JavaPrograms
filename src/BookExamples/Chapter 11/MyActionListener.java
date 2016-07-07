import javax.swing.*;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.TextField;
import java.awt.event.*;

public class MyActionListener extends JFrame implements WindowListener, 
ActionListener
{
	TextField text = new TextField(20);
	Button b1;
	private int numOfClicks = 0;
	public static void main(String[] args)
	{

		MyActionListener myWindow = new MyActionListener("Using	ActonListener");
		myWindow.setSize(350,200);
		myWindow.setVisible(true);
	}
	public MyActionListener(String title)
	{
		super(title);
		setLayout(new FlowLayout());
		addWindowListener(this);
		b1 = new Button("Click me");
		add(b1);
		add(text);
		b1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		numOfClicks++;
		text.setText("Button Clicked " + numOfClicks + " times");
	}
	public void windowClosing(WindowEvent we)
	{
		dispose();
		System.exit(0);
	}
	public void windowOpened(WindowEvent we) {}
	public void windowActivated(WindowEvent we) {}
	public void windowIconified(WindowEvent we) {}
	public void windowDeiconified(WindowEvent we) {}
	public void windowDeactivated(WindowEvent we) {}
	public void windowClosed(WindowEvent we) {}
}
