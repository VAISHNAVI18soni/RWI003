package Multithreading;

public class MultiThread3 {

	public static void main(String[] args)
	{
		System.out.println("vaishu");
		System.out.println(Thread.currentThread().getName());
		Thread.currentThread().setName("Gudiya");
		System.out.println("New Thread Name :"+Thread.currentThread().getName());
		
		

	}

}
