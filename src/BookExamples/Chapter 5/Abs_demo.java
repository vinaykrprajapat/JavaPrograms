abstract class Abs_super
{
 	abstract public void display();
}
class Abs_demo extends Abs_super
{
 	public void display()
 	{
 		System.out.println("Executing abstract method");
 	}
 	public static void main(String s[])
 	{
 		Abs_demo obj = new Abs_demo();
 		obj.display();
 		System.out.println("Abstract Demo Successful");
 	}
}
