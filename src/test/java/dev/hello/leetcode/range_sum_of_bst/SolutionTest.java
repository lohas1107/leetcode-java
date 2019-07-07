package dev.hello.leetcode.range_sum_of_bst;

import dev.hello.structures.TreeNode;
import dev.hello.utils.TreeUtil;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void rangeSumBST1() {
        Integer[] source = new Integer[] { 10, 5, 15, 3, 7, null, 18 };
        TreeNode root = TreeUtil.loadNodeBfs(source);
        assertNotNull(root);

        Solution solution = new Solution();
        assertEquals(32, solution.rangeSumBST(root, 7, 15));
    }

    @Test
    void rangeSumBST2() {
        Integer[] source = new Integer[] { 10, 5, 15, 3, 7, 13, 18, 1, null, 6 };
        TreeNode root = TreeUtil.loadNodeBfs(source);
        assertNotNull(root);

        Solution solution = new Solution();
        assertEquals(23, solution.rangeSumBST(root, 6, 10));
    }
}