class Enclosing
{
	int outer_num=100;
	void display()
	{
		Nested n=new Nested();
		n.showData();
	}
	class Nested
	{
		void showData()
	{
	System.out.println ("The value stored in the member variable outer_num of inclosing  	class is "+outer_num);
	}
	}
}
class NestedDemo
{
	public static void main(String ar[])
	{
		Enclosing obj=new Enclosing ();
		obj.display ();
	}
}
