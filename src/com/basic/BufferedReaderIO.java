/**
 * 
 */
package com.basic;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author vinaykumar
 *
 */
public class BufferedReaderIO {

	/**
	 * @param args
	 */
	    public static void main(String args[] ) throws Exception {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        // Read int n from STDIN
			int n = Integer.parseInt(br.readLine());
		    // Write your code here
		    String s= br.readLine();
		    System.out.println(n*2);
		    System.out.println(s);
		    
		    
	    }
	}
