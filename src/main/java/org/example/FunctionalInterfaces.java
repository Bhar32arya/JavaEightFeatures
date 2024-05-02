package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.*;

public class FunctionalInterfaces {
    public static void main(String[] args) {

        Predicate<Integer> isEven = n -> n % 2 == 0;

        Predicate<String> isVowel = word -> word.matches("[aeiou]");

        System.out.println(isEven.test(10));
        System.out.println(isVowel.test("a"));

        Consumer<List<Integer>> printAllValues = list1 -> list1.forEach(System.out::println);

        List<Integer> numbers = Arrays.asList(1,3,45,6,90);
        printAllValues.accept(numbers);

        UnaryOperator<Integer> multiply = num -> num * num;

        System.out.println(multiply.apply(5));

        BinaryOperator<Double> sum = (a, b) -> a + b;

        System.out.println(sum.apply(10.0, 20.0));

        Supplier<Integer> randomNumber = () -> new Random().nextInt();

        System.out.println(randomNumber.get());
    }
}
