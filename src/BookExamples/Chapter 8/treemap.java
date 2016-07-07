import java.util.*;
class treemap 
{
	public static void main (String args[])
	{
		TreeMap <String, String> treemap = new TreeMap<String, String>();
		treemap.put("Item 1", "value 1");
		treemap.put("Item 2", "value 2");
		treemap.put("Item 3", "value 3");
		treemap.put("Item 4", "value 4");
		Set s = treemap.entrySet ();
		System.out.println( "Size of the TreeMap is " + s.size ());
		Iterator it = s.iterator();
		while (it.hasNext()) {
			Map.Entry me = (Map.Entry) it.next();
			System.out.println( me.getKey() + " " + me.getValue());
		}
	}
}
