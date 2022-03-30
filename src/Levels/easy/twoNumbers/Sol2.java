package Levels.easy.twoNumbers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Sol2 {
    static int[] twoNumberSum(int[] inputArray, int targetSum) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < inputArray.length; i++) {
            int y = targetSum - inputArray[i];
            if (map.containsKey(y)) {
                return new int[]{map.get(y), i};
            }
            map.put(inputArray[i], i);
        }
        return null;
    }

    public static void main(String[] args) {
        int[] input = new int[]{2, 7, 11, 15};//{10, 1, 5, 11, 0, 15, 3, 2};
        int target = 26;//8;
        System.out.println("Using hashmap  O(log n)) time | O(n) space");
        System.out.println(Arrays.toString(input));
        System.out.println(Arrays.toString(twoNumberSum(input, target)));
    }
}
