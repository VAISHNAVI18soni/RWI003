package Java8;

@FunctionalInterface
public interface MyInterface {
           public void sayHello();
           
           default void saybye() {
        	   
           };
           
           public static void sayok() {
        	   
           };
}
