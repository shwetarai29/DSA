package Levels.extremelyHard;

import java.util.Arrays;
import java.util.List;

public class Solution {
    public static String solve(List<Integer> A) {
        Double sum = 0d;
        for (Integer a : A) {
            sum = sum + a;
        }
        Double mean = sum / A.size();
        Double diff = 0d;
        for (Integer a : A) {
            diff = diff + (((a - mean) * (a - mean)) / A.size());
        }
        return String.valueOf(Math.round(diff * 100.0) / 100.0);
    }

    public static void main(String[] args) {
        System.out.println(solve(Arrays.asList(99, 81, 4, 74, 9, 79, 45, 25, 44, 86)));
    }


}
