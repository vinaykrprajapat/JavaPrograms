import java.io.*;
class Search {
	public static void main(String [] args) {
		String[] files = new String[100];
		File searchFile1 = new File("Company");
		System.out.println("The existence of Company directory is: "+searchFile1.isDirectory()); 
		File searchFile2 = new File("Kogent");
		System.out.println("The existence of Kogent directory is:"+ searchFile2.isDirectory()); 
		files = searchFile2.list();     // create the list
		for(String fnd : files)         // iterate through it
		System.out.println("File : "+fnd);
	}
}
