package org.demo.alg_hw._03;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(getFactorialRecursive(6));
        System.out.println(getFactorialIterative(5));
        System.out.println(getFactorialIterative2(5));
    }

    public static long getFactorialRecursive(long n) {
        long factorial = 0;
        if (n == 1) return 1;
        if (n > 1) {
            factorial = n * getFactorialRecursive(n - 1);
        }
        return factorial;
    }

    public static long getFactorialIterative(long n) {
        long factorial = 1;
        while (n > 1) {
            factorial *= n;
            n--;
        }
        return factorial;
    }

    public static long getFactorialIterative2(long n) {
        long factorial = 1;
        for (long i = n; i >= 1; i--) {
            factorial *= n;
            n--;
        }
        return factorial;
    }
}

