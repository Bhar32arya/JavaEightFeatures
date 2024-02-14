package org.example;

import java.util.stream.Collectors;

public class DistinctChars {
    public static void main(String[] args) {
        String str = "Hello java check for distinct characters";

        String distinct = str.chars()
                .mapToObj(c -> (char) c)
                .distinct()
                .map(String::valueOf)
                .collect(Collectors.joining());
        System.out.println(distinct);
    }
}
