package Multithreading;

 class MultiThreading3 extends Thread
 {
   public void run()
		{
			System.out.println("task 1");
		}
}
 class MultiThreading4 extends Thread
  {
	public void run()
	{
		System.out.println("task 2");
	}
  }
	public class Main {
		public static void main(String[] args) 
		{
			 MultiThreading3 thread1=new  MultiThreading3 ();
			 thread1.start();
			 
			 MultiThreading4 thread2=new  MultiThreading4 ();
			 thread2.start();
			 
	}

}
