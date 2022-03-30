package practice.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SpiralMatrixI {

    static List<Integer> spiral(List<List<Integer>> a) {
        List<Integer> results = new ArrayList<>();
        int srow = 0;
        int erow = a.size() - 1;
        int scol = 0;
        int ecol = a.get(0).size() - 1;

        while (srow <= erow && scol <= ecol) {
            for (int i = scol; i <= ecol; i++) {
                results.add(a.get(srow).get(i));
            }
            for (int i = srow + 1; i <= erow; i++) {
                results.add(a.get(i).get(ecol));
            }
            for (int i = ecol - 1; i >= scol; i--) {
                if (srow == erow) break;
                results.add(a.get(erow).get(i));
            }
            for (int i = erow - 1; i > srow; i--) {
                if (scol == ecol) break;
                results.add(a.get(i).get(scol));
            }
            srow++;
            erow--;
            scol++;
            ecol--;
        }

        return results;
    }

    public static void main(String[] args) {
        List<List<Integer>> a = new ArrayList<>();
        List<Integer> i1 = Arrays.asList(1, 2, 3);
        List<Integer> i2 = Arrays.asList(4, 5, 6);
        List<Integer> i3 = Arrays.asList(7, 8, 9);
        a.addAll(Collections.singleton(i1));
        a.addAll(Collections.singleton(i2));
        a.addAll(Collections.singleton(i3));
        List<Integer> results = spiral(a);
        results.forEach(x -> System.out.print(x +" "));

    }

}
