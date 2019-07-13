package dev.hello.leetcode.maximum_nesting_depth_of_two_valid_parentheses_strings;

class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int[] depth = new int[seq.length()];

        for (int i = 0; i < seq.length(); i++) {
            depth[i] = (seq.charAt(i) == '(') ? i & 1 : (1 - i & 1);
        }

        return depth;
    }
}
