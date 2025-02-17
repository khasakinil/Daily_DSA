package com.dsa.generic.apple.sorting;

public class MergeSort {
    public static void main(String args[]) {
        int[] arr = {5, 2, 8, 9, 21, 45, 82, 7, 3, 1};
        System.out.println("Merge Sort - ");
        printArray(arr);
        mergeSort(arr);
        printArray(arr);
    }

    private static void mergeSort(int[] arr) {
        mergeSort(arr, 0, arr.length - 1);
    }

    private static void mergeSort(int[] arr, int left, int right) {
        if (right > left) {
            int middle = (left + right) / 2;
            mergeSort(arr, left, middle);
            mergeSort(arr, middle + 1, right);
            mergeArr(arr, left, middle, right);
        }
    }

    private static void mergeArr(int[] arr, int left, int middle, int right) {
        int[] leftArrTemp = new int[middle - left + 2];
        int[] rightArrTemp = new int[right - middle + 1];

        for (int i = 0; i <= middle - left; i++) {
            leftArrTemp[i] = arr[left + i];
        }
        for (int i = 0; i < right - middle; i++) {
            rightArrTemp[i] = arr[middle + i + 1];
        }

        leftArrTemp[middle - left + 1] = Integer.MAX_VALUE;
        rightArrTemp[right - middle] = Integer.MAX_VALUE;

        int i = 0, j = 0;
        for (int k = left; k <= right; k++) {
            if (leftArrTemp[i] < rightArrTemp[j]) {
                arr[k] = leftArrTemp[i];
                i++;
            } else {
                arr[k] = rightArrTemp[j];
                j++;
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
