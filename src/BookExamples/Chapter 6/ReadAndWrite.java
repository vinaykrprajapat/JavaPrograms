import java.io.*;
class ReadAndWrite {
	public static void main(String [] args) {
		try { 
			char[] in = new char[50];
			 // to store input
			int size = 0;
			File file=new File("MyFile2.txt");
			FileWriter fw = new FileWriter(file);
			 // create an actual file & a FileWriter obj
			fw.write("Line 1:123456789\nLine2:abcdefghijk\n");
			// write characters to the file
			fw.flush();
			// flush before closing
			fw.close();
			// close file when done
			FileReader fr = new FileReader(file);
			 // create a FileReader object
			size = fr.read(in);
			 // read the whole file!
			System.out.print(size + " ");
			// how many bytes read
			for(char c : in)
			 // print the array
			System.out.print(c);
			fr.close();
			// again, always close
		}
		catch(IOException e) { }
	}
}
