package Multithreading;

public class MyThread6 extends Thread
{
	public void run()
	{
		System.out.println("Thread task is excuted by "+Thread.currentThread().getName());
	}
	

		public static void main(String[] args)
		{
			System.out.println("hello is printed by "+ Thread.currentThread().getName());
			 MyThread6 t1 = new MyThread6();
			 t1.setName("vaishu");
			t1.start();
			
			 MyThread6 t2 = new MyThread6();
			 t1.setName("vaishnavi jwallers");
				t2.start();
			
		
		}

}
