import java.io.*;
public class ExecDemo 
{
 	public static void main(String args[]) throws IOException
 	{  
 		Runtime run = Runtime.getRuntime ();
 		run. exec ("C:\\Windows\\Explorer.exe");
 	}
}
