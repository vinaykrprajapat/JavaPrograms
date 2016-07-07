class example2
{
int addem(int op1, int op2)
{
return op1 + op2;
}
}

public class calculater
{
public static void main(String[] args)
{
example2 calc = new example2();
System.out.println("addem(2, 2) = " + calc.addem(2, 2));
}
}
