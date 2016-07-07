class A
{
	static void calc(double x)
	{
		System.out.println("Square of the given value: "+(x*x));
	}
}
class B extends A
{
	static void calc(double x)
	{
		double y=5;
		System.out.println("Area of the rectangle: "+ (x*y));
	}
}
public class DynamicPoly
{
	public static void main(String args[])
	{
		A a=new B();
		a.calc(5);
		B b = new B();
		b.calc(6);
	}
}
