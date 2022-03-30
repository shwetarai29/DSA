package Levels.medium.invertBinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class Sol2 {
    // O(n) time | O(n) space
    public BinaryTree invertTree(BinaryTree root) {
        if (root == null) return null;
        Queue<BinaryTree> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryTree current = queue.poll();
            BinaryTree temp = current.left;
            current.left = current.right;
            current.right = temp;
            if (current.left != null) queue.add(current.left);
            if (current.right != null) queue.add(current.right);
        }
        return root;
    }

    static class BinaryTree {
        public int value;
        public BinaryTree left;
        public BinaryTree right;

        public BinaryTree(int value) {
            this.value = value;
        }
    }
}
