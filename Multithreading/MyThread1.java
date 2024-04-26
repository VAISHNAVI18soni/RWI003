package Multithreading;
//performing single task from single thread
public class MyThread1 extends Thread 
{
	public void run()
	{
		System.out .println("task 1");
	}
	

	public static void main(String[] args)
	{
		 MyThread1 thread1=new MyThread1();
		 thread1.start();

	}

}
