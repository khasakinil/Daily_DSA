package com.dsa.generic.apple;

/**
 * Given an array arr, rotate the array by one position in clockwise direction.
 * Examples:
 * Input: arr[] = [1, 2, 3, 4, 5]
 * Output: [5, 1, 2, 3, 4]
 * Explanation: If we rotate arr by one position in clockwise 5 come to the front and remaining those are shifted to the end.
 * Input: arr[] = [9, 8, 7, 6, 4, 2, 1, 3]
 * Output: [3, 9, 8, 7, 6, 4, 2, 1]
 * Explanation: After rotating clock-wise 3 comes in first position.
 */

public class RotateArrayByOne {
    public static void main(String[] args) {
        int distance = 1;
        int[] arr = {1, 2, 3, 4, 5};
        printArrayElements(arr);
        rotateArray(arr, distance);
        printArrayElements(arr);
    }

    private static void printArrayElements(int[] arr) {
        System.out.println();
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    private static void rotateArray(int[] arr, int distance) {
        int current = arr[arr.length - 1];
        for (int i = arr.length - 1; i >= 0; i--) {
            if (i == 0) {
                arr[i] = current;
            } else {
                arr[i] = arr[i - distance];
            }
        }
    }
}
