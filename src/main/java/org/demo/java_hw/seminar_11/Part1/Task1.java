package org.demo.java_hw.seminar_11.Part1;

import java.util.List;

//Преобразовать список чисел в список строк.
public class Task1 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,44,657,99,123,556);

        List<String> strings=  numbers.stream()
                .map(n -> String.valueOf(n))
                .toList();
        System.out.println(strings);
    }
}
