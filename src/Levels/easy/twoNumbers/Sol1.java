package Levels.easy.twoNumbers;

import java.util.Arrays;

public class Sol1 {
    // Average: O(n^2)) time | O(1) space
    static int[] twoNumberSum(int[] inputArray, int targetSum) {
        for (int k : inputArray) {
            for (int j = 1; j < inputArray.length; j++) {
                if (k + inputArray[j] == targetSum) {
                    return new int[]{k, inputArray[j]};
                }
            }
        }
        return new int[0];
    }

    public static void main(String[] args) {
        int[] input = new int[]{2,7,11,15};//{10, 1, 5, 11, 0, 15, 3, 2};
        int target = 9;//8;
        System.out.println("Using for loop O(n^2)) time | O(1) space");
        System.out.println(Arrays.toString(input));
        System.out.println(Arrays.toString(twoNumberSum(input, target)));
    }
}
