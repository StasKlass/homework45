package org.example;

import java.util.Arrays;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("stream", "api", "java", "list");

        long count = words.stream()
                .filter(word -> word.length() > 4)
                .count();

        System.out.println("Количество строк с длиной больше 4 символов: " + count);
    }
}
