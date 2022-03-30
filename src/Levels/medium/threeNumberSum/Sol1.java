package Levels.medium.threeNumberSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sol1 {
    static List<Integer[]> threeNumberSum(int[] inputArray, int targetSum) {
        List<Integer[]> result = new ArrayList<>();
        //int[] x = new int[]{};
        Arrays.sort(inputArray);
        System.out.println(Arrays.toString(inputArray));
        for (int i = 0; i < inputArray.length - 2; i++) {
            int left = i + 1;
            int right = inputArray.length - 1;
            while (left < right) {
                int sum = inputArray[i] + inputArray[left] + inputArray[right];
                if (targetSum == sum) {
                    result.add(new Integer[]{inputArray[i], inputArray[left], inputArray[right]});
                    left++;
                    right--;
                } else if (targetSum > sum) {
                    left++;
                } else if (targetSum < sum)
                    right--;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] input = new int[]{12, 3, 1, 2, -6, 5, -8, 6};//{10, 1, 5, 11, 0, 15, 3, 2};
        int target = 0;//8;
        System.out.println("Using for loop O(n^2)) time | O(1) space");
        System.out.println(Arrays.toString(input));
        threeNumberSum(input, target).forEach(x -> System.out.println(Arrays.toString(x)));
    }
}
