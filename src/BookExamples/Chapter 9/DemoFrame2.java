import java.awt.*;

class DemoFrame2 extends Frame
{
	DemoFrame2(String str)
	{ 
		super(str);
	}
	public static void main(String args[])
	{
		DemoFrame2 f = new DemoFrame2("This is a Frame window");
		f.setSize (300,300);
		f.setVisible (true);
	}
}
