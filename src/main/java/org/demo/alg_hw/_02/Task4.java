package org.demo.alg_hw._02;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number");
        int n = scanner.nextInt();
        int a = 0;
        int i = n;
        while (i > 0) {
            a = a + i;
            i = i / 2;//O(log n)
        }
    }
//O(log n) общая сложность - логарифмическая
