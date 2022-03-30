package Levels.easy.fibonacci;

import java.util.Arrays;

// recursive
public class Sol1 {

    static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int n = 7;
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i));
        }

        int i = 2;
        int[] last = new int[]{0, 1};
        System.out.println("");
        System.out.print(Arrays.toString(last));
        while (i < n) {
            int temp = last[0] + last[1];
            last[0] = last[1];
            last[1] = temp;
            i++;
            System.out.print(temp);
        }
    }
}
