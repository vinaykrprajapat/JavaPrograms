/**
 * 
 */
package hackerearth;

import java.util.Scanner;

/**
 * @author vinaykumar
 *
 */
public class BearandVowels {

	/**
	 * @param args
	 */
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

        Scanner sc=new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0)
        {
        	String s = sc.next();
        	int l = s.length();
        	//System.out.println(l);
        	int count=0,j=0,consecutive=0;
        	for(int i=0;i<l;i++)
        	{j++;
        		if(s.charAt(i) == 'a' ||  s.charAt(i)=='e' ||  s.charAt(i) == 'i' ||  s.charAt(i) == 'o' ||  s.charAt(i) == 'u' ||  s.charAt(i) == 'y')
        		{
        			count++;
        		}
        		else{
        			if(i-(j-1) == 0)
        			{
        				consecutive++;
        			}
        		}
        	}
        	int consonents = l - count; 
        	if(consonents > count)
        	{
        		System.out.println("hard");
        	}
        	else if(consecutive > 3)
        	{
        		System.out.println("hard");
        	}
        	else
        	{
        		System.out.println("easy");
        	}
        	
        	T--;
        	
        }
    }
}


/*
i/p: 
5
qiewldoaa
life
ayayayyy
szczebrzeszyn
gg



There are 
26
26 letters in the English alphabet and 
6
6 of them are vowels: a,e,i,o,u,y. Other 
20
20 letters are called consonants.

Limak is a little polar bear. He found a string 
s
s consisting of lowercase English letters. He is going to read and pronounce 
s
s but it may be hard for him. Some letters are harder to pronounce, some are easier. Generally, little polar bears like vowels (letters a,e,i,o,u,y) and hate consonants.

Your task is to check whether pronouncing 
s
s will be hard or easy. We define 
s
s to be hard if at least one of the two conditions holds true:

There are more consonants than vowels.
Some 
3
3 consecutive letters are all consonants.
For each test case in one line print "hard" (without the quotes) if 
s
s is hard to pronounce. Otherwise, print "easy" (without the quotes).

Input format

The first line of the input contains one integer 
T
T denoting the number of test cases.

The first line of each test case description contains one string 
s
s denoting a string found by Limak. Each character in 
s
s is one of 
26
26 lowercase English letters.

Output format

For each test case, output a single line containing the answer — either "hard" or "easy".

*/