package Levels.hard.LargestRange;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
// O(n) time | O(n) space
public class Sol1 {
    static List<Integer> largestRange(List<Integer> input) {
        List<Integer> range = null;
        int longestLength = 0;
        Map<Integer, Boolean> visited = new HashMap<>();
        for (Integer i : input) {
            visited.put(i, true);
        }
        for (Integer i : input) {
            if (!visited.containsKey(i))
                continue;
            int left = i - 1;
            int right = i + 1;
            int currentLength = 0;

            while (visited.containsKey(left)) {
                visited.put(left, false);
                currentLength++;
                left--;
            }
            while (visited.containsKey(right)) {
                visited.put(right, false);
                currentLength++;
                right++;
            }
            if (currentLength > longestLength) {
                longestLength = currentLength;
                range = Arrays.asList(left + 1, right - 1);
            }
        }
        return range;
    }

    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(1, 11, 3, 0, 15, 5, 2, 4, 10, 7, 12, 6);
        System.out.println(largestRange(input));
    }
}
