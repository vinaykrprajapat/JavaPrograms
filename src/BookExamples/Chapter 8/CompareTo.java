public class CompareTo{
	public static void main(String args[]) {
		String str = "your";
		int b = str.compareTo("you");
		System.out.println("The compareTo returns:" + b);
		int c = str.compareToIgnoreCase("your");
		System.out.println("The compareToIgnoreCase returns:" + c);
	}
}
