package Multithreading;

public class MyThread8 extends Thread
{
	public void run() {
		if(Thread.currentThread() .isDaemon())
		System.out.println(Thread.currentThread().isDaemon());
		System.out.println("daemon Thread");
	}

	public static void main(String[] args)
	{
		System.out.println("main thread");
		
		MyThread8 t1=new MyThread8();
		t1.setDaemon(true);
		t1.start();

	}

}
