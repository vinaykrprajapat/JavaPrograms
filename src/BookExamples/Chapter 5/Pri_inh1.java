class MySuperPublic {
 	private String name = "User";
}
class MySubPublic extends MySuperPublic
{
 	public void displayName()
 	{
 		System.out.println("Your name is :" + name);
 	}
}
public class Pri_inh1
{
	public static void main(String[] args)
	{
		MySubPublic c = new MySubPublic();
		c.displayName();
	}
}
