class Test implements Runnable
{
	public void run()
	{
		for(int i=1; i<=5;i++)
		{
			System.out.println("The current value= "+i);
		}
		System.out.println("Child Terminated");
	}
}
public class JoinDemo
{
	public static void main(String arg[])
	{
		Test t=new Test();
		Thread t1=new Thread(t);
		t1.start(); 
		try
		{
			t1.join();
		}catch(InterruptedException e){}
		System.out.println("Main Terminated");
	}
}
