class example11
{
private String data_string;
example11(String s)
{
data_string = s;
}
public String getData()
{
return data_string;
}
}

public class pdata
{
public static void main(String[] args)
{
System.out.println((new example11("Hello from Java!")).getData());
}
}
