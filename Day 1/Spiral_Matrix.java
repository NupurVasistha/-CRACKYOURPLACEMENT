import java.util.*;

public class Spiral_Matrix {
    class Solution {
        public List<Integer> spiralOrder(int[][] matrix) {
            int n = matrix.length;
            int m = matrix[0].length;
            int top = 0, right = m - 1;
            int left = 0, bottom = n - 1;

            List<Integer> ans = new ArrayList<>();
            while (top <= bottom && left <= right) {
                // Traverse from left to right along the top row
                for (int i = left; i <= right; i++) {
                    ans.add(matrix[top][i]);
                }
                top++;

                // Traverse from top to bottom along the right column
                for (int i = top; i <= bottom; i++) {
                    ans.add(matrix[i][right]);
                }
                right--;

                // Traverse from right to left along the bottom row, if still within bounds
                if (top <= bottom) {
                    for (int i = right; i >= left; i--) {
                        ans.add(matrix[bottom][i]);
                    }
                    bottom--;
                }

                // Traverse from bottom to top along the left column, if still within bounds
                if (left <= right) {
                    for (int i = bottom; i >= top; i--) {
                        ans.add(matrix[i][left]);
                    }
                    left++;
                }
            }
            return ans;
        }
    }

}
