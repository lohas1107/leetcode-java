package dev.hello.leetcode.range_sum_of_bst;

import dev.hello.structures.TreeNode;

class Solution {

    private int rangeSum = 0;

    public int rangeSumBST(TreeNode root, int L, int R) {
        if (root.val >= L && root.val <= R) rangeSum += root.val;
        if (root.left != null ) rangeSumBST(root.left, L, R);
        if (root.right != null ) rangeSumBST(root.right, L, R);
        return rangeSum;
    }
}
