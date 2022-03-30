package practice.Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicate {
    public static int repeatedNumber(final List<Integer> A) {
        Set<Integer> set = new HashSet<>();
        for (Integer i : A) {
            boolean duplicate = set.add(i);
            if (!duplicate)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        List<Integer> A = Arrays.asList(3, 4, 1, 4, 1);
        System.out.println(repeatedNumber(A));
    }
}
