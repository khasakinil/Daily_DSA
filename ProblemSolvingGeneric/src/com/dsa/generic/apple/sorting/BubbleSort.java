package com.dsa.generic.apple.sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 9, 21, 45, 82, 7, 3, 1};
        printArray(arr);
        bubbleSort(arr);
        printArray(arr);
    }

    private static void printArray(int[] arr) {
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
