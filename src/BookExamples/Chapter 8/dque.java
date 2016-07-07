import java.util.*;
class dque 
{
	public static void main (String args[])
	{
		ArrayDeque <String> dq = new ArrayDeque<String>();

		dq.push("Item 1");
		dq.push("Item 3");
		dq.push("Item 4");
		dq.push("Item 5");
		dq.push("Item 6");
		System.out.println("Size of the dq is " + dq.size());
		System.out.println("Elements in dq are " + dq);

		System.out.println("The First elements in dq is " + dq.getFirst()); 
		dq.clear();   
		System.out.println("Size of the dq after calling the clear () method is " +   dq.size());
	}
}
