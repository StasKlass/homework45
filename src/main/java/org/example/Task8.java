package org.example;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class Task8 {
    public static void main(String[] args) {
        List<Integer> stats = Arrays.asList(10, 20, 30, 40, 50);

        IntSummaryStatistics statistics = stats.stream()
                .mapToInt(Integer::intValue)
                .summaryStatistics();

        System.out.println("Минимум: " + statistics.getMin());
        System.out.println("Максимум: " + statistics.getMax());
        System.out.println("Сумма: " + statistics.getSum());
        System.out.println("Среднее: " + statistics.getAverage());
        System.out.println("Количество: " + statistics.getCount());
    }
}
