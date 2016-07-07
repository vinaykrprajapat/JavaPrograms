public class ToRegion{
	public static void main(String args[]) {
		String str = "Hello Java ";
		String str1 = "HELLO HI HOW ARE You?";
		boolean b = str.regionMatches(4, str1, 7,2);
		System.out.println("The result of comparison returns: " + b);
		boolean c= str.regionMatches(true,4, str1, 7,2);
		System.out.println("The result of comparison returns: " + c);
	}
}
