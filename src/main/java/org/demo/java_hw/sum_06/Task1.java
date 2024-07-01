package org.demo.java_hw.sum_06;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

//Напишите метод, который принимает список строк и предикат, и возвращает новый список,
// содержащий только те строки, которые удовлетворяют условию предиката. Например,
// отфильтровать все строки длиннее 5 символов.
public class Task1 {
    public static void main(String[] args) {
        List<String> strings = List.of("1122233", "Oleg", "Ivan", "Audio", "Banana", "12256677", "password");
        Predicate<String> predicate = s -> s.length() > 5;
        System.out.println(filter(strings, predicate));
    }

    static List<String> filter(List<String> strings, Predicate<String> predicate) {
        List<String> str = new ArrayList<>();
        for (String string : strings) {
            if (predicate.test(string)) {
                str.add(string);
            }
        } return str;
    }


}
