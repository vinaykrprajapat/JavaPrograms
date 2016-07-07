public class ReturnExample
{
	public static void main(String args[])
	{
		int input=Integer.parseInt(args[0]);
		int result=square(input);
		System.out.println(result);
	}
	public static int square(int x)
	{
		return x*x;   
	}
}
