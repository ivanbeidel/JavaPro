package org.demo.java_hw.sum_06;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

/**
 * Реализуйте метод, который принимает список чисел и унарный оператор,
 * а возвращает новый список, где каждый элемент преобразован с помощью переданного оператора.
 * Например, увеличить каждое число на 1.
 */
public class Task4 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 1, 2, 3, 5, 8, 13, 21);
        UnaryOperator<Integer> unaryOperator = n -> n + 1;
        System.out.println(getNextNumber(numbers,unaryOperator));
    }

    static List<Integer> getNextNumber(List<Integer> numbers, UnaryOperator<Integer> unaryOperator) {
        List<Integer> increasedNum = new ArrayList<>();
        for (Integer number : numbers) {
            increasedNum.add(unaryOperator.apply(number));
        }
        return increasedNum;
    }
}
