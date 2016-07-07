import java.util.*;
class hashmap 
{
	public static void main (String args[])
	{
		HashMap <String, String> hashmap = new HashMap<String, String>();
		hashmap.put("Item 1", "value 1");
		hashmap.put("Item 2", "value 2");
		hashmap.put("Item 3", "value 3");
		hashmap.put("Item 4", "value 4");
		Set s = hashmap.entrySet ();

		Iterator it = s.iterator();
		while (it.hasNext())
		{
			Map.Entry me = (Map.Entry) it.next();

			System.out.println( me.getKey() + " " + me.getValue());
		}
	}
}
