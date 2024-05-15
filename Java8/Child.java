package Java8;


@FunctionalInterface
public interface Child extends Parent {
    public void sayHello();
    
    default void sayBye() {
    	
    };
}
