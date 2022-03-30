package Levels.medium.spiralTraverse;

import java.util.ArrayList;
import java.util.List;

public class Sol2 {
    public static List<Integer> spiralTraverse(int[][] array) {
        if (array.length == 0)
            return new ArrayList<Integer>();
        List<Integer> result = new ArrayList<>();
        spiralFill(array, 0, array.length - 1, 0, array[0].length - 1, result);
        return result;
    }

    public static void spiralFill(int[][] array, int startRow, int endRow, int startCol, int endCol, List<Integer> result) {
        if (startRow > endRow || startCol > endCol) {
            return;
        }
        for (int col = startCol; col <= endCol; col++) {
            result.add(array[startRow][col]);
        }
        for (int row = startRow + 1; row <= endRow; row++) {
            result.add(array[row][endCol]);
        }
        for (int col = endCol - 1; col >= startCol; col--) {
            if (startRow == endRow) break;
            result.add(array[endRow][col]);
        }
        for (int row = endRow - 1; row >= startRow + 1; row--) {
            if (startCol == endCol) break;
            result.add(array[row][startCol]);
        }
        spiralFill(array, startRow + 1, endRow - 1, startCol + 1, endCol - 1, result);
    }
}
