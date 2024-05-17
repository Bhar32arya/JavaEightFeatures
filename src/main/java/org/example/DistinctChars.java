package org.example;

import java.util.Iterator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DistinctChars {
    public static void main(String[] args) {
        String str = "Hello java check for distinct characters";

        String collected = str.chars()
                .mapToObj(c -> (char) c)
                .distinct()
                .map(e -> e + "")
                .collect(Collectors.joining());
        System.out.println(collected);

        System.out.println();

        String string = Stream.iterate(str.length() - 1, n -> n >= 0, n -> n - 1)
                .map(str::charAt)
                .map(e -> e + "")
                .collect(Collectors.joining());
        System.out.println(string);
    }
}
