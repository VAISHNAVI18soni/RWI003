package Multithreading;

public class MyThread4 extends Thread
{ 
	public void run()
	{
		System.out.println("task 3");
	}

	public static void main(String[] args) 
	{
		MyThread4 thread1=new MyThread4();
		thread1.start();

		MyThread4 thread2=new MyThread4();
		thread2.start();
		
		MyThread4 thread3=new MyThread4();
		thread3.start();

		MyThread4 thread4=new MyThread4();
		thread4.start();


	}

}
