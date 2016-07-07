class ParamConstructorDemo
{
	int x, y;
	ParamConstructorDemo (int a, int b) // parameterized constructor
 {
		x=a;
		y=b;
	}
	public void mul()//method to calculate the product of two numbers 
	{
		int m=x*y;
		System.out.println ("Value after multiplication of two numbers is" + m);
	}
	public static void main (String args[])
	{
		ParamConstructorDemo chk = new ParamConstructorDemo (12,5);
		ParamConstructorDemo chk1 = new ParamConstructorDemo (15,5);
		//invoking mul method 
		chk.mul ();
		chk1.mul ();
	}
}
