 package CollectionFramework;
 import java.util.ArrayList;
 import java.util.Iterator;
 public class ArrayList1 {

	private static ArrayList all;

	public static void main(String[] args) {
		
		ArrayList al1=new ArrayList();
		al1.add(0,13);
		al1.add(1,"deepak");
		al1.add(2,'c');
		al1.add(3,0);
		al1.add(4,13);
		
		//ArrayList al2=new ArrayList();

		//al2.add(0,13);
		//al2.add(1,"deepak");
		//al2.add(2,'c');
		//al2.add(3,0);
		//al2.add(4,13);
		//al1.addAll(al2);
		//System.out.println(al1);
		
		//al1.remove(2);
		//System.out.println(al1);
		
		Iterator itr=al1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
	}

}
