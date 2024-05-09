package CollectionFramework;

import java.util.Vector;

public class Vector1 {

	public static void main(String[] args) {
		//empty constructor
		//Vector v=new Vector();   //initial capacity 10 (vector object ke ander 10 element store krwa salte hai
        
		//2.
		//Vector v1=new Vector();//dusre kisi coleection object ko store krwa dega jitne bhi element collection object ke ander hai store ho jaynge
		//ek collection object ke element vector main store ho jaye
		
		Vector v=new Vector();
		
		v.add("vaishu");
		v.add(1,"soni");
		v.addElement("gudiya");
		v.add(100);
		v.add(120.4);
		v.add('g');
		v.add("vaishu");//duplicate
	//	System.out.println(v.firstElement());
		//System.out.println(v.lastElement());
		
		//System.out.println(v.removeElement("vaishu"));
		//System.out.println(v);
		
		//v.removeElementAt(3);//index based
		//System.out.println(v);
		v.setElementAt("aaa", 2);
		System.out.println(v);
	}

}
