class example7
{
public int[] getNewArray()
{
int array[] = {1, 2, 3, 4, 5};
return array;
}
}


public class ArrayFactory
{
public static void main(String[] args)
{
example7 af = new example7 ();
int array[] = af.getNewArray();
for (int loop_index = 0; loop_index < array.length; loop_index++) {
System.out.println("array[" + loop_index + "] = " +
array[loop_index]);
}
}
}
