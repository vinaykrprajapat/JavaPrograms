import java.util.Random;
public class RandomDemo
{
	static int cnt;
	static int number;
	static Random rndnum;
	public static void main(String ar[])
	{
		rndnum=new Random();
		for (cnt=1; cnt<5; cnt++)
		{
			number=rndnum.nextInt();
			System.out.print ("Number Count= "+ cnt);
			System.out.println("Next Random number= "+ number);
		}
	}
}
