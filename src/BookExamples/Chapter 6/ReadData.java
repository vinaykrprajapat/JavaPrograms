import java.io.*;
class ReadData {
	public static void main(String [] args) {
		try {
			int ch;
			 //variable declaration
			FileReader fr = null; 	
			fr = new FileReader("filereadwrite.txt");
			//check if file exists or not
			while((ch=fr.read()) != -1)
			 //read from FileReader till the end of file
			System.out.print((char)ch);
			fr.close();
			//close the file
		}
		catch(FileNotFoundException fe)
		{
		System.out.println("File not found"+fe.toString());
		}
		catch(IOException e) {
		System.out.println("IOException : "+e.toString());
		}
	}
}
