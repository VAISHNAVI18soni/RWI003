package StreamAPI;

import java.util.Arrays;
import java.util.stream.Stream;

public class Streamobject {

	public static void main(String[] args) {
	//stream API-collection process
		//collection/group of object
		
		
		//1-blank
		Stream<Object>emptyStream=Stream.empty();
		
String names[]= {"vaishnavi","divya","Soni"};
Stream<String> stream1=Stream.of(names);
stream1.forEach(e->
{
	System.out.println(e);
});


//3
 Stream<Object>StreamBuilder=Stream.builder().build();
 
 
 //2
 Stream stream=(Stream) Arrays.stream(new int[] {2,4,65,3,564});
 stream.forEach(e->{
 
	 System.out.println(e);
 });
	}

}
