package Java8;
import java.util.function.BiPredicate;
public class Predicate {

	public static void main(String[] args) {
		  BiPredicate<Integer, Integer> isSumEven = (a, b) -> (a + b) % 2 == 0;

	       
	        System.out.println("Is the sum of 3 and 5 even? " + isSumEven.test(3, 5)); // Output: Is the sum of 3 and 5 even? true
	        System.out.println("Is the sum of 2 and 4 even? " + isSumEven.test(2, 4)); // Output: Is the sum of 2 and 4 even? true
	        System.out.println("Is the sum of 7 and 9 even? " + isSumEven.test(7, 9)); // Output: Is the sum of 7 and 9 even? false

	}

}
//In Java 8, you can use the BiPredicate functional interface to represent a predicate (boolean-valued function) that takes two arguments. Here's an example code demonstrating the usage of BiPredicate: