package org.example;

import java.util.stream.IntStream;

public class PalindromUsingJava8 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("eye"));
    }
    private static boolean isPalindrome(String str) {
        IntStream range = IntStream.range(0, str.length()/2);
        return range.noneMatch(i -> str.charAt(i) != str.charAt(str.length() - 1 - i));
    }
}
