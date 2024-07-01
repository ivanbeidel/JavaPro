package org.demo.java_hw.sum_06;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;

//Напишите метод, который объединяет два списка в один, используя бинарный
// оператор для определения, как именно объединять элементы.
// Например, сложить попарно элементы двух числовых списков.
public class Task5 {
    public static void main(String[] args) {
        List<Integer> numbers1 = List.of(1, 3, 5, 7, 9);
        List<Integer> numbers2 = List.of(2, 4, 6, 8, 10);
        BinaryOperator<Integer> binaryOperator = (n1, n2) -> n1 + n2;
        System.out.println(sumLists(numbers1, numbers2, binaryOperator));
    }

    static List<Integer> sumLists(List<Integer> numbers1, List<Integer> numbers2, BinaryOperator<Integer> binaryOperator) {
        List<Integer> summed = new ArrayList<>();
        for (int i = 0; i < numbers1.size(); i++) {
            summed.add(binaryOperator.apply(numbers1.get(i), numbers2.get(i)));
        }
        return summed;
    }
}
