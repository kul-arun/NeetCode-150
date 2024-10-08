// https://leetcode.com/problems/search-a-2d-matrix/

public class SearchA2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int left = 0;
        int right = rows*cols - 1;
        while (left <= right) {
            int mid = left + (right - left)/2;
            int r = mid/cols;
            int c = mid%cols;
            if (matrix[r][c] == target) {
                return true;
            }
            if (matrix[r][c] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }
}
