import java.util.*;
class VectorExample {
 	public static void main(String args[]) {
 		Vector vect = new Vector(5,3);
System.out.println("Initial Capacity of the created Vector is: " +  vect.capacity());
 		vect.addElement(new Integer(0));
 		vect.addElement(new Integer(1));
 		vect.addElement(new Integer(2));
 		vect.addElement(new Integer(3));
 		vect.addElement(new Integer(4));
 		vect.addElement(new Integer(5));
 		vect.addElement (new Integer(6));
 		vect.addElement(new Double(3.14159));
 		vect.addElement(new Float(3.14157));
 		System.out.println();

System.out.println("Capacity of the vector after increment capacity is: " +  vect.capacity());
 		System.out.println();
 		System.out.println("Size of the vector is: " + vect.size());
 		System.out.println();
System. out.println("First item in the vector is: " +  (Integer)vect.firstElement());
 		System.out.println();
System.out.println("Last item in the vector is: " +  (Float)vect.lastElement());
 		System.out.println();
 		if(vect.contains(new Integer(3)))
 		{
 			System.out.println("Yes! integer value 3 is available.");
 		}
 		System.out.println();
 		// Traversing vector using Enumeration methods
 		Enumeration e= vect.elements();
 		System.out.println("Element objects present in this vector are : "  );
 		while(e.hasMoreElements())
 		{
   			System.out.println(e.nextElement());
 		}
 	}
}
