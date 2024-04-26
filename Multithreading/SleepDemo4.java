package Multithreading;

public class SleepDemo4 extends Thread {
    public void run() {
        try {
            for(int i=1; i<=5; i++) { 
                System.out.println(i + ":      " + Thread.currentThread().getName());
                Thread.sleep(1000);
            }
        } catch(Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        SleepDemo4 t1 = new SleepDemo4();
        t1.start();

        SleepDemo4 t2 = new SleepDemo4();
        t2.start();
    }
}
