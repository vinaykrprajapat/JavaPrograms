/*
You have been given a String S consisting of uppercase and lowercase English alphabets. You need to change the case of each alphabet in this String. That is, all the uppercase letters should be converted to lowercase and all the lowercase letters should be converted to uppercase. You need to then print the resultant String to output.

Input Format
The first and only line of input contains the String S

Output Format
Print the resultant String on a single line.

Constraints
1≤|S|≤100 where |S| denotes the length of string S.
*/

/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
import java.io.BufferedReader;
import java.io.InputStreamReader;
*/
import java.util.*;
import static java.lang.Character.*;

class ToggleString {
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
		char a ;
		String result="";
		for(int i=0;i<s.length();i++)
		{
			a = s.charAt(i);
		if (Character.isUpperCase(a)) { // Upper Case
	   		char currentCharToLowerCase = Character.toLowerCase(a);
	   		result = result + currentCharToLowerCase;
		} else if (Character.isLowerCase(a)) { // Lower Case
	   		char currentCharToUpperCase = Character.toUpperCase(a);
	   		result = result + currentCharToUpperCase;
		} else { // Not a letter
	   		result = result + a;
		}
		}
        System.out.println(result);
    }
}

