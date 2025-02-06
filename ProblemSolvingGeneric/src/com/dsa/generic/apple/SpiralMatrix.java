package com.dsa.generic.apple;

import java.util.ArrayList;
import java.util.List;

/**
 * 54. Spiral Matrix
 * Given an m x n matrix, return all elements of the matrix in spiral order.
 * Example 1:
 * Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
 * Output: [1,2,3,6,9,8,7,4,5]
 * Example 2:
 * Input: matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
 * Output: [1,2,3,4,8,12,11,10,9,5,6,7]
 */

public class SpiralMatrix {

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("Spiral Order : " + spiralOrder(matrix));
    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> spiralList = new ArrayList<>();
        int colStart = 0;
        int rowStart = 0;
        int colEnd = matrix[0].length - 1;
        int rowEnd = matrix.length - 1;

        while (colStart <= colEnd && rowStart <= rowEnd) {

            // traverse left to right
            for(int i=colStart;i<=colEnd; i++){
                spiralList.add(matrix[rowStart][i]);
            }
            rowStart++;

            // traverse top to bottom
            for(int i=rowStart; i<=rowEnd; i++){
                spiralList.add(matrix[i][colEnd]);
            }
            colEnd--;

            // traverse left to right
            if(rowStart<=rowEnd){
                for(int i=colEnd; i>=colStart; i--){
                    spiralList.add(matrix[rowEnd][i]);
                }
            }
            rowEnd--;

            // traverse bottom to top
            if(colStart<=colEnd){
                for(int i=rowEnd; i>=rowStart; i--){
                    spiralList.add(matrix[i][colStart]);
                }
            }
            colStart++;
        }

        return spiralList;
    }
}
