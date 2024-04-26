package Multithreading;

public class JoinMethod extends Thread
{
	public void run()
	{
		try
		{
		for(int i=1; i<=5; i++)
		{
			System.out.println("child thread : "+i);
			Thread.sleep(1000);
			
		}
	
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	}
	public static void main(String[] args) throws InterruptedException
	{
		JoinMethod t1=new JoinMethod();
		t1.start();
		
		t1.join();
		
		try
		{
		for(int i=1; i<=5; i++)
		{
			System.out.println("child thread : "+i);
			Thread.sleep(1000);
			
		}
	
	}
	catch(Exception e)
	{
		System.out.println(e);
	}

	}

}
