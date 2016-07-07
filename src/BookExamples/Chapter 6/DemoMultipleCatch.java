class DemoMultipleCatch
{
	public static void main (String args[])
	{
		try {
			int arr[] = { }; 
			for (int i=0; i<=arr.length; i++)
			{
				System.out.println("Value at position " + i + " is " + arr[i]);
			}
		}
		catch (ArrayIndexOutOfBoundsException a) {
			a.printStackTrace();
			System.out.println("Array is out of bound; please check the upper bound	of array");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
