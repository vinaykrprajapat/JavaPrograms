interface Demo
{
 	public void push(Object item);
 	Object pop();
}
public class IntImpl implements Demo
{
 	Object [] stArray;
 	int tos;
 	IntImpl(int capacity)
 	{
 		stArray = new Object[capacity];
 		tos = -1;
 	}
 	public void push(Object item)
 	{
 		stArray[++tos] = item; 
 	}
 	public Object pop()
 	{
 		Object ob = stArray[tos];
 		tos--;
 		return ob;
 	}
 	public static void main(String s[])
 	{
 		IntImpl obj = new IntImpl(3);
 		obj.push("Mohan");
 		obj.push("Kanak");
 		System.out.println(obj.pop());
System. out.println(obj.pop());
 	}
}
