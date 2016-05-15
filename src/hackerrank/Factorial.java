package hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Factorial {

	static int  result=1;
    public static int factorial(int N){
        
        if(N<=1)
            {
            result = N * 1;
        }
        else{
            result = N * factorial(N-1);
        }
        return result;
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        System.out.println(factorial(N));
    }
}