public class RuntimeDemo
{
	public static void main (String args[])
	{
		Runtime run = Runtime.getRuntime();
		System.out.println(run.totalMemory());
		System.out.println(run.freeMemory());
	}
}
