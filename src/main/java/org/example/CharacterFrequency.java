package org.example;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterFrequency {
    public static void main(String[] args) {
        String str = "java concept of the day";

        Map<Character, Integer> charFreq = new HashMap<>();
        for(char c : str.toCharArray()) {
            if(charFreq.containsKey(c)) {
                charFreq.put(c, charFreq.get(c) + 1);
            } else {
                charFreq.put(c, 1);
            }
        }
        Consumer<Map<Character, Integer>> printMap = map -> map.forEach((k, v) -> {
            if(k != ' ') {
                System.out.println(k + " * " + v);
            }
        });

        printMap.accept(charFreq);

        System.out.println();

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