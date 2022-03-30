package practice.Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class Rotate2DArrayList {
    public void rotate(ArrayList<ArrayList<Integer>> A) {
        transpose(A);
        for (int i = 0; i < A.size(); i++){
            Collections.reverse(A.get(i));
        }
    }

    void transpose(ArrayList<ArrayList<Integer>> arr) {
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.get(0).size(); j++) {
                int temp = arr.get(j).get(i);
                arr.get(j).set(i,arr.get(i).get(j));
                arr.get(i).set(j,temp);
            }
        }
    }


    public static void main(String[] args) {
    }
}
