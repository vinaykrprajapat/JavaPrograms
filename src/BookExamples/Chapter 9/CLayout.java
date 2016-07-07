import java.awt.*;

import java.awt.event.*;

class CLayout extends Frame implements ActionListener
{
  Panel cardPanel;        
  Panel p1, p2, p3;  
  Panel mp;                  
  Button first, second, third;   
  CardLayout cardlayout;          
      
CLayout()
{ 
    cardPanel = new Panel();
    cardlayout = new CardLayout();    
    cardPanel.setLayout (cardlayout);
    p1 = new Panel();
    p1.setBackground(Color.blue);
    p2 = new Panel();
    p2.setBackground(Color.yellow);
    p3 = new Panel();
    p3.setBackground(Color.green);
    first = new Button("First");
    first.addActionListener(this);
    second = new Button("Second");
    second.addActionListener(this);
    third = new Button("Third");
    third.addActionListener(this);
    mp = new Panel();  
    mp.add(first);
    mp.add(second);
    mp.add(third);

    this.setLayout(new BorderLayout());
    this.add(mp, BorderLayout.SOUTH);
    this.add(cardPanel, BorderLayout.CENTER);
    cardPanel.add(p1, "First");    
    cardPanel.add(p2, "Second");   
    cardPanel.add(p3, "Third");     
		addWindowListener (new WindowAdapter() 
		{
			public void windowClosing (WindowEvent e)
			{
				System.exit (0);
			}
		});
	}
public void actionPerformed(ActionEvent e)
  {
    if (e.getSource() == first)
      cardlayout.show(cardPanel, "First");
      
    if (e.getSource() == second)
      cardlayout.show(cardPanel, "Second");
      
    if (e.getSource() == third)
      cardlayout.show(cardPanel, "Third");
  }
public static void main (String args []) throws Exception
	{
		CLayout g = new CLayout();
		g.setTitle ("CardLayout");// setting frame title 
		g.setSize (300,300);// setting frame size 
		g.setVisible (true);

	}


}
