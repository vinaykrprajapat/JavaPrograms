/**
 * 
 */
package com.multithreading;

/**
 * @author vinaykumar
 * Threads using Runnable Interface 
 */
class X implements Runnable
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
		System.out.println("TH"+i);
		}
		System.out.println("Exit TH");
	}
}
public class ProgramUsingRunnableInterface {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		X runnable=new X();
		Thread th=new Thread(runnable);
		th.start();
	}

}
