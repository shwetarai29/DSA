package practice.Strings;

public class MinCharRequiredForPalindrome {
    public static int solve(String A) {
        int n = A.length();
        int ans = n;
        while (n > 1 && !isPalindrome(A, n)) {
            n--;
        }
        return ans - n;
    }

    public static boolean isPalindrome(String A, int len) {
        int i = 0, j = len - 1;
        while (i <= j && (A.charAt(i) == A.charAt(j))) {
            i++;
            j--;
        }
        if (i > j) {
            return true;
        }
        return false;
    }
}
