package practice.Strings;

public class IntegerToRoman {
    public static String intToRoman(int A) {
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romanLiterals = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder roman = new StringBuilder();

        for (int i = 0; i < values.length; i++) {
            while (A >= values[i]) {
                A = A - values[i];
                roman.append(romanLiterals[i]);
            }
        }
        return roman.toString();
    }

    public static void main(String[] args) {
        System.out.println(intToRoman(25));
        System.out.println(intToRoman(36));
        System.out.println(intToRoman(1023));
    }

}
