package Java8;

import java.util.function.Predicate;

public class AndOrIsEqual {

    public static void main(String[] args) {
        Predicate<Integer> isGreaterThanTen = x -> x > 10;
        Predicate<Integer> isEven = x -> x % 2 == 0;

        Predicate<Integer> isGreaterThanTenAndEven = isGreaterThanTen.and(isEven);
        Predicate<Integer> isGreaterThanTenOrEven = isGreaterThanTen.or(isEven);

        Predicate<String> isEqualToHello = Predicate.isEqual("Hello");

        System.out.println("Is 3 greater than 2 and even? " + isGreaterThanTenAndEven.test(15));
        System.out.println("Is 5 greater than 10 or even? " + isGreaterThanTenOrEven.test(8));
        System.out.println("Is 'Vaishnavi' equal to 'Vaishnavi'? " + isEqualToHello.test("Vaishnavi"));
    }
}





//isEqual(Object targetRef) : Returns a predicate that tests if two arguments are equal according to Objects.equals(Object, Object).
//and(Predicate other) : Returns a composed predicate that represents a short-circuiting logical AND of this predicate and another.
//or(Predicate other) : Returns a composed predicate that represents a short-circuiting logical OR of this predicate and another.