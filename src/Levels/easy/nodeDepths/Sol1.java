package Levels.easy.nodeDepths;

public class Sol1 {

    public static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;

        BinaryTree(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    static Integer depth(BinaryTree root) {
        return calculateDepth(root, 0);
    }

    static Integer calculateDepth(BinaryTree root, Integer depth) {
        if (root == null)
            return 0;
        return depth + calculateDepth(root.left, depth + 1) + calculateDepth(root.right, depth + 1);
    }

    public static void main(String args[]) {

        BinaryTree root = new BinaryTree(9);
        root.left = new BinaryTree(4);
        root.right = new BinaryTree(17);
        root.left.left = new BinaryTree(3);
        root.left.right = new BinaryTree(6);
        root.left.right.left = new BinaryTree(5);
        root.left.right.right = new BinaryTree(7);
        root.right.right = new BinaryTree(22);
        root.right.right.left = new BinaryTree(20);
        System.out.println(depth(root));

    }
}
