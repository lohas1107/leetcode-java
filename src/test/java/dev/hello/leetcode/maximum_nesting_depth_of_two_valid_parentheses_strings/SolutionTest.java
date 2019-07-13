package dev.hello.leetcode.maximum_nesting_depth_of_two_valid_parentheses_strings;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void maxDepthAfterSplit() {
        Solution solution = new Solution();
        assertEquals("[0, 1, 1, 1, 1, 0]", Arrays.toString(solution.maxDepthAfterSplit("(()())")));
        assertEquals("[0, 0, 0, 1, 1, 0, 0, 0]", Arrays.toString(solution.maxDepthAfterSplit("()(())()")));
    }
}