package practice.Strings;

import java.util.ArrayList;
import java.util.Collections;

public class ValidIPAddress {
    static Boolean checkIfValid(String A) {
        String[] s = A.split("\\.");

        if (A.charAt(0) == '.' || A.charAt(A.length() - 1) == '.')
            return false;

        if (s.length != 4)
            return false;

        for (int i = 0; i < 4; i++) {
            if (s[i].charAt(0) == '0' && s[i].length() != 1)
                return false;
            if (s[i].length() == 0)
                return false;
            if (!(Integer.parseInt(s[i]) >= 0 && Integer.parseInt(s[i]) <= 255))
                return false;
        }
        return true;

    }

    public static ArrayList<String> restoreIpAddresses(String A) {
        ArrayList<String> k = new ArrayList<>();
        if (A.length() > 12)
            return k;
        for (int i = 0; i < A.length(); i++) {
            for (int j = i + 1; j < A.length(); j++) {
                for (int z = j + 1; z < A.length(); z++) {

                    StringBuilder s = new StringBuilder();
                    for (int m = 0; m < A.length(); m++) {
                        if (m == i || m == j || m == z) {
                            s.append(".");
                        }
                        s.append(A.charAt(m));
                    }
                    if (checkIfValid(s.toString())) {
                        k.add(s.toString());
                    }
                }
            }
        }
        Collections.sort(k);
        return k;
    }

    public static void main(String[] args) {
        System.out.println(restoreIpAddresses("25525511135"));
    }
}
