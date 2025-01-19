package com.dsa.generic.apple;

/**
 * 200. Number of Islands
 * Given an m x n 2D binary grid grid which represents a map of '1's (land) and '0's (water), return the number of islands.
 * An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.
 * Example 1:
 * Input: grid = [
 * ["1","1","1","1","0"],
 * ["1","1","0","1","0"],
 * ["1","1","0","0","0"],
 * ["0","0","0","0","0"]
 * ]
 * Output: 1
 * Example 2:
 * Input: grid = [
 * ["1","1","0","0","0"],
 * ["1","1","0","0","0"],
 * ["0","0","1","0","0"],
 * ["0","0","0","1","1"]
 * ]
 * Output: 3
 */

public class NumberOfIslands {
    public static void main(String[] args) {
        char[][] grid = {
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}
        };
        System.out.println("Number of Islands present : " + numIslands(grid));
    }

    public static int numIslands(char[][] grid) {
        int numberOfIslands = 0;
        for(int i=0;i<grid.length;i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j] == '1'){
                    numberOfIslands++;
                    updateSideElementsWithWater(grid, i, j);
                }
            }
        }
        return numberOfIslands;
    }

    private static void updateSideElementsWithWater(char[][] grid, int row, int col) {
        if(row<0 || row>=grid.length || col<0 || col>=grid[0].length || grid[row][col] == '0'){
            return;
        }
        grid[row][col] = '0';
        updateSideElementsWithWater(grid, row-1, col);
        updateSideElementsWithWater(grid, row+1, col);
        updateSideElementsWithWater(grid, row, col-1);
        updateSideElementsWithWater(grid, row, col+1);
    }
}
