class SuperClass
{
 	String name = "Anuj";
 	String desg = "Programmer";
 	public void show()
 	{
 		System.out.println("Name:" + name);
 		System.out.println("Designation:" + desg);
 	}
}
public class SubClass extends SuperClass
{
 	String address = "Pune";
 	public void show()
 	{
 		System.out.println("City:" + address);
 	}

 	public static void main(String s[])
 	{
  		SuperClass obj1 = new SuperClass();
  		SubClass obj2 = new SubClass();
 		System.out.print("Executing Superclass:");
 		obj1.show();
 		obj1 = obj2;
 		obj1.show();
 	}
}
