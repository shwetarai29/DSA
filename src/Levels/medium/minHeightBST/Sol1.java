package Levels.medium.minHeightBST;

import java.util.List;

public class Sol1 {

    public static BST minHeightBst(List<Integer> array) {
        return constructMinHeightBst(array, 0, array.size() - 1);
    }

    public static BST constructMinHeightBst(List<Integer> array, int startIdx, int endIdx) {
        if (endIdx < startIdx)
            return null;
        int midIdx = (startIdx + endIdx) / 2;
        BST bst = new BST(array.get(midIdx));
        bst.left = constructMinHeightBst(array, startIdx, midIdx - 1);
        bst.right = constructMinHeightBst(array, midIdx + 1, endIdx);
        return bst;
    }

    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
            left = null;
            right = null;
        }

        // We don't use this method for this solution.
        public void insert(int value) {
            if (value < this.value) {
                if (left == null) {
                    left = new BST(value);
                } else {
                    left.insert(value);
                }
            } else {
                if (right == null) {
                    right = new BST(value);
                } else {
                    right.insert(value);
                }
            }
        }
    }
}
