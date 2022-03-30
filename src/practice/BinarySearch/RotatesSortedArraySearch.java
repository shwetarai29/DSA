package practice.BinarySearch;

import java.util.Arrays;
import java.util.List;

public class RotatesSortedArraySearch {
    public static int search(final List<Integer> A, int B) {
        return searchHelper(A, B, 0, A.size() - 1);
    }

    public static int searchHelper(final List<Integer> array, int target, int left, int right) {
        while (left <= right) {
            int middle = (left + right) / 2;
            Integer potentialMatch = array.get(middle);
            Integer leftNum = array.get(left);
            Integer rightNum = array.get(right);
            if (target == potentialMatch)
                return middle;
            else if (leftNum <= potentialMatch) {
                if (target < potentialMatch && target >= leftNum)
                    right = middle - 1;
                else
                    left = middle + 1;
            } else {
                if (target > potentialMatch && target <= rightNum)
                    left = middle + 1;
                else
                    right = middle - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(search(Arrays.asList(101, 103, 106, 109, 158, 164, 182, 187, 202, 205, 2, 3, 32, 57, 69, 74, 81, 99, 100), 202));
    }
}
