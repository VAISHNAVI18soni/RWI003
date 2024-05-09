package CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Listitr1{

    public static void main(String[] args) {
        List l = new ArrayList();
        
        l.add(10);
        l.add("Vaishu");
        l.add("Soni");
        
        ListIterator itr = l.listIterator();
        
       while(itr.hasNext()) {
            System.out.println(itr.next());
        }
       
       System.out.println("-------------------------------");
        while(itr.hasPrevious()) {
            System.out.println(itr.previous());
        }
        l.remove("vaishu");
        System.out.println(l);
    }
}
//cursor next method ke through move kar rha hai
//next method cursor ko move bhi krwata rehta hhai
