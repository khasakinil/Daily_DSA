package com.dsa.generic.apple.sorting;

public class SelectionSort {
    public static void main(String args[]) {
        int[] arr = {5, 2, 8, 9, 21, 45, 82, 7, 3, 1};
        System.out.println("Selection Sort - ");
        printArray(arr);
        selectionSort(arr);
        printArray(arr);
    }

    private static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }
    }

    private static void printArray(int[] arr) {
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
