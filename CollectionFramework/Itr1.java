package CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Itr1 {

	public static void main(String[] args) {
	List l=new ArrayList();
			
			l.add(10);
	         l.add("Vaishu");
	        
             l.add("Soni");
             //System.out.println(l);
             
             Iterator itr=l.iterator();
             while(itr.hasNext())
             {
            	 System.out.println(itr.next());
             }
    
	        

	}

}
