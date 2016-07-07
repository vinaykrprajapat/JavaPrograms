class MyThread extends Thread 
{
	String msg="Hi, I am from MyThread";
	public void run() {
		synchronized(this)
		{
			msg=msg+ "class";
			notify();
		}
	}
}
class WaitNotifyDemo extends Thread 
{
	public static void main(String arg[]) 
 	{
		MyThread thrd=new MyThread();
		thrd.start();
		synchronized(thrd)
		{
			try {
			 	System.out.println("Hi, I am waiting for Thread thrd to complete");
				thrd.wait();
			}catch(InterruptedException E){}
			System.out.println(thrd.msg);
		}
	}
}
