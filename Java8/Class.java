package Java8;

interface A{
	public static void sayhello() {
		System.out.println("Hello !");
	}



default void sayBye() {
	System.out.println("Hello !");
}

public class Class implements A {
public static void main(String[] args) {
	 Class  Class =new  Class();
	
	Class.sayBye();
	 A.sayhello();//interface ke nam se call karenge
}
}
}