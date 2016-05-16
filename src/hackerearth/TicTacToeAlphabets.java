package hackerearth;

/*
 * Tic-Tac-Toe are three cousins. They planned to play cricket this afternoon but got stuck in their homework. Mrs. Jaime assigned them a task to arrange all the letters in a scrambled word in the order of their appearance in english alphabets. All the letters are in upper-case. Help Tic-Tac-Toe to solve their homework so that they can play cricket.

Input: First line of the input contains T, followed by T lines, each containing a scrambled word in upper-case.

Output: T lines, each containing arranged words.

Constraints: 1 <= T <= 500 | S <= 10^3 , Where S: Length of each scrambled word.

Sample Input(Plaintext Link)
 4
INDIA
PROGRAM
HACKEREARTH
COLOUR
Sample Output(Plaintext Link)
 ADIIN
AGMOPRR
AACEEHHKRRT
CLOORU
Explanation
For the 1st test case, INDIA can be arranged as ADIIN.
For the 2nd test case, PROGRAM can be arranged as AGMOPRR.
 * 
 * */

public class TicTacToeAlphabets {
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
		int T = sc.nextInt();
		while(T>0)
		{
			String s = sc.next();
			char[] ch = s.toCharArray();
			Arrays.sort(ch);
			String snew = new String(ch);
			System.out.println(snew);
			T--;
		}
    }
}

}
