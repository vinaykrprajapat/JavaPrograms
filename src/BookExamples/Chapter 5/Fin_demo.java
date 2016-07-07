final class Fin_sup
{
 	final void display()
 	{
 		System.out.println("Invoking superclass method");
 	}
}
class Fin_demo extends Fin_sup
{
 	public static void main(String s[])
 	{
 		System.out.println("Invoking members ");
 		Fin_demo obj = new Fin_demo();
 		obj.display();
 	}
}
