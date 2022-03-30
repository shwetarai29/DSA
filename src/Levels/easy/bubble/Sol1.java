package Levels.easy.bubble;

import java.util.Arrays;

public class Sol1 {
    static int[] bubbleSort(int[] array) {
        boolean sorted = false;
        int counter = 0;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1 - counter; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    sorted = false;
                }
            }
            counter++;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = new int[]{5, 2, 0, 3, 4, 10, 9};
        System.out.println(Arrays.toString(bubbleSort(array)));
    }
}
