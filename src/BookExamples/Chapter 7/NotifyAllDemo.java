class MyThread extends Thread
 {
	String msg="Hi, I am from MyThread";
	public void run() {
		synchronized(this) 
		{
			msg=msg+ "class";
			notifyAll();
		}
	}
}
class NotifyAllDemo extends Thread 
{
	public static void main(String ar[]) 
 	{
		MyThread thrd=new MyThread();
		MyThread thrd1=new MyThread();
		thrd.start();
		thrd1.start();
		synchronized(thrd)
		{
			try {
				System.out.println("Hi, I am waiting for Thread thrd to 	complete");
				thrd.wait();
			}catch(InterruptedException E){}
			System.out.println(thrd.msg);
			System.out.println(thrd1.msg);
		}
	}
}
