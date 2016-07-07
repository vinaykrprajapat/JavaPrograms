class Test implements Runnable
{
	public void run()
	{
 	System.out.println("The Current thread"+Thread.currentThread().getName());
	}
}
public class MultipleThreadDemo
{
	public static void main(String arg[]) 
	{
		Test t=new Test();
		Thread t1=new Thread(t);
		Thread t2=new Thread(t);
		Thread t3=new Thread(t);
		t1.start();   
		t2.start();
		t3.start();
	}
}
