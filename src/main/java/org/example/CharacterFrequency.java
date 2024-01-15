package org.example;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterFrequency {
    public static void main(String[] args) {
        String str = "java concept of the day";
        Map<Character, Long> frequencyOfChar = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        frequencyOfChar.forEach((k,v) -> System.out.println(k + " = " + v));
        List<Double> decimalList = Arrays.asList(12.45, 23.58, 17.13, 42.89, 33.78, 71.85, 56.98, 21.12);
        Double min = decimalList.stream().min(Comparator.naturalOrder()).get();
        Double max = decimalList.stream().max(Comparator.naturalOrder()).get();
        System.out.println(min + " = " + max);

    }
}