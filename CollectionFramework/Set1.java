package CollectionFramework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set1 {

	public static void main(String[] args) {
		Set s=new HashSet();
		s.add(100);
		s.add(200);
		s.add(300);
		s.add(400);
		s.add(500);
		//System.out.println(s);
		
		
		Iterator itr=s.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
			}
		

	}


