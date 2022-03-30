package Levels.medium.moveElementToEnd;

import java.util.Arrays;

public class Sol1 {

    static int[] moveElementToEnd(int[] a, int move) {
        int i = 0;
        int j = a.length - 1;
        while (i < j) {
            while (i < j && a[j] == move)
                j--;
            if (a[i] == move) {
                int temp = a[j];
                a[j] = a[i];
                a[i] = temp;
            }
            i++;
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(moveElementToEnd(new int[]{2, 2, 2, 4, 3, 2, 7, 6, 2}, 2)));
    }
}
