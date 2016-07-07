class example8
{
int int1 = 1; //visible to all code in the class.
public void method(int int2) //visible to all code in this method.
{
int int3 = 3; //visible to all code in this method.
if(int1 != int2) {
int int4 = 4; //visible only in this code block.
System.out.println("int1 = " + int1
+ " int2 = " + int2
+ " int3 = " + int3
+ " int4 = " + int4);
}
}
}

public class Class
{
public static void main(String[] args)
{
example8 c = new example8();
c.method (2);
}
}
