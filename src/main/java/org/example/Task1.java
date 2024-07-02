package org.example;

import java.util.Arrays;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "banana", "cherry");

        fruits.stream().forEach(System.out::println);
    }
}
