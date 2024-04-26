package Multithreading;

public class MyThread7 extends Thread
{
	public void run()
	{
		Thread.currentThread().setName("vaishnavi");
		System.out.println("Thread task is excuted by "+Thread.currentThread().getName());
	}
	

		public static void main(String[] args)
		{
			System.out.println("hello is printed by "+ Thread.currentThread().getName());
			 MyThread6 t1 = new MyThread6();
			 t1.start();
			
			
		
		}

}
