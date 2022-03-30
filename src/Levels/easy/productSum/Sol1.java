package Levels.easy.productSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sol1 {
    // O(n) time | O(d) space - where n is the total number of elements
    // including sub-elements, and d is the greatest depth of "special"
    public static int productSum(List<Object> array) {
        return productSumHelper(array, 1);
    }

    public static int productSumHelper(List<Object> array, int multiplier) {
        int sum = 0;
        for (Object el : array) {
            if (el instanceof ArrayList) {
                ArrayList<Object> ls = (ArrayList<Object>) el;
                sum += productSumHelper(ls, multiplier + 1);
            } else
                sum += (int) el;
        }
        return sum * multiplier;
    }

    public static void main(String[] args) {
        List x = new ArrayList();
        x.add(2);
        x.add(3);

        List y = new ArrayList();
        y.add(1);
        y.add(4);
        y.add(8);
        System.out.println(productSum(Arrays.asList(0, 1, x, 5, y, 7, 9)));
    }
}
