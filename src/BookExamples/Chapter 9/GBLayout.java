import java.awt.*;

import java.awt.event.*;

class GBLayout extends Frame
{
	Button b1, b2, b3, b4;
	GridBagConstraints cons;
	GridBagLayout gbag;
	GBLayout ()
	{
	gbag = new GridBagLayout(); 
	this.setLayout (gbag); 
	cons = new GridBagConstraints();	
      b1 = new Button ("A");
	b2 = new Button ("B");
	b3 = new Button ("C");
	b4 = new Button ("D");
     cons.fill = GridBagConstraints.HORIZONTAL; // using the horizontal filling
	cons.gridx = 0; // Setting x,y coordinate to display first button 
	cons.gridy = 0;

	cons.weightx = 1; // resizing the component when the frame is resized 
	gbag.setConstraints (b1, cons);//setting the above constraints to button 

	cons.gridx = 1; // Setting x,y coordinate to display second button 
	cons.gridy = 0;
	gbag.setConstraints (b2, cons);//setting the above constraints to button 

	cons.gridx = 2; // Setting x,y coordinate to display third button 
	cons.gridy = 0;
	gbag.setConstraints (b3, cons);//setting the above constraints to button 
	cons.gridx = 1; // Setting x,y coordinate to display third button 
	cons.gridy = 2;
	cons.ipadx = 100; // Setting 50 px for ipadx 
	cons.ipady = 70;// Setting 100 px for ipady 
	gbag.setConstraints (b4, cons);//setting the above constraints to button 

	this.add (b1);
	this.add (b2);
	this.add (b3);
	this.add (b4);

	addWindowListener (new WindowAdapter() 
	{
		public void windowClosing (WindowEvent e)
		{
			System.exit (0);
		}
	});
	}

	public static void main (String args [])
	{
		GBLayout gb = new GBLayout();
		gb.setTitle ("GridBag Layout");// setting frame title 
		gb.setSize (300,300);// setting frame size 
		gb.setVisible (true);

	}
}
