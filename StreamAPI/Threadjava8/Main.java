package Threadjava8;

import Java8.MyClass;

public class Main {

    public static void main(String[] args) {
      Runnable runnable=()->{
    	  for(int i=1;i<=10;i++) {
    		  System.out.println("Hello"+ i);
    		  
    	  }
      };
      Thread ChildThread=new Thread(runnable);
      ChildThread.run();
    }

}
