import java.io.*;
class DemoThrow {
	public static void chk_throw() {
		try { 
			// Creating object of IOException 
			throw new IOException("Explicit IOException"); 
		}
		catch (IOException ne) {
			System.out.println("Exception is " + ne);
		}
	}
	public static void main (String args[]) {
		DemoThrow.chk_throw();
	}
}
