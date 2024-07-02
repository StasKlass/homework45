package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Task4 {
    public static void main(String[] args) {
        List<String> tools = Arrays.asList("hammer", "jack", "wrench");

        Optional<String> firstTool = tools.stream()
                .filter(tool -> tool.startsWith("j"))
                .findFirst();

        if (firstTool.isPresent()) {
            System.out.println("Первый элемент, начинающийся на букву 'j': " + firstTool.get());
        } else {
            System.out.println("Элементов, начинающихся на букву 'j', не найдено");
        }
    }
}
