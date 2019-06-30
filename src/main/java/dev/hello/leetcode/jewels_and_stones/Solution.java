package dev.hello.leetcode.jewels_and_stones;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int numJewelsInStones(String J, String S) {
        Set<Character> jewelSet = new HashSet<>();
        int count = 0;

        for (Character jewel : J.toCharArray()) {
            jewelSet.add(jewel);
        }

        for (Character stone : S.toCharArray()) {
            if (jewelSet.contains(stone)) {
                count++;
            }
        }

        return count;
    }
}
