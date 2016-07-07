class example5
{
public void doubler(int a[])
{
for (int loop_index = 0; loop_index < a.length; loop_index++) 
{
a[loop_index] *= 2;
}
}
}

public class Calculate
{
public static void main(String[] args)
{
int array[] = {1, 2, 3, 4, 5};
example5 c = new example5 ();
System.out.println ("Before the call to doubler...");
for (int loop_index = 0; loop_index < array.length; loop_index++) 
{
System.out.println ("array [" + loop_index + "] = " +
array[loop_index]);
}
c.doubler (array);
System.out.println("After the call to doubler...");
for (int loop_index = 0; loop_index < array.length; loop_index++) 
{
System.out.println("array[" + loop_index + "] = " +
array[loop_index]);
}
}
}
