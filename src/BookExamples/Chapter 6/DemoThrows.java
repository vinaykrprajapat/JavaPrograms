import java.io.*;
class ABC
{
	public void disp() throws IOException
	{
		System.out.println("It is a super class");
	}	
}
class XYZ extends ABC
{
	public void disp() throws IOException
	{
		System.out.println("It is a super class");
	}	
}
class DemoThrows extends ABC
{
	public void disp() throws EOFException, FileNotFoundException
	{	
		System.out.println("It is a sub class named  DemoThrows ");
	}
	public static void main (String args[]) throws IOException
	{
		DemoThrows obj = new DemoThrows ();
		obj.disp();	
	}
}
