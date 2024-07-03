package org.demo.seminar12_20240703;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ClassTasks {


    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 3, 6, 244, 67, 15, 30, 30);
        List<String> strings = List.of("Nina", "Vadim", "Ivan", "Sergey");
        List<Person> people = List.of(
                new Person("Ivan",30),
                new Person("Vadim",29),
                new Person("Nina",18),
                new Person("Sergey",31)
      );
        System.out.println(divisionNumbers(numbers));
        System.out.println(getIntToString(numbers));
        System.out.println(getIntToString(numbers).get(0).getClass());
        System.out.println(getMaxNumber(numbers));
        System.out.println(getSumNumbers(numbers));
        System.out.println(countElement(numbers));
        System.out.println(sortNumbers(numbers));
        System.out.println(listToString(numbers));
        System.out.println(deletedDuplicate(numbers));
        System.out.println(getMaxLengthString(strings));
        System.out.println(filterByPredicate(strings, "S"));
        System.out.println(skipFirstElements(strings, 2));


    }


    /**
     * Фильтрация чисел: Отфильтровать и вывести числа которые делятся на 3 и на 5.
     */
    public static List<Integer> divisionNumbers(List<Integer> numbers) {
        return numbers.stream()
                .filter(n -> n % 3 == 0 && n % 5 == 0)
                .toList();
    }

    /**
     * Преобразование в строки: Преобразовать список целых чисел в список строк.
     */

    public static List<String> getIntToString(List<Integer> numbers) {
        return numbers.stream()
                .map(n -> n.toString())
                .toList();
    }

    /**
     * Поиск максимального числа: Найти максимальное число в списке.
     */
    public static int getMaxNumber(List<Integer> numbers) {
        return numbers.stream()
                .max((n1, n2) -> n1 - n2)
                .orElse(0);
    }

    /**
     * Суммирование чисел: Найти сумму всех чисел в списке.
     */
    public static int getSumNumbers(List<Integer> numbers) {
        return numbers.stream()
                .mapToInt(n -> n).sum();
    }

    /**
     * Подсчет элементов: Подсчитать количество элементов в списке.
     */
    public static long countElement(List<Integer> numbers) {
        return numbers.stream()
                .mapToInt(n -> n).count();
    }

    /**
     * Сортировка списка: Отсортировать список чисел в порядке возрастания.
     */
    public static List<Integer> sortNumbers(List<Integer> numbers) {
        return numbers.stream()
                .sorted()
                .toList();
    }

    /**
     * Конкатенация строк: Объединить все строки из списка в одну строку, разделенную запятой.
     */
    public static String listToString(List<Integer> numbers) {
        return numbers.stream()
                .map(n -> n.toString()).collect(Collectors.joining(", "));
    }

    /**
     * Удаление дубликатов: Удалить дубликаты из списка чисел.
     */
    public static List<Integer> deletedDuplicate(List<Integer> numbers) {
        return numbers.stream()
                .distinct()
                .toList();
    }

    /**
     * Поиск строки по длине: Найти самую длинную строку в списке.
     */

    public static String getMaxLengthString(List<String> strings) {
        return strings.stream()
                .max((s1, s2) -> s1.length() - s2.length())
                .orElseThrow();
    }

    /**
     * Фильтрация по предикату: Отфильтровать строки, которые начинаются с определенной буквы.
     */

    public static List<String> filterByPredicate(List<String> strings, String s) {
        return strings.stream()
                .filter(string -> string.toLowerCase().startsWith(s.toLowerCase()))
                .toList();
    }

    /**
     * Пропуск первых элементов: Пропустить первые 5 элементов списка и вывести оставшиеся.
     */
    public static List<String> skipFirstElements(List<String> strings, int n) {
        return strings.stream()
                .skip(n)
                .toList();
    }

    /**
     * Создание Map из списка объектов:
     * Преобразовать список объектов в Map, используя одно из полей объектов как ключ.
     */

    public static Map<String, Person> crateMapFromList(List<Person> people){
        return people.stream()
                .collect(Collectors.toMap(Person))
    }
}
