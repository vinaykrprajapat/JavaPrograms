class StaticPoly
{
	void product(int x, int y)
	{
		System.out.println("Product of two numbers:"+(x*y));
	}
	void product(int x, int y,  int z)
	{
		System.out.println("Product of three numbers:"+(x*y*z));
	}
	public static void main(String args[])
	{
		StaticPoly obj=new StaticPoly();
		obj.product(20,10);
		obj.product(5,6,7);
	}
}
