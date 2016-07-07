class example
{
public void print()
{
internal_use_only();
}
private void internal_use_only ()
{
System.out.println("Hello from Java!");
}
}

public class printer
{
public static void main(String[] args)
{
example printer1 = new example();
printer1.print();
}
}
