package org.demo.java_hw.sum_06;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

//Создайте метод, который принимает список чисел и void-метод, отвечающий за логику.
// Метод должен применять переданный void-метод к каждому элементу списка.
// Например, вывести на экран квадрат каждого числа.
public class Task2 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 4, 6, 8, 12, 17, 11, 22);
        Consumer<Integer> consumer = n -> System.out.print(n*n + " ");
        getQuad(numbers, consumer);
    }

    static void getQuad(List<Integer> numbers, Consumer<Integer> consumer) {
        for (Integer number : numbers) {
            consumer.accept(number);
        }
    }
}
