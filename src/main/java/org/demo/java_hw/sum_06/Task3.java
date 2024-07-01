package org.demo.java_hw.sum_06;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 * Напишите метод, который принимает список строк и логику обрабоктки.
 * Основной метод возвращает список целых чисел - результатов применения функции к каждой строке.
 * Например, преобразовать список имен в список длин этих имен.
 */
public class Task3 {
    public static void main(String[] args) {
        List<String> strings = List.of("Ivan", "Ekaterina", "Iosif", "Oleg", "Ursula");
        Function<String, Integer> function =  s -> s.length();
        System.out.println(getLength(strings,function));
    }
    static List<Integer> getLength (List<String> strings, Function<String, Integer> function){
        List<Integer> lengths = new ArrayList<>();
        for (String s : strings) {
           lengths.add(function.apply(s));
        }
        return lengths;
    }
}
