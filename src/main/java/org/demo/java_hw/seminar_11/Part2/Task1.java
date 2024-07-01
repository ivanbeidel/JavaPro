package org.demo.java_hw.seminar_11.Part2;

import java.util.List;

//Преобразовать список слов в список их анаграмм.
public class Task1 {
    public static void main(String[] args) {
        List<String> strings = List.of( "Мир", "Кот", "Лес", "Сон");

        List<String> anagramList = strings.stream()
                .map(s -> new StringBuilder(
                        s.toLowerCase()).reverse().toString())
                .toList();
        System.out.println(anagramList);

    }
}
