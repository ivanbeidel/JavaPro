package org.demo.alg_hw._05;

import java.util.PriorityQueue;

public class KthElementHeap {
    public static void main(String[] args) {
        int[] arr1 = {100, 112, 256, 349, 770};
        int[] arr2 = {72, 86, 113, 119, 265, 445, 892};
        int k = 7;

        int result = findKthElement(arr1, arr2, k);
        System.out.println("The " + k + "-th element is: " + result);
    }

    public static int findKthElement(int[] arr1, int[] arr2, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int num : arr1) {
            minHeap.offer(num);
        }
        for (int num : arr2) {
            minHeap.offer(num);
        }

        int result = -1;
        for (int i = 0; i < k; i++) {
            result = minHeap.poll();
        }

        return result;
    }
}
