class example12
{
private String data_string;
example12(String s)
{	
data_string = s;
}
public String getData()
{
return data_string;
}
public void printData()
{
printer p = new printer();
p.print(this);
}
}

class printer
{
void print(example12 d)
{
System.out.println (d.getData());
}
}

public class Data2
{
public static void main(String[] args)
{
(new example12("Hello from Java!")).printData();
}}
