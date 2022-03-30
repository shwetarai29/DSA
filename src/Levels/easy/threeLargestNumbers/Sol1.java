package Levels.easy.threeLargestNumbers;

import java.util.Arrays;

public class Sol1 {
    public static int[] findThreeLargestNumbers(int[] array) {
        int[] threeLargest = {Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE};
        for (int num : array) {
            updateLargest(threeLargest, num);
        }
        return threeLargest;
    }

    public static void updateLargest(int[] threeLargest, int num) {
        if (num > threeLargest[2]) {
            shiftAndUpdate(threeLargest, num, 2);
        } else if (num > threeLargest[1]) {
            shiftAndUpdate(threeLargest, num, 1);
        } else if (num > threeLargest[0]) {
            shiftAndUpdate(threeLargest, num, 0);
        }
    }

    public static void shiftAndUpdate(int[] array, int num, int idx) {
        for (int i = 0; i <= idx; i++) {
            if (i == idx) {
                array[i] = num;
            } else {
                array[i] = array[i + 1];
            }
        }
    }

    public static void main(String[] args) {
        int[] input = new int[]{15,2,11,1};
        System.out.println(Arrays.toString(findThreeLargestNumbers(input)));
    }
}
