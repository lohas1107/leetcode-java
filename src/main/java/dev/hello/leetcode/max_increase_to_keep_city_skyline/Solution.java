package dev.hello.leetcode.max_increase_to_keep_city_skyline;

class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        if (grid.length == 0) return 0;

        int[] rowSkyline = new int[grid.length];
        int[] columnSkyline = new int[grid[0].length];

        int maxIncrease = 0;

        for (int i = 0; i < rowSkyline.length; i++) {
            for (int j = 0; j < columnSkyline.length; j++) {
                if (grid[i][j] > rowSkyline[i]) rowSkyline[i] = grid[i][j];
                if (grid[i][j] > columnSkyline[j]) columnSkyline[j] = grid[i][j];
            }
        }

        for (int i = 0; i < rowSkyline.length; i++) {
            for (int j = 0; j < columnSkyline.length; j++) {
                if (rowSkyline[i] <= columnSkyline[j]) {
                    maxIncrease += (rowSkyline[i] - grid[i][j]);
                } else {
                    maxIncrease += (columnSkyline[j] - grid[i][j]);
                }
            }
        }

        return maxIncrease;
    }
}
