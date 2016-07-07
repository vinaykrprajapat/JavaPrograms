public class GetChar {
	public static void main(String args[]) {
		String str ="Silly Silly Things cannot Disturb me ";
		int start_pos = 5;
		int end_pos = 25;
		char ch[] = new char[end_pos-start_pos];
 		str.getChars(start_pos,end_pos,ch,0);
		System.out.print("copied characters are:" );
		System.out.print(ch);
	}
}
