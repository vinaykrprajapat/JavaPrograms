class Super_class
{
 	final void display()
 	{
 		System.out.println("Invoking superclass method");
 	}
}
class Sub_class extends Super_class
{
 	public void display()
 	{
 		System.out.println("Invoking subclass method");
 	}
 	public static void main(String s[])
 	{
 		System.out.println("Invoking members ");
 		Sub_class obj = new Sub_class();
 		obj.display();
 	}
}
