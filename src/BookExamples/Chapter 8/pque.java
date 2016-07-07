import java.util.*;
class pque {
	public static void main (String args[])
	{
		PriorityQueue <String> pq = new PriorityQueue<String>();
		pq.add("Item 1");
		pq.add("Item 3");
		pq.add("Item 4");
		pq.add("Item 5");
		pq.add("Item 6");
		pq.add("Item 7");
		System.out.println("Size of the Pq is " + pq.size());
		System.out.println("Elements in pq are " + pq);
		pq.offer("Item 9");
		System.out.println("Elements in pq after calling offer () method are " + pq); 
		System.out.println("Element at the top in pq is " + pq.peek());
		pq.poll ();
		System.out.println("Size of the pq after calling the poll() method is " + pq.size());
	}
}
