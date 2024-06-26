package org.demo.alg_hw._02;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number");
        int n = scanner.nextInt();

        if (n == 1) return;

        for (int i = 1; i <= n; i++) { //O(n)
            for (int j = 0; j <= n; j++) { //O(1) константная сложность
                System.out.println("*");
                break;
            }
        }
    } //O(n) общая сложность - линейная
}
