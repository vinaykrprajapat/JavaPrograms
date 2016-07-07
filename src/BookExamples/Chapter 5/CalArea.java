class MyData 
{
 	public double radius ;
}
class CalArea extends MyData
{
 	public double calArea(double r)
 	{
 		return 3.14*r*r;
 	}	
 	public static void main(String[] args)
 	{
 		CalArea num = new CalArea();
 		num.radius = 10;
 		double Result = num.calArea(num.radius);
 		System.out.println("Area calculated:" +Result);
 	}
}
