class example4
{
public String data_string;
example4(String s)
{
data_string = new String(s);
}
}

class Test
{
public void rewrite(example4 d)
{
d.data_string = "Hello to Java!";
}
}

public class Data1
{
public static void main(String[] args)
{
example4 d = new example4 ("Hello from Java!");
Test t = new Test ();
t.rewrite (d);
System.out.println (d.data_string);
}
}
