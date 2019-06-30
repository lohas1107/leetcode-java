package dev.hello.leetcode.jewels_and_stones;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void numJewelsInStones() {
        Solution solution = new Solution();
        assertEquals(0, solution.numJewelsInStones("aA", null));
        assertEquals(0, solution.numJewelsInStones(null, "aAAbbbb"));
        assertEquals(0, solution.numJewelsInStones(null, null));
        assertEquals(3, solution.numJewelsInStones("aA", "aAAbbbb"));
        assertEquals(0, solution.numJewelsInStones("z", "ZZ"));
    }
}