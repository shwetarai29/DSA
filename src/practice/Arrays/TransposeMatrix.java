package practice.Arrays;

public class TransposeMatrix {

    static final int N = 3;


    static void transpose(int[][] A, int[][] B) {

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                B[i][j] = A[j][i];
            }
        }

    }

    public static void main(String[] args) {
        int[][] A = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9,}};

        int[][] B = new int[N][N];

        transpose(A, B);

        System.out.print("Result matrix is \n");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                System.out.print(B[i][j] + " ");
            System.out.print("\n");
        }
    }
}
