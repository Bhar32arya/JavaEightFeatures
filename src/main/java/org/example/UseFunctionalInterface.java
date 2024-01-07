package org.example;

import java.util.*;
@FunctionalInterface
interface Calculator {
    int calculate(int a, int b);
    default void exception() {

    }
}
public class UseFunctionalInterface {

    public static void main(String[] args) {
        Calculator add = (a, b) -> a + b;

        add.calculate(5,6);
    }
}
