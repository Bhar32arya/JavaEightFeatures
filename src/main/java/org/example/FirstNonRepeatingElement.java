package org.example;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatingElement {
    public static void main(String[] args) {
        String str = "find the first non repeating char ";

        for(char ch : str.toCharArray()) {
            if(str.indexOf(ch) == str.lastIndexOf(ch)) {
                System.out.println(ch);
                break;
            }
        }

        Map<Character, Long> collected = str.chars()
                .mapToObj(ch -> (char) ch)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

        for (Map.Entry<Character, Long> entry : collected.entrySet()) {
            if(entry.getValue() == 1) {
                System.out.println(entry.getKey());
                break;
            }
        }

    }
}
