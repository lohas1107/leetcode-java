package dev.hello.leetcode.max_increase_to_keep_city_skyline;

class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int[] rowSkyline = new int[grid.length];
        int[] columnSkyline = new int[grid[0].length];

        int maxIncrease = 0;

        for (int i = 0; i < rowSkyline.length; i++) {
            for (int j = 0; j < columnSkyline.length; j++) {
                rowSkyline[i] = Math.max(rowSkyline[i], grid[i][j]);
                columnSkyline[j] = Math.max(columnSkyline[j], grid[i][j]);
            }
        }

        for (int i = 0; i < rowSkyline.length; i++) {
            for (int j = 0; j < columnSkyline.length; j++) {
                maxIncrease += Math.min(rowSkyline[i], columnSkyline[j]) - grid[i][j];
            }
        }

        return maxIncrease;
    }
}
