package dev.hello.leetcode.binary_search_tree_to_greater_sum_tree;

import dev.hello.structures.TreeNode;

class Solution {

    private int sum = 0;

    public TreeNode bstToGst(TreeNode root) {
        if (root.right != null) bstToGst(root.right);
        sum = root.val = sum + root.val;
        if (root.left != null) bstToGst(root.left);
        return root;
    }
}
