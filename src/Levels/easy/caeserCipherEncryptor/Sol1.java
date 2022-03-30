package Levels.easy.caeserCipherEncryptor;

public class Sol1 {
    static String caeserCipherEncryptor(String s, int key) {
        StringBuilder result = new StringBuilder();
        key = key % 26;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                int encrypt = s.charAt(i) + key;
                if (encrypt <= 91)
                    result.append((char) encrypt);
                else
                    result.append((char) (65 + (key % 91)));
            } else {
                int encrypt = s.charAt(i) + key;
                if (encrypt <= 122)
                    result.append((char) encrypt);
                else
                    result.append((char) (96 + (key % 122)));
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String s = "abc";
        System.out.println(caeserCipherEncryptor(s, 3));
        System.out.println(caeserCipherEncryptor(s, 50));
        s = "ABC";
        System.out.println(caeserCipherEncryptor(s, 3));
        System.out.println(caeserCipherEncryptor(s, 50));
    }
}
