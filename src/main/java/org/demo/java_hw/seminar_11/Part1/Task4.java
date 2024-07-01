package org.demo.java_hw.seminar_11.Part1;

import java.util.List;

//Отфильтровать список строк так, чтобы остались только строки, начинающиеся с определенной буквы.
public class Task4 {
    public static void main(String[] args) {
        List<String> strings = List.of("Electricity", "Light", "Velocity", "Acceleration", "Lumen");

        List<String> startsSameLetter = strings.stream()
                .filter(s -> s.startsWith("L"))
                .toList();
        System.out.println(startsSameLetter);
    }
}
