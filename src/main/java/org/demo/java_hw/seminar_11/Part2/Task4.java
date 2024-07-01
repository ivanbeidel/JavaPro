package org.demo.java_hw.seminar_11.Part2;

import java.util.List;

//Отфильтровать список чисел так, чтобы остались только числа, делящиеся на все свои цифры без остатка.
public class Task4 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 44, 652, 31, 778, 322,128);

        List<Integer> filteredNumbers = numbers.stream()
                .filter(n -> isDivisibleByAllDigits(n))
                .toList();
        System.out.println(filteredNumbers);
    }

    static boolean isDivisibleByAllDigits(int number){
        String numberStr = String.valueOf(number);
        for (char c : numberStr.toCharArray()) {
            int digit = Character.getNumericValue(c);
            if (digit == 0 || number % digit != 0) return false;
        } return true;
    }
}
