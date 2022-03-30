package Levels.hard.FourNoSum;

import java.util.*;

public class Sol1 {
    // Average: O(n^2) time | O(n^2) space
// Worst: O(n^3) time | O(n^2) space
    static List<List<Integer>> fourNumberSum(List<Integer> input, Integer targetSum) {
        Map<Integer, List<List<Integer>>> sumMap = new HashMap<>();
        List<List<Integer>> quadruples = new ArrayList<>();
        for (int i = 1; i < input.size() - 1; i++) {
            for (int j = i + 1; j < input.size(); j++) {
                Integer y = targetSum - (input.get(i) + input.get(j));
                if (sumMap.containsKey(y)) {
                    int finalI = i;
                    int finalJ = j;
                    sumMap.get(y).forEach(list -> {
                        quadruples.add(Arrays.asList(list.get(0), list.get(1), input.get(finalI), input.get(finalJ)));
                    });
                }
            }

            for (int j = 0; j < i; j++) {
                Integer y = input.get(i) + input.get(j);
                if (sumMap.containsKey(y))
                    sumMap.get(y).add(Arrays.asList(input.get(j), input.get(i)));
                else {
                    List<Integer> temp = Arrays.asList(input.get(j), input.get(i));
                    sumMap.put(y, new ArrayList<List<Integer>>(Collections.singleton(temp)));
                }
            }
        }
        return quadruples;
    }

    public static void main(String[] args) {
        List<Integer> test = Arrays.asList(7, 6, 4, -1, 1, 2);
        System.out.println(fourNumberSum(test, 16));
    }
}
