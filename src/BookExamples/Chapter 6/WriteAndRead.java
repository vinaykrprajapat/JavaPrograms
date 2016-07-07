import java.io.*;
class WriteAndRead 
{
	public static void main (String [] args) 
        {
	try { 
		// an exception may be thrown
		boolean bl = false;
		File file = new File("MyFile.txt");
			// creates an object only
		System.out.println (file.exists ());
			// looks for a actual file
		bl = file.createNewFile ();
			// may create a file
		System.out.println (bl);
			 // shows the value that is returned by createNewFile () method
		System.out.println (file.exists ());
			// shows the existence of file
	} 
	catch (IOException e) { }
	}
}
