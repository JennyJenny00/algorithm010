public boolean searchMatrix(int[][] matrix, int target) {
        //find row first and then col
        if (matrix == null || matrix.length == 0) return false;
        int targetRow = findRow (matrix, target);
        int targetCol = -1;//警惕[[1]] 0 情况 即第一个情况为-1
        if (targetRow != -1) {
            targetCol = findCol (matrix, targetRow, target);
        }
        return targetCol != -1;
    }
    private int findRow (int[][] matrix, int target) {
        int left = 0;
        int right = matrix.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (target >= matrix[mid][0]) {
               left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return right;
    }
    private int findCol (int[][] matrix, int targetRow, int target) {
        //variation of binary search
        int left = 0;
        int right = matrix[0].length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (target > matrix[targetRow][mid]) {
                left = mid + 1;
            } else if (target < matrix[targetRow][mid]){
                right = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
