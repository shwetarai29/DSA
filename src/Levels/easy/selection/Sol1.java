package Levels.easy.selection;

import java.util.Arrays;

public class Sol1 {

    static int[] selectionSort(int[] array) {
        int currIdx = 0;
        while (currIdx < array.length) {
            int smallIdx = currIdx;
            for (int i = currIdx + 1; i < array.length; i++) {
                if (array[smallIdx] > array[i])
                    smallIdx = i;
            }
            // swap
            int temp = array[currIdx];
            array[currIdx] = array[smallIdx];
            array[smallIdx] = temp;
            currIdx++;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = new int[]{5, 2, 0, 3, 4, 10, 9};
        System.out.println(Arrays.toString(selectionSort(array)));
    }
}
