package DSA;

import java.util.ArrayList;
import java.util.Arrays;

public class Pangram {
    public static int solve(ArrayList<String> A) {

        int[] count = new int[26];
        int flag = 1;

        String str = String.join("", A).trim();
        char ch;

        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z')
                count[ch - 'A']++;
            else if (ch >= 'a' && ch <= 'z')
                count[ch - 'a']++;
        }
        for (int j : count) {
            if (j == 0) {
                flag = 0;
                break;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        ArrayList<String> A = new ArrayList<>(Arrays.asList("the", "quick", "brown ", "fox", "jumps", "over", "the", "lazy", "dog"));
        System.out.println(solve(A));
        A = new ArrayList<>(Arrays.asList("interviewbit", "scaler"));
        System.out.println(solve(A));
    }

}
