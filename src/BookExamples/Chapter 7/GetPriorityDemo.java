class Test implements Runnable
{
	public void run() {
      System.out.println("Priority of Current thread="+Thread.currentThread().getPriority());

	}
}
public class GetPriorityDemo
 {
	public static void main(String arg[])
	{
		Test t=new Test();
		Thread t1=new Thread(t);
		t1.start();   
	}
}
