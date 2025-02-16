package com.dsa.generic.apple.sorting;

import java.util.ArrayList;
import java.util.Collections;

public class BucketSort {
    public static void main(String args[]) {
        int[] arr = {5, 2, 8, 9, 21, 45, 82, 7, 3, 1};
        System.out.println("Selection Sort - ");
        printArray(arr);
        bucketSort(arr);
        printArray(arr);
    }

    private static void bucketSort(int[] arr) {
        int numOfBuckets = (int) Math.ceil(Math.sqrt(arr.length));
        int maxValueDivisor = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxValueDivisor) {
                maxValueDivisor = arr[i];
            }
        }

        ArrayList<Integer>[] buckets = new ArrayList[numOfBuckets];

        //initialize empty buckets
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new ArrayList<>();
        }

        //put elements in the appropriate bucket
        for (int value : arr) {
            int bucketNumber = (int) Math.ceil((double) (value * numOfBuckets) / maxValueDivisor);
            buckets[bucketNumber - 1].add(value);
        }

        //print buckets
        System.out.println("\nPrint buckets before sorting : ");
        printBuckets(buckets);

        //sort the buckets
        for (ArrayList<Integer> bucket : buckets) {
            Collections.sort(bucket);
        }


        System.out.println("\nPrint buckets after sorting : ");
        //print buckets
        printBuckets(buckets);

        mergeBucketsInArr(buckets, arr);
    }

    private static void mergeBucketsInArr(ArrayList<Integer>[] buckets, int[] arr) {
        int index = 0;
        for (int i = 0; i < buckets.length; i++) {
            for (int value : buckets[i]) {
                arr[index++] = value;
            }
        }
    }

    private static void printBuckets(ArrayList<Integer>[] buckets) {
        for (int i = 0; i < buckets.length; i++) {
            System.out.println();
            for (int j = 0; j < buckets[i].size(); j++) {
                System.out.print(buckets[i].get(j) + " ");
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
