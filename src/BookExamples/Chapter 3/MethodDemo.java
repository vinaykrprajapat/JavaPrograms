class MethodDemo
{
	void no_para() 
	{
		int j=5;
		int k=6;
		int s= j+k;
	System.out.println("sum of the two numbers in a method without parameters are ="+s);
	}
	public static void main(String args[])
	{ 
		MethodDemo get_sum = new MethodDemo ();
		get_sum.no_para(); //  Invoking  the no_para method
	}
}
