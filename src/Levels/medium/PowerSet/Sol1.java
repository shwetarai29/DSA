package Levels.medium.PowerSet;

import java.util.ArrayList;
import java.util.List;

public class Sol1 {
    // O(n*2^n) time | O(n*2^n) space
    public static List<List<Integer>> powerset(List<Integer> array) {
        List<List<Integer>> subsets = new ArrayList<>();
        subsets.add(new ArrayList<Integer>());
        for (Integer ele : array) {
            int length = subsets.size();
            for (int i = 0; i < length; i++) {
                List<Integer> currentSubset = new ArrayList<Integer>(subsets.get(i));
                currentSubset.add(ele);
                subsets.add(currentSubset);
            }
        }
        return subsets;
    }
}
