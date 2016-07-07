public class StartEnd{
	public static void main(String args[]) {
		String str = "silly silly things cannot disturb me";
		boolean b = str.startsWith("silly");
		System.out.println("The startsWith() method  returns: " + b);
		boolean c = str.endsWith("me");
		System.out.println("The endsWith() method returns: " + c);
	}
}
