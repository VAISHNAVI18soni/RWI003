package vaishuApplication;

public class Switchcase {

    public static void main(String[] args) {
    	
        int Variable = 3;
        System.out.println("main begin");
        switch (Variable % 2) {
            case 0:
                System.out.println("even");
                break;
            case 1:
                System.out.println("odd");
                break;
        }
        System.out.println("main end");
    }
}
