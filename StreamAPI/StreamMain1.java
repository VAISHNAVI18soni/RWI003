package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import CollectionFramework.List1;

public class StreamMain1 {

	private static final Stream<Integer> Collecters = null;

	public static void main(String[] args) {
		//create a list and filter a even number from list
		
	List<Integer>list1	=java.util.List.of(2,3,4,50,67,89,9,56);
System.out.println(list1);

List<Integer>list2=new ArrayList<>();
list2.add(12);
list2.add(13);
list2.add(14);
list2.add(15);
list2.add(16);
list2.add(17);

List<Integer>list3=Arrays.asList(23,545,876,89);

        //List1
//without stream

List<Integer> listEven=new ArrayList();
for(Integer i:list1) {
	if(1%2==0)
	{
		listEven.add(i);
	}
	
}

System.out.println(list1);
System.out.println(listEven);
     //using stream Api

//Stream<Integer> stream = list1.stream();
//List<Integer> newList = stream.filter(i -> i % 2 == 0).collect(Collectors.toList());
//System.out.println(newList);
//Stream<Integer> stream = list1.stream();
//List<Integer> newList = stream.filter(i -> i % 2 == 0).collect(Collectors.toList());
//System.out.println(newList);


List<Integer>newList=list1.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
System.out.println(newList);

List<Integer>newList1=list1.stream().filter(i->i>10).collect(Collectors.toList());
System.out.println(newList1);


	}

}
