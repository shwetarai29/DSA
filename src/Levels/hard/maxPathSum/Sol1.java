package Levels.hard.maxPathSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sol1 {
    // O(n) time | O(log(n)) space
    public static int maxPathSum(BinaryTree tree) {
        List<Integer> maxSumArray = findMaxSum(tree);
        return maxSumArray.get(1);
    }

    public static List<Integer> findMaxSum(BinaryTree tree) {
        if (tree == null) {
            return new ArrayList<>(Arrays.asList(0, 0));
        }
        List<Integer> leftMaxSumArray = findMaxSum(tree.left);
        Integer leftMaxSumAsBranch = leftMaxSumArray.get(0);
        Integer leftMaxPathSum = leftMaxSumArray.get(1);

        List<Integer> rightMaxSumArray = findMaxSum(tree.right);
        Integer rightMaxSumAsBranch = rightMaxSumArray.get(0);
        Integer rightMaxPathSum = rightMaxSumArray.get(1);

        int maxChildSumAsBranch = Math.max(leftMaxSumAsBranch, rightMaxSumAsBranch);

        int maxSumAsBranch = Math.max(maxChildSumAsBranch + tree.value, tree.value);

        int maxSumAsRootNode = Math.max(leftMaxSumAsBranch + tree.value + rightMaxSumAsBranch, maxSumAsBranch);

        int maxPathSum = Math.max(leftMaxPathSum, Math.max(rightMaxPathSum, maxSumAsRootNode));
        return new ArrayList<>(Arrays.asList(maxSumAsBranch, maxPathSum));
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
