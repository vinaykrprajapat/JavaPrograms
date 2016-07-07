public class Equal{
 	public static void main(String args[]) {
		String str = "Java is an Object oriented language";
		String str1 = "JAVA IS AN OBJECT ORIENTED LANGUAGE";
		boolean b1 = str.equals(str1);
		boolean b2 = str.equalsIgnoreCase(str1); 
		System.out.println("The equals method returns:  " + b1);
		System.out.println("The equalsIgnoreCase method returns:  " + b2);
	}
}
