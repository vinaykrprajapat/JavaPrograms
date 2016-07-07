class DemoException_tc {
	public static void main(String args[]) {
		try {
			int x=5;
			int y=0;
			int z=x/y;
			System.out.println("Result of the program is " + z);
		} catch(Exception e) {
		e.printStackTrace ();
		System.out.println("A number cannot be divided by zero " );
		}
	}
}
