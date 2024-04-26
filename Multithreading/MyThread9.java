package Multithreading;

public class MyThread9 extends Thread
{ 

    public void run() {
  System.out.println("Child Thread");
     System.out.println("Child Thread Priority: " + Thread.currentThread().getPriority());
    }

  public static void main(String[] args) {
           System.out.println("Main Thread old Priority: " + Thread.currentThread().getPriority());
     Thread.currentThread().setPriority(10);
  System.out.println("Main Thread new Priority: " + Thread.currentThread().getPriority());

        MyThread9 t = new MyThread9();
  t.start(); 
          }
}   

//child thread ki priority parent thread se inherit hoti hai