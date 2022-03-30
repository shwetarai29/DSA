package practice.Arrays;

import java.util.ArrayList;

public class PascalTriangle {
    public static ArrayList<ArrayList<Integer>> solve(int A) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < A; i++) {
            ArrayList<Integer> ar = new ArrayList<>();

            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    ar.add(1);
                } else {
                    ar.add(ans.get(i - 1).get(j) + ans.get(i - 1).get(j - 1));
                }
            }
            ans.add(ar);
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(solve(5));
    }
}
