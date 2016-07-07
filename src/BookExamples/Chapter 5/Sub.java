class SuperDemo
{
 	int val_1 = 100;
}
class Sub extends SuperDemo
{
 	int val_1 = 200;
 	public void show()
 	{
 		System.out.println("From superclass:" + super.val_1); 
 		System.out.println("From subclass:" + val_1); 
 	}
 	public static void main(String s[])
 	{
 		System.out.println("Using super:"); 
 		Sub ob = new Sub();
 		ob.show();
 	}
}
