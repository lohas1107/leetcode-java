package dev.hello.leetcode.maximum_nesting_depth_of_two_valid_parentheses_strings;

class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int[] depth = new int[seq.length()];
        int group = -1;

        for (int i = 0; i < seq.length(); i++) {
            if (seq.charAt(i) == '(') {
                group++;
                depth[i] = group % 2;
            } else {
                depth[i] = group % 2;
                group--;
            }
        }

        return depth;
    }
}
