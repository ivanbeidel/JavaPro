package org.demo.alg_hw._03;

import java.util.Stack;

public class Hanoi {
    public static void main(String[] args) {
        int n = 3;

        Stack<Integer> left = new Stack<>();
        Stack<Integer> middle = new Stack<>();
        Stack<Integer> right = new Stack<>();

        for (int i = n; i > 0; i--) {
            left.push(i);
        }
        moveDiscs(n, left, middle, right);
    }

    public static void moveDiscs(int n, Stack<Integer> left, Stack<Integer> middle, Stack<Integer> right) {
        if (n == 1) {
            right.push(left.pop());
            printTowers(left, middle, right);
            return;
        }
        moveDiscs(n - 1, left, right, middle);
        right.push(left.pop());
        printTowers(left, middle, right);
        moveDiscs(n - 1, middle, left, right);
    }

    public static void printTowers(Stack<Integer> left, Stack<Integer> middle, Stack<Integer> right) {
        System.out.println("Left: " + left);
        System.out.println("Middle: " + middle);
        System.out.println("Right: " + right);
        System.out.println("----------");
    }
}
