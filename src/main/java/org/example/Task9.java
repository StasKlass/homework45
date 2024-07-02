package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task9 {
    public static void main(String[] args) {
        List<String> phrases = Arrays.asList("Java", "Stream", "API");

        String result = phrases.stream()
                .collect(Collectors.joining(" "));

        System.out.println("Объединённая строка: " + result);
    }
}
