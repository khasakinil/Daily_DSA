package com.dsa.generic.apple;

/**
 * 48. Rotate Image You are given an n x n 2D matrix representing an image,
 * rotate the image by 90 degrees (clockwise). You have to rotate the image
 * in-place, which means you have to modify the input 2D matrix directly. DO NOT
 * allocate another 2D matrix and do the rotation. Example 1:\ Input: matrix =
 * [[1,2,3],[4,5,6],[7,8,9]] Output: [[7,4,1],[8,5,2],[9,6,3]] Example 2: Input:
 * matrix = [[5,1,9,11],[2,4,8,10],[13,3,6,7],[15,14,12,16]] Output:
 * [[15,13,2,5],[14,3,4,1],[12,6,8,9],[16,7,10,11]]
 */
public class RotateImage {

	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		printArray(matrix);
		int[][] rotateImage = rotateImageWithBruitForce(matrix);
//		printArray(rotateImage);
		rotateImageWithOptimal(matrix);
		printArray(matrix);
	}

	private static void rotateImageWithOptimal(int[][] matrix) {
		int n = matrix.length;
		for (int i = 0; i < (n + 1) / 2; i++) {
			for (int j = 0; j < n / 2; j++) {
				// temp = top left
				int temp = matrix[i][j];

				// top left = bottom left
				matrix[i][j] = matrix[n - j - 1][i];

				// bottom left = bottom right
				matrix[n - j - 1][i] = matrix[n - i - 1][n - j - 1];

				// bottom right = top right
				matrix[n - i - 1][n - j - 1] = matrix[j][n - 1 - i];

				// top right = temp
				matrix[j][n - 1 - i] = temp;
			}
		}
	}

	private static int[][] rotateImageWithBruitForce(int[][] matrix) {
		int newMatrix[][] = new int[matrix.length][matrix.length];
		int newMatrxRow = matrix.length - 1;
		int newMatrxCol = 0;
		for (int i = 0; i < matrix.length; i++) {
			newMatrxCol = 0;
			for (int j = 0; j < matrix.length; j++) {
				newMatrix[newMatrxCol++][newMatrxRow] = matrix[i][j];
			}
			newMatrxRow--;
		}
		return newMatrix;
	}

	private static void printArray(int[][] matrix) {
		System.out.println();
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

}
