import java.io.*;
public class MyConsole {
	public static void main(String args[]) {
		Console cns=System.console();
		char pw[];
		System.out.println("Using readPassword() method");
		pw=cns.readPassword("Enter your Password: ");
		System.out.println("Your password is: ");
		for(char c:pw)
		cns.format("%c ",c);
		cns.format("\n");
		System.out.println("Using readLine() method");
		String name;
		for(int i=1;i<=100;i++)
		{
		name=cns.readLine("Enter your password "+i+" : ");
		cns.format("Your password is: %s\n",name);
		}
	}
}
