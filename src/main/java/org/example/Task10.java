package org.example;

import java.util.Arrays;
import java.util.List;

public class Task10 {
    public static void main(String[] args) {
        List<String> messages = Arrays.asList("hello", "world", "streams", "are", "cool");

        int totalLength = messages.stream()
                .mapToInt(String::length)
                .sum();

        System.out.println("Общая длина всех строк: " + totalLength);
    }
}
