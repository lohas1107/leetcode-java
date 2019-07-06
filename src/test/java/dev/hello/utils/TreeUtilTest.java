package dev.hello.utils;

import dev.hello.structures.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TreeUtilTest {

    @Test
    void loadNodeBfs() {
        assertNull(TreeUtil.loadNodeBfs(new Integer[0]));

        Integer[] source = new Integer[] { 4, 1, 6, 0, 2, 5, 7, null, null, null, 3, null, null, null, 8};
        TreeNode root = TreeUtil.loadNodeBfs(source);

        assertNotNull(root);
        assertEquals(4, root.val);
        assertEquals(1, root.left.val);
        assertEquals(6, root.right.val);
        assertEquals(0, root.left.left.val);
        assertEquals(2, root.left.right.val);
        assertEquals(5, root.right.left.val);
        assertEquals(7, root.right.right.val);
        assertNull(root.left.left.left);
        assertNull(root.left.left.right);
        assertNull(root.left.right.left);
        assertEquals(3, root.left.right.right.val);
        assertNull(root.right.left.left);
        assertNull(root.right.left.right);
        assertNull(root.right.right.left);
        assertEquals(8, root.right.right.right.val);
    }

    @Test
    void flattenNodeBfs() {
        Integer[] source = new Integer[] { 4, 1, 6, 0, 2, 5, 7, null, null, null, 3, null, null, null, 8};
        TreeNode root = TreeUtil.loadNodeBfs(source);
        Integer[] result = TreeUtil.flattenNodeBfs(root);

        for (int i = 0; i < source.length; i++) {
            assertEquals(source[i], result[i]);
        }
    }
}