package Levels.easy.closestValueBST;

public class Sol1 {

    public static void main(String args[])
    {

        BST  root = new BST(9);
        root.left    = new BST(4);
        root.right   = new BST(17);
        root.left.left = new BST(3);
        root.left.right = new BST(6);
        root.left.right.left = new BST(5);
        root.left.right.right = new BST(7);
        root.right.right = new BST(22);
        root.right.right.left = new BST(20);
        int k = 8;
        System.out.println( findClosestValueInBst(root, k));

    }

       /*public static int findClosestValueInBst(BST tree, int target, int closest) {
 public static int findClosestValueInBst(BST tree, int target) {
        // Write your code here.
        return findClosestValueInBst(tree, target, 100);
    }

        // Write your code here.
        BST currentNode = tree;
        while (currentNode != null) {
            if (target - closest > target - currentNode.value)
                closest = currentNode.value;
            if (target < currentNode.value)
                currentNode = currentNode.left;
            else if (target > currentNode.value)
                currentNode = currentNode.right;
            else
                break;
        }
        return closest;
    }*/

    public static int findClosestValueInBst(BST tree, int target) {

        Integer min = Integer.MAX_VALUE;
        Integer closest = Integer.MIN_VALUE;
        BST currentNode = tree;

        while(currentNode != null) {
            if(target == currentNode.value ) return target;

            if(Math.abs(target - currentNode.value) < min) {
                min = Math.abs(target - currentNode.value);
                closest = currentNode.value;
            }

            if(target > currentNode.value) {
                currentNode = currentNode.right;
            } else {
                currentNode = currentNode.left;
            }
        }

        return closest;
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
