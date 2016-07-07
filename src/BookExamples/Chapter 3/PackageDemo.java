package com.kogent; // package creation 
public class PackageDemo // class in a package 
{
	int x[]; 
	public PackageDemo(int a[]) // constructor having array as parameter 
	{
		for (int i=0; i<a. length; i++)
		{
			x = a; // Assigning array elements to another array 
		}
	}
	public void arr () // method for bubble sort 
	{ 
		int temp=0, j, k;       
		for (j=0; j<x.length; j++)
		{
			for(k=0; k<x.length-1; k++)
			{
				if (x[k]>x[k+1])
				{
					temp=x[k+1];
					x[k+1]= x[k];
					x[k]=temp;
				}
			}
		}
		System.out.println("Elements after sorting are:");
		for (j=0; j<x.length; j++)
		


{
			System.out.println(x[j]); // Printing sorted array elements on command prompt 
		}
	}
	public static void main (String args[])
	{
		int m[]={5,3,2}; // Decalring and initializing array
		PackageDemo val = new PackageDemo (m); // creating object of class and passing array 
		val.arr (); // calling arr method 
	}
}
