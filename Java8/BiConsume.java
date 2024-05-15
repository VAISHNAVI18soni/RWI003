package Java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;

public class BiConsume {

    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<Integer>();
        lista.add(2);
        lista.add(1);
        lista.add(3);

        List<Integer> listb = new ArrayList<Integer>();
        listb.add(2);
        listb.add(1);
        listb.add(2);

        BiConsumer<List<Integer>, List<Integer>> equals = (list1, list2) -> {
            if (list1.size() != list2.size()) {
                System.out.println("False");
            } else {
                for (int i = 0; i < list1.size(); i++)
                    if (!list1.get(i).equals(list2.get(i))) {
                        System.out.println("False");
                        return;
                    }
                System.out.println("True");
            }
        };
        equals.accept(lista, listb);
    }
}

//The BiConsumer Interface is a part of the java.util.function package which has been introduced since Java 8, to implement functional programming in Java. It represents a function that takes in two arguments and produces a result. However, these kinds of functions doesn’t return any value.

//This functional interface takes in two generics, namely:- 

//T: denotes the type of the first input argument to the operation
//U: denotes the type of the second input argument to the operation
//The lambda expression assigned to an object of BiConsumer type is used to define its accept() which eventually applies the given operation to its arguments. 

//BiConsumers are useful when it is not required to return any value as they are expected to operate via side-effects. 