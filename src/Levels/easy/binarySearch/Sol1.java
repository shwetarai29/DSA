package Levels.easy.binarySearch;

public class Sol1 {
    public static int binarySearch(int[] array, int target) {
        return binarySearchHelper(array, target, 0, array.length - 1);
    }

    static int binarySearchHelper(int[] array, int target, int left, int right) {
        while (left <= right) {
            int middle = (left + right) / 2;
            int potentialMatch = array[middle];
            if (target == potentialMatch)
                return middle;
            else if (target > middle)
                left = middle + 1;
            else
                right = middle - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = new int[]{0, 1, 2, 5, 7, 9};
        System.out.println(binarySearch(array, 7));
        System.out.println(binarySearch(array, 1));
    }
}
