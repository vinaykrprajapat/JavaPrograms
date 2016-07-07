class Test implements Runnable
{
	public void run()
	{
		for(int i=1; i<=5;i++)
		{
			System.out.println("The current value= "+i);
			try
			{
				Thread.sleep(1000);
			} catch (InterruptedException E)
			{
				System.out.println ("Thread Interrupted");
			}
		}
	}
}


public class SleepDemo
{
	public static void main(String arg[])
	{
		Test t=new Test();
		Thread t1=new Thread(t);
		t1.start();   
	}
}
