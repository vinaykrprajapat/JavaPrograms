/**
 * 
 */
package hackerearth;

import java.util.Scanner;

/**
 * @author vinaykumar
 * You are given a string S. Count the number of occurrences of all the digits in the string S.

Input:
First line contains string S.

Output:
For each digit starting from 0 to 9, print the count of their occurrences in the string S. So, print 10 lines, each line containing 2 space separated integers. First integer i and second integer count of occurrence of i
 See sample output for clarification.

Constraints:
 1 ≤ | S | ≤ 100
 */
public class NumberCount {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner sc= new Scanner(System.in);
	       String input= sc.next();
	       
	       int[] a=new int[10];
	       char c;
	       int v;
	       for(int i=0;i<input.length();i++)
	       {
	       	c = input.charAt(i);
	       	v=Integer.parseInt(String.valueOf(c));
	       	a[v]++;
	       }
	       
	       for(int i=0;i<10;i++)
	       {
	       	System.out.println(i+" "+a[i]);
	       }
	}

}
