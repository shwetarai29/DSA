package practice.Strings;

public class Atoi {
    public static int atoi(final String A) {

        char[] c = A.toCharArray();
        int len = c.length;
        int i = 0;

        while (i < len) {
            if (c[i] == ' ') {
                i++;
                continue;
            }

            break;
        }

        if (!(c[i] == '+' || c[i] == '-' || (c[i] >= '0' && c[i] <= '9'))) {
            return 0;
        }

        int j = i;
        int nc = 0;
        int pc = 0;

        while (j < len) {
            if (c[j] >= '0' && c[j] <= '9') {
                j++;
                continue;
            } else if (c[j] == '-') {
                nc++;
                j++;
                continue;
            } else if (c[j] == '+') {
                pc++;
                j++;
                continue;
            } else {
                break;
            }
        }


        if (nc > 1) {
            return 0;
        }

        if (pc > 1) {
            return 0;
        }

        if (nc == 1 && pc == 1)
            return 0;

        long num = 0;

        int k = i;
        if (c[k] == '-' || c[k] == '+') {
            k++;
        }

        for (; k < j; k++) {
            int v = c[k] - '0';
            num = num * 10 + v;
        }

        if (nc == 1) {
            num = num * -1;
        }

        if (num >= Integer.MAX_VALUE || num <= Integer.MIN_VALUE) {
            if (nc == 1)
                return Integer.MIN_VALUE;
            else
                return Integer.MAX_VALUE;
        } else {
            return (int) num;
        }
    }

    public static void main(String[] args) {
        System.out.println(atoi("9 2704"));
        System.out.println(atoi("92 704"));
        System.out.println(atoi("927 04"));
        System.out.println(atoi("-927 04"));
        System.out.println(atoi(" 927 04"));
        System.out.println(atoi("0927 04"));
        System.out.println(atoi("0927-1 04"));
        System.out.println(atoi("0927--1 04"));
        System.out.println(atoi("+927 04"));

    }
}
