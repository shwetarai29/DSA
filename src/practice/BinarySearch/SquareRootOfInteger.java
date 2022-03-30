package practice.BinarySearch;

public class SquareRootOfInteger {
    public static int sqrt(int a) {
        long low = 1;
        long high = a;
        while (low <= high) {
            long mid = (high + low) / 2;
            if (mid * mid == a)
                return (int) mid;
            if (mid * mid > a)
                high = mid - 1;
            else
                low = mid + 1;
        }
        // if we did not find an exact match the high variable is smaller than low
        // and therefore contains the floor value of sqrt.
        return (int) high;
    }

    public static void main(String[] args) {
        System.out.println(sqrt(0));
        System.out.println(sqrt(4));
        System.out.println(sqrt(1));
        System.out.println(sqrt(3));
        System.out.println(sqrt(8));
        System.out.println(sqrt(2));
    }
}
