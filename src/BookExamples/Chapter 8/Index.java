public class Index{
	public static void main(String args[]) {
		String str = "Hello Java";
		int b = str.indexOf('h');
		System.out.println("The index of h in Hello Java is: " + b);
		int c = str.lastIndexOf("Java");
		System.out.println("The last index of Java in Hello Java is: " +c);
		int d = str.indexOf('a',5);
		System.out.println("The index of  a in Hello Java from the 5th index is: " + d);
		int e = str.lastIndexOf("ello",5);
		System.out.println("The last index of ello in Hello Java from the 5th index is: " + e);
	}
}
