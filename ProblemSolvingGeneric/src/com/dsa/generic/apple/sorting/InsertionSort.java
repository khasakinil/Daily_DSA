package com.dsa.generic.apple.sorting;

public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 9, 21, 45, 82, 7, 3, 1};
        printArray(arr);
        insertionSort(arr);
        printArray(arr);
    }

    private static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int currentNum = arr[i], j = i;
            while (j > 0 && arr[j - 1] > currentNum) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = currentNum;
        }
    }

    private static void printArray(int[] arr) {
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
