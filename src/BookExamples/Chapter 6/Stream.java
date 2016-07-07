import java.io.*;
class Stream
{
	public static void main(String [] args) 
	{
		try
		{
			//take a string
			String str="This is a book on Java and Java EE.";   
			//attach file to FileWriter 
			FileWriter fw = new FileWriter("filereadwrite.txt");
			//read character wise from string and write into FileWriter
			for(int i=0; i<str.length(); i++)
				fw.write(str.charAt(i));
				// flush before closing
			fw.flush(); 
			//close the file
			fw.close();
		}
		catch(IOException e)
		{
		System.out.println("IOException : "+e.toString());
		}
	}
}
