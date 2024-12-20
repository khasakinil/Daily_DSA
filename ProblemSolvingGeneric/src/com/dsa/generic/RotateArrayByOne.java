package com.dsa.generic;

/*
Given an array arr, rotate the array by one position in clock-wise direction.
Examples:
Input: arr = [1, 2, 3, 4, 5]
Output: [5, 1, 2, 3, 4]
Explanation: If we rotate arr by one position in clockwise 5 come to the front and remaining those are shifted to the end.
Input: arr = [9, 8, 7, 6, 4, 2, 1, 3]
Output: [3, 9, 8, 7, 6, 4, 2, 1]
Explanation: After rotating clock-wise 3 comes in first position.
*/

public class RotateArrayByOne {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Before Rotation");
        printArrayValues(arr);
        getRotatedArray(arr);
        System.out.println("\n\nAfter Rotation");
        printArrayValues(arr);
    }

    private static void printArrayValues(int[] arr) {
        System.out.println();
        for (int currentVal : arr) {
            System.out.print(currentVal + " ");
        }
    }

    private static void getRotatedArray(int[] arr) {
        int current = arr[arr.length-1];
        for(int i=arr.length-1; i>=0; i--) {
            if(i==0){
                arr[i] = current;
            }else{
                arr[i] = arr[i-1];
            }
        }
    }
}
