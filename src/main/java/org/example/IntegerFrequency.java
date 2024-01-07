package org.example;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class IntegerFrequency {
    public static void main(String[] args) {
        int arr[] = {10, 20, 20, 10, 10, 20, 5, 20};

        Map<Integer, Integer> map = new LinkedHashMap<>();

        for(int key : arr) {
            if(map.containsKey(map.get(key))) {
                map.put(key, map.get(key) + 1);
            } else {
                map.put(key, 1);
            }
        }

        String text = "bhar32arya";
        char[] charArray = text.toCharArray();
        Map<Character, Integer> freqList = new LinkedHashMap<Character, Integer>();

        for(char key : charArray) {
            if(freqList.containsKey(key)) {
                freqList.put(key, freqList.get(key) + 1);
            } else
                freqList.put(key, 1);
        }
        
        List<Integer> numbers = Arrays.asList(10, 20, 20, 10, 10, 20, 5, 20); // Sample list of integers
        Map<Integer, Long> collect = numbers.stream().collect(Collectors.groupingBy(i -> i, Collectors.counting()));

        collect.forEach((k,v) -> System.out.println(k + " = " +v));
    }
}
