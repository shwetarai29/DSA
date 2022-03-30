package practice.Strings;

import java.math.BigInteger;

public class PowerOfTwo {
    public static int power(String A) {
        if (A.equals("1")) {
            return 0;
        }
        BigInteger b_current = new BigInteger(A);
        BigInteger b2 = new BigInteger("2");
        BigInteger b1 = new BigInteger("1");
        while (!b_current.equals(b1)) {
            if ((b_current.remainder(b2)).intValue() == 0) {
                b_current = b_current.divide(b2);
                continue;
            } else {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(power("147573952589676412928"));
    }
}
