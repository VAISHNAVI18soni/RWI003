package Java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class VaishuMain {
   public static void main(String[] args) {
       //List<Integer> list = new ArrayList<>();
      // list.add(2);
      // list.add(3);
       //list.add(4);
      // list.add(5);
     //  list.add(6);
      // list.add(7);
     //  list.add(8);
     //  Collections.sort(list, (a, b) -> a.compareTo(b));
    //   System.out.println(list);
	   
	  // List<Integer> list = new ArrayList<>();
      // list.add(2);
      // list.add(3);
      // list.add(4);
     //  list.add(5);
     //  System.out.println("Before manual sorting: " + list);
       
      // Set<Integer> sortedSet = new TreeSet<>((a, b) -> b.compareTo(a)); // Corrected syntax for descending order
      // sortedSet.addAll(list);
      // System.out.println("After manual sorting desc: " + sortedSet);
	   List<Integer> list = new ArrayList<>();
       list.add(2);
       list.add(3);
       list.add(4);
       list.add(5);
       System.out.println("Before manual sorting: " + list);

       Map<Integer, Integer> sortedMap = new TreeMap<>((a, b) -> b.compareTo(a)); // Corrected syntax for descending order
       for (Integer num : list) {
           sortedMap.put(num, num); // Add each number to the TreeMap
       }
       System.out.println("After manual sorting desc: " + sortedMap);
   }
}
