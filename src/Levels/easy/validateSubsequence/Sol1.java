package Levels.easy.validateSubsequence;

public class Sol1 {
    static boolean validateSubsequence(int[] array, int[] subsequence) {
        int i = 0;
        for (int j : array) {
            if (i == subsequence.length - 1)
                break;
            if (subsequence[i] == j) {
                i++;
            }
        }
        return i == subsequence.length - 1;
    }

    public static void main(String[] args) {
        int[] input = new int[]{10, 1, 5, 11, 0, 15, 3, 2};
        int[] target = new int[]{1, 11, 15, 2};
        System.out.println("/ O(n) time | O(1) space");
        System.out.println(validateSubsequence(input, target));
    }
}
