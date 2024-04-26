package Multithreading;

public class YieldMethod extends Thread
{
	public void run()
	
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(Thread.currentThread().getName()+" - "+1);
		}
	}
	public static void main(String[]args)
	{
		YieldMethod t1=new YieldMethod();
		t1.start();
		
		Thread.yield();
		

		for(int i=1;i<=5;i++)
		{
			System.out.println(Thread.currentThread().getName()+" - "+1);
		}
	}
}