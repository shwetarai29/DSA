package practice.Strings;

public class ConvertToPalindrome {
    public static int solve(String A) {
        int left = 0;
        int right = A.length() - 1;
        int count = 0;
        while (left <= right) {
            if (A.charAt(left) == A.charAt(right)) {
                left++;
                right--;
            } else {
                if (A.charAt(left + 1) == A.charAt(right))
                    left++;
                else if (A.charAt(left) == A.charAt(right - 1))
                    right--;
                count++;
            }
            if (count > 1)
                return 0;

        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(solve("abcba"));
        System.out.println(solve("abecbea"));
        System.out.println(solve("aebcba"));
    }
}


