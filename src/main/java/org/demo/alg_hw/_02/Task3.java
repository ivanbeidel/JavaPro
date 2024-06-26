package org.demo.alg_hw._02;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number");
        int n = scanner.nextInt(); //+1
        int a = 0;

        for (int i = 0; i < n; i++) { //O(n)
            for (int j = n; j < i; j--) {      //O(n)
                a = a + i + j;
            }
        }
    }
    //O(n^2) общая сложность - квадратичная
}
