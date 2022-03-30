package practice.Arrays;

import java.util.Arrays;

public class RotateMatrix {

    static int N = 3;

    static void transpose(int[][] a, int[][] b) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                b[i][j] = a[j][i];
            }
        }
    }

    static void reverse(int[][] b) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N / 2; j++) {
                int temp = b[i][j];
                b[i][j] = b[i][N - j - 1];
                b[i][N - j - 1] = temp;
            }
        }
    }

    public static void rotate(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        for (int i = 0; i < (n + 1) / 2; i++) {
            for (int j = 0; j < m / 2; j++) {
                int temp = matrix[m - 1 - j][i];
                matrix[m - 1 - j][i] = matrix[m - 1 - i][m - 1 - j];
                matrix[m - 1 - i][m - 1 - j] = matrix[j][n - 1 - i];
                matrix[j][n - 1 - i] = matrix[i][j];
                matrix[i][j] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[][] A = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9,}};

        int[][] B = new int[N][N];

        transpose(A, B);
        reverse(B);

        System.out.print("Result matrix is \n");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                System.out.print(B[i][j] + " ");
            System.out.print("\n");
        }

        int[][] C = new int[N][N];

        rotate(A);
        System.out.print("calling rotate \n");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                System.out.print(A[i][j] + " ");
            System.out.print("\n");
        }

        int[][] z = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}};
        rotate(z);
        System.out.print("calling rotate \n");
        for (int[] row : z) {
            System.out.println(Arrays.toString(row));
            System.out.print("\n");
        }



    }
}
