package Java8;

interface Vaishnavi{
	default void sayHello() {
		System.out.println("Hello");
	}
}
class Gudiya implements Vaishnavi
{
	@Override
	public void sayHello() {
		System.out.println("Gudiya saya Heloo");
	}
}
public class MyClass {
public static void main(String[] args) {
	Gudiya c=new Gudiya();
	c.sayHello();

	}

}
//Parent  c=new Gudiya();//yeh child say hello print karwayega 
//parent c=new parent (; ) still parent is interface