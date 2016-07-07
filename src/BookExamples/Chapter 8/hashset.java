import java.util.*;
class hashset 
{
	public static void main (String args[])
	{
		HashSet <String> hashset = new HashSet<String>();
		hashset.add("Item 2");
		hashset.add("Item 3");
		hashset.add("Item 4");
		hashset.add("Item 5");
		hashset.add("Item 6");
		hashset.add("Item 7");
		System.out.println("Size of the hashset is " + hashset.size());
		System.out.println("Elements in hashset are " + hashset);
		hashset.remove("Item 7");
		System.out.println("Size of the hashset after removing some elements is " + hashset.size());
		hashset.clear();

		System.out.println("Size of the hashset after calling the clear () method is " + hashset.size());
	}
}
