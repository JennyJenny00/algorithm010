public class MaximalSquare {
    public int maximalSquare(char[][] matrix) {
        //cur = Math.min(l, w)
        // ans = Math.max(cur, ans);
        //难点在于状态定义，以当前点为右下角的最大正方形的边长
        //这时再同时check 组成正方形的三个点 再加1
        if (matrix == null || matrix.length == 0) return 0;
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] dp = new int[m][n];
        int ans = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(matrix[i][j] == '1')
                    dp[i][j]= 1;
                else dp[i][j] = 0;
                if (i > 0 && j > 0 && dp[i][j] == 1) {
                    dp[i][j] = Math.min(Math.min(dp[i - 1][j], dp[i][j - 1]), dp[i - 1][j - 1]) + 1;
                } 
                ans = Math.max(dp[i][j], ans);
            }
        }
        return ans * ans;
    }
}