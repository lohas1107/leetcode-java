package dev.hello.utils;

import dev.hello.structures.TreeNode;

import java.util.*;

public class TreeUtil {

    public static TreeNode loadNodeBfs(Integer[] values) {
        if (values.length == 0) return null;
        return bfs(values, 0);
    }

    public static Integer[] flattenNodeBfs(TreeNode root) {
        List<Integer> nodeList = new ArrayList<>();

        Queue<Optional<TreeNode>> nodeQueue = new ArrayDeque<>();
        nodeQueue.add(Optional.ofNullable(root));

        while (!nodeQueue.isEmpty()) {
            Optional<TreeNode> treeNodeOptional = nodeQueue.poll();

            if (treeNodeOptional.isPresent()) {
                nodeList.add(treeNodeOptional.get().val);
                nodeQueue.add(Optional.ofNullable(treeNodeOptional.get().left));
                nodeQueue.add(Optional.ofNullable(treeNodeOptional.get().right));
            } else {
                nodeList.add(null);
            }
        }

        return nodeList.toArray(new Integer[0]);
    }

    private static TreeNode bfs(Integer[] nodes, int index) {
        if (index >= nodes.length || nodes[index] == null ) return null;

        TreeNode node = new TreeNode(nodes[index]);
        node.left = bfs(nodes, 2 * index + 1);
        node.right = bfs(nodes, 2 * index + 2);

        return node;
    }

}
