package Levels.easy.branchSums;

import java.util.ArrayList;
import java.util.List;

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

    public static List<Integer> branchSums(BinaryTree root) {
        // Write your code here.
        List<Integer> sums = new ArrayList<>();
        calculateSums(root, sums, 0);
        return sums;
    }

    static void calculateSums(BinaryTree root, List<Integer> sums, Integer runningSum) {
        if (root == null)
            return;
        runningSum += root.value;
        if (root.left == null && root.right == null) {
            sums.add(runningSum);
            return;
        }

        calculateSums(root.left, sums, runningSum);
        calculateSums(root.right, sums, runningSum);
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
        System.out.println(branchSums(root));

    }
}
