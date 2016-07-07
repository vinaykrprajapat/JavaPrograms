class DemoStack {
	private Object[] stck;
	private int top;
	public DemoStack(int capacity) {
		stck= new Object[capacity];
		top= -1;
	}
	public boolean push(Object obj)	//unsynchronized push method
	{
		if (top>=stck.length-1)
		return false;
		++top;
		try { 
			Thread.sleep(500);
		} catch (Exception E) { }
		stck[top] = obj;
		return true;
	}
	public Object pop() 		//unsynchronized pop method
	{
		if (top<0) 
		return null;
		Object obj = stck[top];
		stck[top] = null;
		try { 
			Thread.sleep(500);
		} catch (Exception E) { }
		top--;
		return obj;
	}
}
public class UnsynchronizedDemo 
{
	public static void main(String ar[]) 
	{
		final DemoStack stack = new DemoStack(10);
		(new Thread()		//First Thread calling push method
		{
			public void run() {
				for(;;)	{
				System.out.println("Object pushed: " + stack.push(new 
 					Integer(225)));
				}
			}
		}).start();
		(new Thread() 		//Second Thread calling pop method
		{
			public void run() {
				for(;;)	{
				System.out.println("Object popped: " + stack.pop());
				}
			}
		}).start();


		System.out.println("Exit from main().");
	}
}
