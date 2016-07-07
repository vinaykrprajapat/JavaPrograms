import java.util.*; 
class arraylist 
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
		System.out.println("Size of the arraylist is " + arraylist.size());

		System.out.println("Elements in arraylist are " + arraylist);
		arraylist.add(1,"Item 7");
		System.out.println("Size of the arraylist after adding a new element is " + arraylist.size());
		arraylist.remove(1);
		arraylist.remove(5);
		System.out.println("Size of the arraylist after removing some elements is " + arraylist.size());
		arraylist.clear();
		System.out.println("Size of the arraylist after calling the clear () method is " + arraylist.size());
	}
}
