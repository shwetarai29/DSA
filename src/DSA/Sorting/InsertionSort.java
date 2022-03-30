package DSA.Sorting;

import java.util.Arrays;

// space | time = O(1) | O (N^2)
public class InsertionSort {
    static int[] insertionSort(int[] array) { 
        for (int i = 1; i < array.length; i++) {
            int j = i;
            while (j > 0 && array[j] < array[j - 1]) {
                int temp = array[j - 1];
                array[j - 1] = array[j];
                array[j] = temp;
                j--;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = new int[]{5, 2, 0, 3, 4, 10, 9};
        System.out.println(Arrays.toString(insertionSort(array)));
    }
}
