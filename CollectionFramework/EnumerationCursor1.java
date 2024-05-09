package CollectionFramework;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationCursor1 {

	public static void main(String[] args) {
		Vector v=new Vector();
		v.add(10);
		v.add("vaishu");
		v.add(15.2);
		v.add('c');
		v.add("Gudiya");
		//System.out.print(v);
		
	Enumeration e= v.elements();
	while(e.hasMoreElements())
	{
		System.out.println(e.nextElement());
	}
	
		}

}
