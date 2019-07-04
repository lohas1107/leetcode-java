package dev.hello.leetcode.binary_search_tree_to_greater_sum_tree;

import dev.hello.structures.TreeNode;
import dev.hello.utils.TreeUtil;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void bstToGst() {
        Integer[] source = new Integer[] { 4, 1, 6, 0, 2, 5, 7, null, null, null, 3, null, null, null, 8};
        TreeNode root = TreeUtil.loadNodeBfs(source);

        Solution solution = new Solution();
        root = solution.bstToGst(root);

        Integer[] except = new Integer[] { 30, 36, 21, 36, 35, 26, 15, null, null, null, 33, null, null, null, 8 };
        Integer[] result = TreeUtil.flattenNodeBfs(root);

        for (int i = 0; i < except.length; i++) {
            assertEquals(except[i], result[i]);
        }
    }
}