import java.util.*;
class Iterator1 
{
	public static void main (String args[])
	{
		ArrayList <String> arraylist = new ArrayList<String>();
		arraylist.add("Item 0");
		arraylist.add("Item 2");
		arraylist.add("Item 3");
		arraylist.add("Item 4");
		arraylist.add("Item 5");
		arraylist.add("Item 6");

		Iterator<String> it = arraylist.iterator ();
		while (it.hasNext())
		{
			System.out.println( it.next());
		}
	}
}
