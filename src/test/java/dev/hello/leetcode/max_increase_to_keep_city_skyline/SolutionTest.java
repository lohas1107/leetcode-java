package dev.hello.leetcode.max_increase_to_keep_city_skyline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void maxIncreaseKeepingSkyline() {
        Solution solution = new Solution();
        assertEquals(35, solution.maxIncreaseKeepingSkyline(new int[][] {
                {3, 0, 8, 4},
                {2, 4, 5, 7},
                {9, 2, 6, 3},
                {0, 3, 1, 0} }));
    }
}