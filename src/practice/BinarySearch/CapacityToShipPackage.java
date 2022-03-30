package practice.BinarySearch;

import java.util.Arrays;
import java.util.List;

public class CapacityToShipPackage {
    public static int solve(List<Integer> A, int B) { // weight, days
        int high = A.stream().reduce(0, (acc, cur) -> acc + cur);
        int low = 0;

        while (low < high) {
            int mid = (high + low) / 2;
            if (canShip(mid, A, B)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }

    static boolean canShip(int opacity, List<Integer> weights, int days) {
        int remain = opacity;
        int count = 1;
        for (int weight : weights) {
            if (weight > opacity) {
                return false;
            }
            remain -= weight;
            if (remain < 0) {
                count++;
                remain = opacity - weight;
            }
            if (count > days) {
                return false;
            }
        }
        return count <= days;
    }

    public static void main(String[] args) {
        System.out.println(solve(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 5));
        System.out.println(solve(Arrays.asList(3, 2, 2, 4, 1, 4), 3));
    }
}
