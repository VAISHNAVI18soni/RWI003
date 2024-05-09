

		package CollectionFramework;
		import java.util.ArrayList;

		public class Isempty{

			public static void main(String[] args) {
				ArrayList a1=new ArrayList();
				
				a1.add(100);
				a1.add(300);
				a1.add("soni");
				a1.add("Vaishu");
				a1.add('c');
				
				ArrayList a12=new ArrayList();
				a12.add(100);
				a12.add(300);
				a12.add("soni");
				a12.add("Vaishu");
				a12.add('c');
				
				
				a1.removeAll(a12);
				System.out.println(a1);
				System.out.println(a12);
				
//agr sare element remove krwana hai to al.clear then S.o.pln(al);

	}

}
