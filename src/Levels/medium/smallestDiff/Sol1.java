package Levels.medium.smallestDiff;

import java.util.Arrays;

public class Sol1 {

    static int[] smallestDiff(int[] a1, int[] a2) {
        Arrays.sort(a1);
        Arrays.sort(a2);
        int[] smallestPair = new int[]{};
        int i1 = 0;
        int i2 = 0;
        int smallestDiff = Integer.MAX_VALUE;
        int currentDiff;
        while (i1 < a1.length && i2 < a2.length) {
            int num1 = a1[i1];
            int num2 = a2[i2];
            if (num1 < num2) {
                currentDiff = num2 - num1;
                i1++;
            } else if (num1 > num2) {
                currentDiff = num1 - num2;
                i2++;
            } else {
                return new int[]{num1, num2};
            }
            if (smallestDiff > currentDiff) {
                smallestDiff = currentDiff;
                smallestPair = new int[]{num1, num2};
            }
        }
        return smallestPair;
    }

    public static void main(String[] args) {
        int[] a1 = new int[]{-1, 5, 10, 20, 28, 3};
        int[] a2 = new int[]{26, 134, 135, 15, 17};
        System.out.println(Arrays.toString(smallestDiff(a1, a2)));
    }
}
