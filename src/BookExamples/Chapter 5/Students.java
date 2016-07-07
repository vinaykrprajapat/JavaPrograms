interface Cal
{
 	double radius = 0;
 	double Area(double radius);
}
public class Students implements Cal
{
 	public double Area(double radius)
 	{
 		return 3.14*radius*radius;
 	}
 	public static void main(String s[])
 	{
 		Students obj = new Students();
 		double res = obj.Area(1.0);
 		System.out.println("Computing Area using class variable:"+ res);
     	Cal intref;
 		intref = obj;
 		double res1 = obj.Area(1.0);
 		System.out.println("Computing Area using interface reference variable:"+res1);
 		} 
}
