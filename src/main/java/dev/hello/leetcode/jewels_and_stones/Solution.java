package dev.hello.leetcode.jewels_and_stones;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int numJewelsInStones(String J, String S) {
        if (J == null || S == null) return 0;

        char[] stones = S.toCharArray();
        char[] jewels = J.toCharArray();

        Map<Character, Integer> stoneMap = new HashMap<>();
        int result = 0;

        for (Character stone : stones) {
            stoneMap.computeIfPresent(stone, (key, value) -> value += 1);
            stoneMap.putIfAbsent(stone, 1);
        }

        for (Character jewel : jewels) {
            if (stoneMap.containsKey(jewel)) {
                result += stoneMap.get(jewel);
            }
        }

        return result;
    }
}
