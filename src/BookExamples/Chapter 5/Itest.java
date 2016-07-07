interface Set
{
 	int red = 1;
 	int blue = 2;
 	int green = 3;
}
class SetImpl implements Set
{
 	void select(int colour)
 	{
 		switch(colour)
 		{
 			case red:  System.out.println("RED IS SELECTED");
 			break;
 			case blue: System.out.println("BLUE IS SELECTED");
 			break;
 			case green: System.out.println("GREEN IS SELECTED");
 			break;
 		}
 	}
}
public class Itest
{
 	public static void main(String s[])
 	{
 		SetImpl ob = new SetImpl();
 		ob.select(1);
 		ob.select(2);
 		ob.select(3);
 	}
}
