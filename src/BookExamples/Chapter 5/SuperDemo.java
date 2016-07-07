class Dim
{
 	double width;
 	double height;
 	double depth;

 
 	Dim(double w, double h, double d)
 	{
 		width = w;
 		height = h;
 		depth = d;
 	}

 	Double volume()
 	{
 		return width * height * depth;
 	}
}
class NewDim extends Dim
{
 	double weight;

 	NewDim(double w, double h, double d, double m)
 	{
 
 		super(w,h,d);
 		weight = m;
 	}
}
public class SuperDemo
{
 	public static void main(String s[])
 	{
 		System.out.println("Initializing members - Using super()");
 		NewDim obj = new NewDim(5,5,5,5);
 		System.out.println("Width:" + obj.width);
 		System.out.println("Height:" + obj.height);
 		System.out.println("Depth:" + obj.depth);
 		System.out.println("Initializing weight - Using subclass constructor ");
 		System.out.println("Weight:" + obj.weight);
 		System.out.print("Computing Volume:");
 		Double res = obj.volume();
 		System.out.print(obj.volume());
 	}
}
