package CollectionFramework;
import java.util.ArrayList;

public class Demo3 {

	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		
		a1.add(100);
		a1.add(300);
		a1.add("soni");
		a1.add("Vaishu");
		a1.add('c');
		
		
		System.out.println(a1);
		
		
		ArrayList a12=new ArrayList();
		 a12.add("aaa");
		 a12.add("bbb");
		 a12.add("ccc");
		 
		 System.out.println(a12);
		 
		 
		 a1.addAll(a12);
		 System.out.println(a1);
		 
		 
		 
		 
		 
		
		
		
		
		
		
		

	}

}
