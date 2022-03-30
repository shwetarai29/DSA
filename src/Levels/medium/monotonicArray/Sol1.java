package Levels.medium.monotonicArray;

public class Sol1 {
    public static String isMonotonic(int[] array) {
        boolean isNonDecreasing = true;
        boolean isNonIncreasing = true;
        boolean flat = true;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1])
                isNonDecreasing = false;
            if (array[i] > array[i - 1])
                isNonIncreasing = false;
            if (array[i] != array[i - 1])
                flat = false;
        }

        if (flat) {
            return "flat";
        } else if (isNonDecreasing) {
            return "increase";
        } else if (isNonIncreasing) {
            return "decrease";
        }
        return "";
        // return isNonDecreasing || isNonIncreasing;
    }

    public static void main(String[] args) {
        int[] a = new int[]{1, 1, 1, 1};
        System.out.println(isMonotonic(a));
        a = new int[]{1, 3, 5, 5, 9};
        System.out.println(isMonotonic(a));
        a = new int[]{9, 3, 2, 2, 1};
        System.out.println(isMonotonic(a));
    }
}
