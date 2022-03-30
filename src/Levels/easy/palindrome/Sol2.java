package Levels.easy.palindrome;

// O(N)time | O(1) space - Recursive
public class Sol2 {

    static boolean isPalindrome(String s) {
        char[] toArray = s.toCharArray();
        return isPalindrome(toArray, 0, toArray.length - 1);
    }

    static boolean isPalindrome(char[] s, int first, int last) {
        if (first >= last)
            return true;
        if (s[first] != s[last])
            return false;
        else return isPalindrome(s, first + 1, last - 1);
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
