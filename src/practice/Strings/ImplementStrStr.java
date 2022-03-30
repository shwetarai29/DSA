package practice.Strings;

public class ImplementStrStr {
    public static int strStr(final String A, final String B) {
        if (A.length() == 0 || B.length() == 0 || A.length() < B.length())
            return -1;
        if (A.equals(B))
            return 0;
        for (int i = 0; i < A.length() - B.length() + 1; i++) {
            if (A.substring(i, i + B.length()).equals(B))
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(strStr("", ""));
    }
}
