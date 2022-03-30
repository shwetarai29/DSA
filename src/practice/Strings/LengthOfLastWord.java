package practice.Strings;

public class LengthOfLastWord {
    public static int lengthOfLastWord(final String A) {
        int length = 0;
        boolean char_flag = false;
        for (int i = A.length() - 1; i >= 0; i--) {
            if (A.charAt(i) != ' ') {
                char_flag = true;
                length++;
            } else {
                if (char_flag == true)
                    return length;
            }
        }
        return length;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Geeks For Geeks  "));
    }
}
