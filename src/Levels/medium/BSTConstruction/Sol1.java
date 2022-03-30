package Levels.medium.BSTConstruction;

public class Sol1 {
    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }

        // Average: O(log(n)) time | O(1) space
        // Worst: O(n) time | O(1) space
        public BST insert(int value) {
            BST current = this;
            while (true) {
                if (value < current.value) {
                    if (current.left == null) {
                        current.left = new BST(value);
                        break;
                    } else {
                        current = current.left;
                    }
                } else {
                    if (current.right == null) {
                        current.right = new BST(value);
                        break;
                    } else {
                        current = current.right;
                    }
                }
            }
            return this;
        }

        // Average: O(log(n)) time | O(1) space
        // Worst: O(n) time | O(1) space
        public boolean contains(int value) {
            BST current = this;
            while (current != null) {
                if (value < current.value)
                    current = current.left;
                else if (value > current.value)
                    current = current.right;
                else return true;
            }
            return false;
        }

        // Average: O(log(n)) time | O(1) space
        // Worst: O(n) time | O(1) space
        public BST remove(int value) {
            return remove(value, null);
        }

        public BST remove(int value, BST parent) {
            BST current = this;
            while (current != null) {
                if (value < current.value) {
                    parent = current;
                    current = current.left;
                } else if (value > current.value) {
                    parent = current;
                    current = current.right;
                } else {
                    if (current.left != null && current.right != null) {
                        current.value = getMinValue(current.right);
                        current.right.remove(current.value, current);
                    } else if (parent == null) {
                        if (current.left != null) {
                            current.value = current.left.value;
                            current.right = current.left.right;
                            current.left = current.left.left;
                        } else if (current.right != null) {
                            current.value = current.right.value;
                            current.left = current.right.left;
                            current.right = current.right.left;
                        } else {
                        }
                    } else if (parent.left == current) {
                        parent.left = current.left != null ? current.left : current.right;
                    } else if (parent.right == current) {
                        parent.right = current.left != null ? current.left : current.right;
                    }
                    break;
                }
            }
            return this;
        }
    }

    public static int getMinValue(BST node) {
        BST current = node;
        while (current != null) {
            current = current.left;
        }
        return current.value;
    }

}
