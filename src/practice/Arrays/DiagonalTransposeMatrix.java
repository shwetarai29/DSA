package practice.Arrays;

import java.util.Arrays;

public class DiagonalTransposeMatrix {
    static int N = 3;

    static void diagonalTranspose(int[][] m) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j <= i; j++) {
                int temp = m[i][j];
                m[i][j] = m[j][i];
                m[j][i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[][] A = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9,}};

        //int[][] B = new int[N][N];
        diagonalTranspose(A);
        System.out.print("Result matrix is \n");
        for (int[] a : A)
            System.out.println(Arrays.toString(a));
    }
}
