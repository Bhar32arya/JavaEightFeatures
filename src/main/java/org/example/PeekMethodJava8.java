package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class PeekMethodJava8 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> doubledNumbers = numbers.stream()
                .peek(num -> System.out.println("Before Mapping: " + num))
                .map(num -> num * 2)
                .peek(doubledNum -> System.out.println("After Mapping: " + doubledNum))
                .collect(Collectors.toList()); // In Java 16+, use .toList() instead of .collect(Collectors.toList())

        System.out.println("Doubled Numbers: " + doubledNumbers);
    }
}
