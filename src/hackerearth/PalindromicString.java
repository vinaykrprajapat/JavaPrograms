/*
You have been given a String S. You need to find and print whether this string is a palindrome or not. If yes, print "YES" (without quotes), else print "NO" (without quotes).

Input Format
The first and only line of input contains the String S. The String shall consist of lowercase English alphabets only.

Output Format
Print the required answer on a single line.

Constraints 
1≤|S|≤ 100
1≤|S|≤100

Note
String S consists of lowercase English Alphabets only.

*/


/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
import java.io.BufferedReader;
import java.io.InputStreamReader;
*/
import java.util.*;
class PalindromicString {
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
		String s = sc.next();
		String r = new StringBuffer(s).reverse().toString();
		if(s.equals(r)){
        System.out.println("YES");
		}
		else{
			System.out.println("NO");
		}
    }
}

