package practice.Arrays;

import java.util.List;

public class SumMaxSubArrayKadaneAlgo {
    public static int maxSubArray(int[] nums) {
        int sum = nums[0];
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int temp = nums[i];
            sum = Math.max(temp, sum + temp);
            max = Math.max(max, sum);
        }
        return max;
    }

    public int maxSubArray(final List<Integer> A) {
        int sum = A.get(0);
        int max = A.get(0);
        for (int i = 1; i < A.size(); i++) {
            int temp =A.get(i);
            sum = Math.max(temp, sum + temp);
            max = Math.max(max, sum);
        }
        return max;
    }

    public static int maxSubArray1(int[] array) {
        int maxEndingHere = array[0];
        int maxSoFar = array[0];
        for (int i = 1; i < array.length; i++) {
            int num = array[i];
            maxEndingHere = Math.max(num, maxEndingHere + num);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }
        return maxSoFar;
    }

    public static void main(String[] args) {
        int[] a = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(a));
    }
}
