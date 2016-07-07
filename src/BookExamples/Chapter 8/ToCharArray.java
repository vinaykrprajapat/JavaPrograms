public class ToCharArray {
	public static void main(String args[]) {
		String str = "Silly Silly Things cannot Disturb me ";
		char ch[] = new char[str.length()];
 		ch = str.toCharArray();
		System.out.print(" Executing toCharArray() method: ");
		System.out.print(ch);
	}
}
