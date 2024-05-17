package org.example;

import java.util.*;
import java.util.function.*;

public class FunctionalInterfaces {
    public static void main(String[] args) {

        Predicate<Integer> isEven = num -> num % 2 == 0;

        Predicate<String> isVowel = word -> word.matches("[aeiou]");

        Predicate<Integer> isOdd = num -> num % 2 != 0;

        System.out.println(isEven.test(10) + " and "  +isOdd.test(15));
        System.out.println(isVowel.test("a"));

        Consumer<List<Integer>> printAllValues = list1 -> list1.forEach(System.out::println);

        Consumer<Map<Integer, Integer>> printMap = map -> map.forEach((k, v) -> System.out.println(k + " " + v));
        Map hasMap = new HashMap();
        hasMap.put(1,3);
        hasMap.put(2,4);

        printMap.accept(hasMap);

        List<Integer> numbers = Arrays.asList(1,3,45,6,90);
        printAllValues.accept(numbers);

        UnaryOperator<Integer> multiply = num -> num * num;

        System.out.println(multiply.apply(5));

        BinaryOperator<Double> sum = (a, b) -> a + b;

        System.out.println(sum.apply(10.0, 20.0));

        Supplier<Integer> randomNumber = () -> new Random().nextInt();

        System.out.println(randomNumber.get());

        Function<String, Integer> convertToString = num -> Integer.parseInt(num);

        System.out.println(convertToString.apply("550"));
    }
}
