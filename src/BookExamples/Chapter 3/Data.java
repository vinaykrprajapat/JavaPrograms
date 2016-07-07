class example3
{
public String data_string;
example3(String data)
{
data_string = data;
}
}

class printer
{
public void print (example3 d)
{
System.out.println(d.data_string);
}
}

public class Data
{
public static void main(String[] args)
{
example3 data = new example3("Hello from Java!");
printer p = new printer();
p.print(data);
}
}
