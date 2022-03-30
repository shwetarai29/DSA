package DSA.Sorting;

import java.util.Arrays;

// space | time = O(1) | O (N^2)
public class SelectionSort {
    static int[] selectionSort(int[] array) {
        int currIdx = 0;
        while (currIdx < array.length) {
            int newIdx = currIdx;
            for (int i = currIdx; i < array.length; i++) {
                if (array[newIdx] > array[i])
                    newIdx = i;
            }
            int temp = array[newIdx];
            array[newIdx] = array[currIdx];
            array[currIdx] = temp;
            currIdx++;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = new int[]{5, 2, 0, 3, 4, 10, 9};
        System.out.println(Arrays.toString(selectionSort(array)));
    }
}
