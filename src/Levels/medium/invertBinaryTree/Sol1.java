package Levels.medium.invertBinaryTree;

public class Sol1 {
    public static BinaryTree invertBinaryTree(BinaryTree root) {
        if (root == null) {
            return null;
        }
        BinaryTree right = invertBinaryTree(root.right);
        BinaryTree left = invertBinaryTree(root.left);
        root.left = right;
        root.right = left;
        return root;
    }

    public static void swapLeftAndRight(BinaryTree tree) {
        BinaryTree left = tree.left;
        tree.left = tree.right;
        tree.right = left;
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
