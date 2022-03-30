package practice.BinarySearch;

import java.util.Arrays;
import java.util.List;

public class MedianOfArray {
    public static double findMedianSortedArrays(final List<Integer> a, final List<Integer> b) {
        if (a.size() > b.size())
            return findMedianSortedArrays(b, a);

        int x = a.size();
        int y = b.size();

        int low = 0;
        int high = x;

        while (low <= high) {
            int midX = (low + high) / 2;
            int midY = (x + y + 1) / 2 - midX;

            int leftX = (midX == 0) ? Integer.MIN_VALUE : a.get(midX - 1);
            int leftY = (midY == 0) ? Integer.MIN_VALUE : b.get(midY - 1);

            int rightX = (midX == x) ? Integer.MAX_VALUE : a.get(midX);
            int rightY = (midY == y) ? Integer.MAX_VALUE : b.get(midY);

            if ((leftX <= rightY) && (leftY <= rightX)) {
                if ((x + y) % 2 == 0)
                    return ((double) Math.max(leftX, leftY) + Math.min(rightX, rightY)) / 2.0;
                else
                    return ((double) Math.max(leftX, leftY));
            } else if (leftX > rightY)
                high = midX - 1;
            else
                low = midX + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(findMedianSortedArrays(Arrays.asList(1, 4, 5), Arrays.asList(2, 3)));
        System.out.println(findMedianSortedArrays(Arrays.asList(), Arrays.asList(20)));
        System.out.println(findMedianSortedArrays(Arrays.asList(-50, -41, -40, -19, 5, 21, 28), Arrays.asList(-50, -21, -10)));
    }
}
