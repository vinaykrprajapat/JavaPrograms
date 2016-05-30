/*
You have been given 3 integers l, r and k. Find how many numbers between l and r (both inclusive) are divisible by k. You do not need to print these numbers, you just have to find their count.

Input Format
The first and only line of input contains 3 space separated integers l, r and k.

Output Format
Print the required answer on a single line.

Constraints
1≤l≤r≤1000
1≤l≤r≤1000 
1≤k≤1000
*/

/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
import java.io.BufferedReader;
import java.io.InputStreamReader;
*/
import java.util.*;
class CountDivisors {
    public static void main(String args[] ) throws Exception {
        /*
         * Read input from stdin and provide input before running

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        for (int i = 0; i < N; i++) {
            System.out.println("hello world");
        }
        */
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt(); 
		int r = sc.nextInt();
		int k = sc.nextInt();
		int count = 0;
		if(l<r)
		{
		for(int i=l; i<=r; i++)
		{
			if(i%k == 0)
			{
				count++;
			}
		}
		}
        System.out.println(count);
    }
}

