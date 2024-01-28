package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapUse {
    public static void main(String[] args) {
        List<List<Integer>> list = Arrays.asList(
                Arrays.asList(1,34,5,6),
                Arrays.asList(1,34,89,6),
                Arrays.asList(1,4,5,6)
        );

        List<Integer> flatternList = list.stream()
                .flatMap(List::stream).collect(Collectors.toList());
        flatternList.forEach(System.out::println);
    }
}
