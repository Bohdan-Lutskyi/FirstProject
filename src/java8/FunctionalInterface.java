package java8;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionalInterface {
    public static void main(String[] args) {
        Predicate<Integer> pr = x-> x > 5;//this expression compares X with 5
        System.out.println(pr.test(10));
        System.out.println("------------------------------");
        Consumer<Integer> consumer = x -> {
            if (x > 10) System.out.println("hello");
            else System.out.println("bla");
        };
        consumer.accept(11);
        System.out.println("------------------------------");

        Function<Integer, String> function = x -> x.toString();//converts x to other type
        System.out.println(function.apply(5));
        System.out.println("------------------------------");

    }
}
