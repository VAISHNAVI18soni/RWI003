package Multithreading;

public class SleepDemo3 extends Thread
{
	public void run() 
	{
		for(int i=1;i<=5;i++)
		{
		    try {
		    	Thread.sleep(1000);
		    }
		    catch(Exception e)
		    {
		    	
		    }
			System.out.println(i);
		}

	}

	public static void main(String[] args) throws Exception
	{
		SleepDemo3 t1=new SleepDemo3();
		t1.start();
	    
	}

	}


