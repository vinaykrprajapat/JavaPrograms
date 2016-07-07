enum Mango 
{
Brooks(10), Manilla(9), Alphanso(12), Kesar(15), Maya(8);
private int price;
Mango(int p) { price = p;}
int getPrice() { return price;}
}
class apple5 
{
public static void main(String args[]) 
{
Mango ap;
System.out.println("Kesar costs"+Mango.Kesar.getPrice()+ "= cents. \n");
System.out.println("All mango prices:");
for(Mango a : Mango.values())
System.out.println(a + " costs" + a.getPrice() + "cents.");
}
}
