package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task5 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 13, 1, 21, 8);

        List<Integer> filteredAndSortedNumbers = numbers.stream()
                .filter(number -> number > 10)
                .sorted()
                .collect(Collectors.toList());

        System.out.println(filteredAndSortedNumbers);
    }
}
