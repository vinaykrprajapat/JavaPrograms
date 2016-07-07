package com.kogent1;
import com.kogent.*;
class MySubs extends MySup
{
 	public double calArea(double r)
 	{
 		return 3.14*r*r;
 	}	
 	public static void main(String[] args)
 	{
 		MySubs num = new MySubs();
 		num.radius = 10;
 		double Result = num.calArea(num.radius);
 		System.out.println("Area calculated:" +Result);
 	}
}
