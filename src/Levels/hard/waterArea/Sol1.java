package Levels.hard.waterArea;

public class Sol1 {
    // O(n) time | O(n) space
    public static int waterArea(int[] heights) {
        int[] maxes = new int[heights.length];
        int leftMax = 0;
        for (int i = 0; i < heights.length; i++) {
            int height = heights[i];
            maxes[i] = leftMax;
            leftMax = Math.max(leftMax, height);
        }
        int rightMax = 0;
        for (int i = heights.length - 1; i >= 0; i--) {
            int height = heights[i];
            int minHeight = Math.min(rightMax, maxes[i]);
            if (height < minHeight) {
                maxes[i] = minHeight - height;
            } else {
                maxes[i] = 0;
            }
            rightMax = Math.max(rightMax, height);
        }
        int total = 0;
        for (int i = 0; i < heights.length; i++) {
            total += maxes[i];
        }
        return total;
    }
}
