package org.demo.java_hw.seminar_11.Part1;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

//Преобразовать список дат в список строк в формате "год-месяц".
public class Task5 {
    public static void main(String[] args) {
        List<LocalDate> dates = List.of(
                LocalDate.of(1993, 10, 8),
                LocalDate.of(1993, 12,7),
                LocalDate.of(2017, 9, 12),
                LocalDate.of(2018, 5, 12),
                LocalDate.of(2019, 6, 18)
        );

        List<String> formatedDates = dates.stream()
                .map( localDate -> localDate.getYear() + "-" + localDate.getMonthValue())
                .toList();
        System.out.println(formatedDates);
    }
}
