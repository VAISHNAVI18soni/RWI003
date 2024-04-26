package Multithreading;
//performing single task from multiple thread
public class MyThread2 extends Thread
{
	public void run()
	{
		System.out.println("task 2");
	}

	public static void main(String[] args) 
	{
		MyThread2 thread1=new MyThread2();
		thread1.start();
		
		MyThread2 thread2=new MyThread2();
		thread2.start();
		
		MyThread2 thread3=new MyThread2();
		thread3.start();
		

	}

}
