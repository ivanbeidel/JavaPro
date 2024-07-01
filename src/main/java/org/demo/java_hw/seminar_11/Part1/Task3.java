package org.demo.java_hw.seminar_11.Part1;

import java.util.List;

//Преобразовать список строк в список их длин.
public class Task3 {
    public static void main(String[] args) {
        List<String> strings = List.of("Ford", "Mercedes", "BMW", "Volkswagen");

        List<Integer> lengths = strings.stream()
                .map(s -> s.length())
                .toList();
        System.out.println(lengths);
    }
}
