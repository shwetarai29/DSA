package Levels.easy.twoNumbers;

import java.util.Arrays;

public class Sol3 {
    // O(nlog(n)) | O(1) space
    static int[] twoNumberSum(int[] inputArray, int targetSum) {
        Arrays.sort(inputArray);
        int left = 0;
        int right = inputArray.length - 1;
        while (left < right) {
            int currentSum = inputArray[left] + inputArray[right];
            if (currentSum == targetSum) {
                return new int[]{inputArray[left], inputArray[right]};
            } else if (currentSum < targetSum) {
                left++;
            } else if (currentSum > targetSum) {
                right--;
            }
        }
        return new int[0];
    }

    public static void main(String[] args) {
        int[] input = new int[]{2,7,11,15};//{10, 1, 5, 11, 0, 15, 3, 2};
        int target = 9;//8;
        System.out.println("Using sort  O(log n)) time | O(1) space");
        System.out.println(Arrays.toString(input));
        System.out.println(Arrays.toString(twoNumberSum(input, target)));
    }
}
