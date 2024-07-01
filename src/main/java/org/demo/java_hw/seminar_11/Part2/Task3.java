package org.demo.java_hw.seminar_11.Part2;

import org.apache.commons.lang3.tuple.Pair;

import java.util.List;

//Преобразовать список кортежей (имя, возраст) в список строк с описанием (имя is в возраст год(а/лет)).
public class Task3 {
    public static void main(String[] args) {
        List<Pair<String, Integer>> pairs = List.of(
                Pair.of("Alina", 30),
                Pair.of("Marsel", 24),
                Pair.of("Patrick", 21),
                Pair.of("Laura", 18)
        );

        List<String> strings = pairs.stream()
                .map(p -> p.getKey() + " is " + p.getValue() + " год(а/лет)")
                .toList();
        System.out.println(strings);
    }
}

