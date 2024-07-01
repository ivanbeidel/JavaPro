package org.demo.java_hw.seminar_11.Part1;

import java.util.List;

//Отфильтровать список чисел так, чтобы остались только четные числа.
public class Task2 {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 44,66,7, 55,98);

        List<Integer> filteredList = integers.stream()
                .filter(n -> n % 2 == 0)
                .toList();
        System.out.println(filteredList);
    }

}
