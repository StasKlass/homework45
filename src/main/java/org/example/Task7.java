package org.example;

import java.util.Arrays;
import java.util.List;

public class Task7 {
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(2, 3, 5, 7, 11);

        int sum = values.stream()
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("Сумма всех чисел в списке: " + sum);
    }
}
