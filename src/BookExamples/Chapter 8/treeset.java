import java.util.*;
class treeset 	
{
	public static void main (String args[])
	{
		TreeSet <String> treeset = new TreeSet<String>();
		treeset.add("Item 8");
		treeset.add("Item 3");
		treeset.add("Item 4");
		treeset.add("Item 5");
		treeset.add("Item 6");
		treeset.add("Item 7");
		System.out.println("Size of the treeset is " + treeset.size());
		System.out.println("Elements in treeset are " + treeset);
		treeset.pollFirst ();
		System.out.println("Size of the treeset after calling pollFirst () method is " + treeset.size());
		treeset.pollLast();
		System.out.println("Size of the treeset after calling the pollLast() method is " + treeset.size());
	}
}
