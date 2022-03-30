package Levels.medium.validateBST;

public class Sol1 {
    public static boolean validateBst(BST tree) {
        return validateBstHelper(tree, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public static boolean validateBstHelper(BST tree, int min, int max) {
        if (tree.value < min || tree.value >= max)
            return false;
        if (tree.left != null && !validateBstHelper(tree, min, tree.left.value))
            return false;
        if (tree.right != null && !validateBstHelper(tree, tree.right.value, max))
            return false;
        return true;
    }

    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }
    }
}
