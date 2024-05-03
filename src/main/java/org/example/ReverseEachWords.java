package org.example;

import java.util.Arrays;

class ReverseEachWord {
    public static void main(String[] args) {
        String str = "my name is Bhartendu";

        Arrays.stream(str.split("\\s"))
                .forEach(word -> {
                    StringBuffer sb =  new StringBuffer(word).reverse();
                    sb.append(" ");
                    System.out.print(sb);
                });

    }
}