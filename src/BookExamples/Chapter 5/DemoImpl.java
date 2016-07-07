interface Super
{
 	public void mesgfromSuper();
}
interface Sub extends Super
{
 	public void mesgfromSub();
}
class Demo implements Sub
{
 	public void mesgfromSuper()
 	{
 		System.out.println("Executing Super Interface");
 	}
 	public void mesgfromSub()
 	{
 		System.out.println("Now Executing Sub Interface");
 	}
}
public class DemoImpl
{
 	public static void main(String s[])
 	{
 		Demo obj = new Demo();
 		System.out.println("Extending Interfaces:");
 		obj.mesgfromSuper();
 		obj.mesgfromSub();
 	}
}
