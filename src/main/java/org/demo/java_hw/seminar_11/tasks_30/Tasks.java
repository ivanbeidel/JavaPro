package org.demo.java_hw.seminar_11.tasks_30;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Tasks {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(16);
        numbers.add(32);
        numbers.add(64);
        List<String> strings = new ArrayList<>();
        strings.add("Java");
        strings.add("JavaScript");
        strings.add("C++");
        strings.add("Python");
        strings.add("Java");

        System.out.printf("%.2f",getAverage(numbers));
        System.out.println("\n"+countElements(numbers));
        System.out.println(getUpperCase(strings));
        System.out.println(getMaxElem(numbers));
        System.out.println(deleteDuplicate(strings));
        System.out.println(getFirstNElement(numbers, 2));
        System.out.println(isStringStartsWithJ(strings));
        System.out.println(concatLists(strings, numbers));
        System.out.println(getSortList(strings));
        System.out.println(stringToLength(strings));
        System.out.println(getSumOfLengths(strings));
        System.out.println(hasDuplicates(strings));
        System.out.println(countStringsWithLengths(strings, 4));
    }


    /**
     * Найти среднее значение списка чисел.
     */
    public static double getAverage(List<Integer> numbers){
        return numbers.stream()
                .mapToInt(n -> n)
                .average()
                .orElse(0.0);
    }

    /**
     * Посчитать количество элементов в списке.
     */
    public static long countElements(List<Integer> numbers){
        return numbers.stream()
                .count();
    }

    /**
     * Преобразовать список строк в верхний регистр.
     */
    public static List<String> getUpperCase(List<String> strings){
        return strings.stream()
                .map(s -> s.toUpperCase())
                .toList();
    }

    /**
     * Найти максимальный элемент в числовом списке.
     */
    public static int getMaxElem(List<Integer> numbers){
        return numbers.stream()
                .max((n1, n2) -> n1-n2)
                .orElse(0);
    }

    /**
     * Убрать дубликаты из списка.
     */
    public static <T> List<T> deleteDuplicate(List<T> t){
        return t.stream()
                .distinct()
                .toList();
    }

    /**
     * Выбрать первые N элементов списка.
     */
    public static <T> List<T> getFirstNElement(List<T> list, int n){
       return list.stream()
               .limit(n)
               .toList();
    }

    /**
     * Проверить, все ли элементы списка удовлетворяют определенному условию.
     */
    public static boolean isStringStartsWithJ (List<String> strings){
        return strings.stream()
                .allMatch(n -> n.startsWith("J"));
    }

    /**
     * Объединить несколько списков в один.
     */
    public static <T, R> List<Object> concatLists(List<T> list1, List<R> list2){
        return Stream.concat(list1.stream(), list2.stream()).toList();
    }

    /**
     * Отсортировать список строк.
     */
    public static List<String> getSortList(List<String>strings){
        return strings.stream()
                .sorted((s1, s2) -> s1.length()-s2.length())
                .toList();
    }

    /**
     * Преобразовать список строк в мапу, где ключом будет строка, а значением - длина строки.
     */
    public static Map<String, Integer> stringToLength(List<String> strings){
        return strings.stream()
                .distinct()
                .collect(Collectors.toMap(
                        string -> string,
                        string -> string.length()
                ));
    }

    /**
     * Посчитать сумму длин строк в списке.
     */
    public static int getSumOfLengths(List<String> strings){
        return strings.stream()
                .mapToInt(s -> s.length())
                .sum();
    }

    public static boolean hasDuplicates(List<String> strings){
        return strings.stream()
                .anyMatch(s -> strings.stream().filter(s::equals).count()>1);
    }

    /**
     * Посчитать количество строк с определенной длиной.
     */

    public static long countStringsWithLengths (List<String>strings, int n){
        return strings.stream()
                .filter(string -> string.length() == n)
                .count();
    }
}

