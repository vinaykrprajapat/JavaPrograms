class DemoNestedTry
{
	public static void main (String args[])
	{
		try // first try block 
		{
			int j, x=10, y;
			int k[]= new int[10];
			for (int i=0; i<args.length; i++)
			{
				System.out.println("Value:" + args[i]);
			}
			try // second try block inside first try block 
			{
				for (j=0; j<args.length; j++)
				{
					k[j]= Integer.parseInt(args[j]);
					y=x/k[j];
					System.out.println(y );
				}
			}
			catch (ArithmeticException ex) // catch block of second try 
			{
				System.out.println("Exception is" + ex);
System.out.println("Value is divided by zero, which is not allowed");
			}
		}
		catch(Exception ex1) // catch block of first try 
		{
			System.out.println("Exception is" + ex1);
		}
	}
}
