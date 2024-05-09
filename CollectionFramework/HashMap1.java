package CollectionFramework;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap1 {

	public static <E> void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap();
		
		hm.put(101, "vaishu");
		hm.put(102, "soni");
		hm.put(103, "vaishnavi");
		hm.put(104, "gudiya");
		hm.put(105, "dipti");
		
		hm.put(103, "navin");
		hm.put(null, "nikki");
		
		
		System.out.println(hm);
		
		//for(Map.Entry me:hm.entrySet())
		//{
			//System.out.println(me.getKey()+" ->"+me.getValue());
		//}
		
		
		//Set set = hm.entrySet();
		//System.out.println(set);
		
		//@SuppressWarnings("rawtypes")
		//Iterator itr = set.iterator();
	//	while(itr.hasNext())
		//{
			//System.out.println(itr.next());
		//	Map.Entry entry=(Map.Entry) itr.next();
			//System.out.println(entry.getKey()+" ->"+entry.getValue());
		//}
		
}
	
}

	//private static void next() {
		// TODO Auto-generated method stub
		
	//}

//}
