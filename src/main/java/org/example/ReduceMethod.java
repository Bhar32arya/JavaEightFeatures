package org.example;

import java.util.Arrays;

public class ReduceMethod {
    public static void main(String[] args) {
        int arr[] = new int[]{1,4,5,3};

        int asInt = Arrays.stream(arr)
                .reduce(Integer::sum).getAsInt();

        int sum = Arrays.stream(arr)
                .reduce(0, (a, b) -> a + b);

        System.out.println(asInt + " " + sum);
    }
}
