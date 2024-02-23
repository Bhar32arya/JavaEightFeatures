package org.example;

import java.util.stream.IntStream;

public class ReverseStringUsingJava8 {
    public static void main(String[] args) {
        String str = "example of reverse string";
        IntStream intStream = IntStream.range(0, str.length());
        intStream.forEach(i -> System.out.print(str.charAt(str.length() - 1 - i)));

        System.out.println();

        IntStream.range(0, str.length())
                        .map(i -> str.length() - 1 - i)
                                .mapToObj(c -> str.charAt(c))
                                        .forEach(System.out::print);

        System.out.println();

        StringBuilder sb = new StringBuilder(str).reverse();
        System.out.println(sb);
    }
}
