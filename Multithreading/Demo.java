package Multithreading;

public class Demo implements Runnable
{
    
    public void run() {
        System.out.println("thread task");
    }

    public static void main(String[] args) {
       Demo t=new Demo();
       Thread th=new  Thread (t);
       th.start();
    }
}
