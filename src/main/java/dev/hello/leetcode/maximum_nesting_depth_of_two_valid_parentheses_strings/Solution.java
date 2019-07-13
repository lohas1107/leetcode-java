package dev.hello.leetcode.maximum_nesting_depth_of_two_valid_parentheses_strings;

import java.util.Stack;

class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        Stack<Character> stack = new Stack<>();
        int[] depth = new int[seq.length()];

        for (int i = 0; i < seq.length(); i++) {
            if (seq.charAt(i) == '(') {
                stack.push(seq.charAt(i));
                depth[i] = stack.size() % 2;
            } else {
                depth[i] = stack.size() % 2;
                stack.pop();
            }
        }

        return depth;
    }
}
