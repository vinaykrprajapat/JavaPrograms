class DefaultConstructorDemo
{
	int x, y;
	DefaultConstructorDemo () // simple constructor 
	{
		x=10;
		y=5;
	}
 	public void mul()
	{
		int m=x*y;
		System.out.println ("Value after multiplication of two numbers is=" + m);
	}
	public static void main (String args[])
	{
		DefaultConstructorDemo chk = new DefaultConstructorDemo ();
		chk.mul ();
	}
}
