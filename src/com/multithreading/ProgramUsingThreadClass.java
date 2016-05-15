/**
 * 
 */
package com.multithreading;

/**
 * @author vinaykumar
 * Basic Program in Multithreading
 */
class A extends Thread{
	public void run(){
		for(int i=0;i<5;i++)
		{
		System.out.println("A"+i);
		}
	}
}

class B extends Thread{
	public void run(){
		for(int i=0;i<5;i++)
		{
		System.out.println("B"+i);
		}
	}
}

class C extends Thread{
	public void run(){
		for(int i=0;i<5;i++)
		{
		System.out.println("C"+i);
		}
	}
}
public class ProgramUsingThreadClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new A().start();
		new B().start();
		new C().start();
	}

}
