package org.demo.java_hw.seminar_11.Part2;

import java.util.List;

//Отфильтровать список строк так, чтобы остались только строки, содержащие цифры.
public class Task2 {
    public static void main(String[] args) {
        List<String> strings = List.of("BMW E36" ,"Skoda Octavia", "Mercedes W222", "VAZ 2109", "Honda Civic");

        List<String> stringsWithDigit = strings.stream()
                .filter(string -> string.matches(".*\\d.*"))
                .toList();
        System.out.println(stringsWithDigit);
    }
}
