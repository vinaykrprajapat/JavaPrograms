import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class IsPrime {

    public static void isPrime(int n){
        Boolean flag = true;
        
        if(n <= 1){
            System.out.println("Not prime");
        }
        if(n == 2 || n == 3){
            System.out.println("Prime");
        }
        else if(n%2 == 0)
            {
            System.out.println("Not prime");
        }
        else{
            for(int i=2; i<=Math.sqrt(n);i=i+1)
                {
                if(n%i == 0)
                    {
                    flag = false;
                }
            }
            if(flag){
            System.out.println("Prime");
                }
            else{
                System.out.println("Not prime");
            }
        }
        
    }
    public static void main(String[] args) {
        /* Enter your code here. */
        Scanner sc=new Scanner(System.in);
        int T= sc.nextInt();
        while(T>0)
            {
            int num = sc.nextInt();
            isPrime(num);
            T--;
        }
    }
}

