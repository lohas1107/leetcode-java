package dev.hello.leetcode.binary_search_tree_to_greater_sum_tree;

import dev.hello.structures.TreeNode;

import java.util.Stack;

class Solution {
    public TreeNode bstToGst(TreeNode root) {

        Stack<TreeNode> treeNodeStack = new Stack<>();
        TreeNode node = root;
        int sum = 0;

        while (node != null || !treeNodeStack.isEmpty()) {
            while (node != null) {
                treeNodeStack.push(node);
                node = node.right;
            }

            node = treeNodeStack.pop();
            sum += node.val;
            node.val = sum;

            node = node.left;
        }

        return root;
    }
}
