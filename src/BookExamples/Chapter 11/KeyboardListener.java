import java.awt.*; 
import java.awt.event.*;

public class KeyboardListener extends Frame implements KeyListener
{
	TextField myText;
	Label myLabel;
	public KeyboardListener(String s )
	{
		super(s); 
		Panel myPanel =new Panel();
		myLabel = new Label ("Key Listener!" ) ;
		myPanel.add(myLabel);  
		add(myPanel);
		addKeyListener ( this ); 
		setSize ( 200,200 );
		setVisible(true);
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		});
	}
	public void keyTyped ( KeyEvent ke )
	{
		myLabel.setText("Key Typed");
		char youTyped= ke.getKeyChar();
		myLabel.setText("You press: " + youTyped );
	}
	public void keyPressed ( KeyEvent ke)
	{
		myLabel.setText ( "Key Pressed" ) ; 
	}
	public void keyReleased ( KeyEvent ke )
	{
		myLabel.setText( "Key Released" ) ; 
	}
	public static void main (String[]args )
	{
		new KeyboardListener( "KeyListener Tester" ) ; 
	}
}
