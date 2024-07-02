package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task6 {
    public static void main(String[] args) {
        List<String> animals = Arrays.asList("ant", "bear", "alligator");

        Map<Character, List<String>> groupedByFirstLetter = animals.stream()
                .collect(Collectors.groupingBy(animal -> animal.charAt(0)));

        groupedByFirstLetter.forEach((letter, list) -> {
            System.out.println("Буква: " + letter);
            list.forEach(animal -> System.out.println("  " + animal));
        });
    }
}
