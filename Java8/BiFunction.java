package Java8;

public class BiFunction {

    public static void main(String[] args) {
        BiFunction<String, String, String> concatenate = (s1, s2) -> s1 + s2;

        String result1 = concatenate.apply("Hello, ", "world!");
        String result2 = concatenate.apply("Java ", "8");
        
        System.out.println("Concatenated string 1: " + result1);
        System.out.println("Concatenated string 2: " + result2); 
    }
}
//In Java 8, the BiFunction functional interface represents a function that takes two arguments and produces //a result. Here's an example demonstrating the usage of BiFunction: