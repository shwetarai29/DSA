package Levels.easy.palindrome;

// O(N)time | O(1) space - Iterative
public class Sol1 {

    static boolean isPalindrome(String s) {
        char[] toArray = s.toCharArray();
        int first = 0;
        int last = toArray.length - 1;
        while (first < last) {
            if (toArray[first] != toArray[last])
                return false;
            first++;
            last--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s1 = "madam";
        String s2 = "babbab";
        String s3 = "bacbab";
        System.out.println(isPalindrome(s1));
        System.out.println(isPalindrome(s2));
        System.out.println(isPalindrome(s3));
    }
}
