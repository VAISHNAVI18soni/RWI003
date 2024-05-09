package CollectionFramework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 {

	public static void main(String[] args) {
		
		ArrayList al=new ArrayList<>();
		al.add("soni");
		al.add("vaishu");
		al.add("gudiya");
		al.add("xyz");
		al.add("navin");
		al.add("patel");
		
	HashSet s=new HashSet();
	s.add(10);
	s.add(20);
	s.add(30);
	s.add(40);
	s.add(50);
	s.add(60);
	
	System.out.println(s);
	
	//Iterator itr= s.iterator();
	//while(itr.hasNext())
//	{
		//System.out.println(itr.next());
		
	}

	}


//does not store duplicate values
//dose not  store null values
//Sorting order ko follow nahi krta hai