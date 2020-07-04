public class SearchA2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        //两次binary search
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) return false;
        int m = matrix.length;
        int n = matrix[0].length;
        int r = findRow(matrix, target);
        System.out.println(r);
        if (r < 0 || r > m) return false;
        return find(matrix, r, target);  
    }
    private int findRow(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) return -1;
        int left = 0;
        int right = matrix.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (target < matrix[mid][0]) {
                right = mid - 1;
            } else {
               left = mid + 1;
            }
        }
        return right;
    }
    private boolean find(int[][] matrix, int r, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int left = 0;
        int right = matrix[r].length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
             
            if (target < matrix[r][mid]) {
                right = mid - 1;
            } else if (target > matrix[r][mid]){
                left = mid + 1;
            } else 
                return true;
        }
        return false;
    }
}