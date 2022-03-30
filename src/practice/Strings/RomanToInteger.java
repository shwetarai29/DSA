package practice.Strings;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static int romanToInt(String A) {
        Map<Character, Integer> mp = new HashMap();

        mp.put('M', 1000);
        mp.put('D', 500);
        mp.put('C', 100);
        mp.put('L', 50);
        mp.put('X', 10);
        mp.put('V', 5);
        mp.put('I', 1);

        int result = 0;
        for (int i = 0; i < A.length(); i++) {
            if (i + 1 < A.length() && mp.get(A.charAt(i)) < mp.get(A.charAt(i + 1)))
                result -= mp.get(A.charAt(i));
            else
                result += mp.get(A.charAt(i));
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("XIV"));
    }
}
