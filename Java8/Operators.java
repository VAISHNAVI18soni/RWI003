package Java8;
import java.util.function.Function;
import java.util.function.UnaryOperator;
public class Operators {

	public static void main(String[] args) {
		Function<Integer, Integer> myfunction1 = x -> x * x;

        Function<String, String> myfunction2 = str -> str.toLowerCase();

        UnaryOperator<Integer> unaryOperator = x -> x * x;

        System.out.println(unaryOperator.apply(5)); 
	}

}
//The UnaryOperator Interface<T> is a part of the java.util.function package which has been introduced since Java 8, to implement functional programming in Java. It represents a function which takes in one argument and operates on it. However what distinguishes it from a normal Function is that both its argument and return type are the same.

//Hence this functional interface which takes in one generic namely:-

//T: denotes the type of the input argument to the operation
//Hence the UnaryOperator<T> overloads the Function<T, T> type. So it inherits the following methods from the Function Interface: