package org.demo.alg_hw._02;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number");
        int n = scanner.nextInt();
        int i = 0;
        int j = 0;
        int a = 0;

        for (i = n / 2; i <= n; i++) {//O(n)
            for (j = 2; j <= n; j = j * 2) { //O(log n)
                a = a + n / 2;
            }
        }
    }//O(n log n) общая сложность - линейно - логарифмическая
}
