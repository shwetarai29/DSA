package practice.BinarySearch;

import java.util.Arrays;
import java.util.List;

public class MatrixMedian {
    public static int findMedian(List<List<Integer>> A) {
        if (A.size() == 0)
            return -1;
        int lo = 0, hi = Integer.MAX_VALUE;
        int x = 1;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (isLessThanHalf(A, mid))
                lo = mid + 1;
            else {
                x = mid;
                hi = mid - 1;
            }
        }
        return x;
    }

    static boolean isLessThanHalf(List<List<Integer>> a, int num) {
        int N = a.size(); // row
        int M = a.get(0).size(); // column
        int count = 0;

        for (int i = 0; i < N; i++)
            count += getCount(a.get(i), num);
        return count < (N * M) / 2 + 1;
    }

    static int getCount(List<Integer> a, int n) {
        int lo = 0;
        int hi = a.size() - 1;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (a.get(mid) > n)
                hi = mid - 1;
            else
                lo = mid + 1;
        }
        return lo;
    }

    public static void main(String[] args) {
        System.out.println(findMedian(Arrays.asList(Arrays.asList(1, 3, 5), Arrays.asList(2, 6, 9), Arrays.asList(3, 6, 9))));
        System.out.println(findMedian(Arrays.asList(Arrays.asList(5, 17, 100))));
    }
}
