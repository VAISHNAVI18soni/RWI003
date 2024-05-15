package StreamAPI;

import java.util.List;
import java.util.stream.Collectors;

public class Methods {

	private static char[] newName;

	public static void main(String[] args) {
		
		
		//filter(predicate)
		//bollean value function
		//e->{return true, false}
		
		//map(function)
		/*
		 * each element operations
		 */
		 List<String> names = List.of("vaishu", "soni", "divya", "gudiya");
	        List<String> filteredNames = names.stream()
	                                          .filter(e -> e.startsWith("A"))
	                                          .collect(Collectors.toList());

	        System.out.println(filteredNames);
		

	}

}
