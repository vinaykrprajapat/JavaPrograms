/**
 * 
 */
package com.multithreading;

/**
 * @author vinaykumar
 * Use of yield() : to give up, 
 * stop() : stop the thread, 
 * sleep(): block for some milliseconds 
 * th1.setPriority(0);methods
 */

class AA extends Thread{
	public void run(){
		for(int i=0;i<5;i++)
		{
			if(i==1) yield();
		System.out.println("AA"+i);
		}
		System.out.println("Exit AA");
	}
}

class BB extends Thread{
	public void run(){
		for(int i=0;i<5;i++)
		{
		System.out.println("BB"+i);
		if(i==3) stop();
		}
		System.out.println("Exit BB");
	}
}

class CC extends Thread{
	public void run(){
		for(int i=0;i<5;i++)
		{
		System.out.println("CC"+i);
		if(i==1)
			try{
				sleep(1000);
			}catch(Exception e){}
		}
		System.out.println("Exit CC");
	}
}

public class ProgramUsingThreadClassMethods {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AA th1 = new AA();
		BB th2 = new BB();
		CC th3 = new CC();
		th1.start();
		th2.start();
		th3.start();
		
		th1.setPriority(0);
		th3.setPriority(10);
		th2.setPriority(5);
	}

}
