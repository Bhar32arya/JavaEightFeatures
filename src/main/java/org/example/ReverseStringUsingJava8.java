package org.example;

import java.util.stream.IntStream;

public class ReverseStringUsingJava8 {
    public static void main(String[] args) {
        String str = "example of reverse string";
        IntStream intStream = IntStream.range(0, str.length());
        intStream.forEach(i -> System.out.print(str.charAt(str.length() - 1 - i)));
    }
}
