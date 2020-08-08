public class EditDistance {
    public int minDistance(String word1, String word2) {
        // if (word1 == null && word2 == null) return 0;
        // else if (word1 == null || word2 == null) {
        //     return word1 == null ? word2.length() : word1.length();
        // }
        int m = word1.length();
        int n = word2.length();
        char[] w1 = word1.toCharArray();
        char[] w2 = word2.toCharArray();
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 0; i <= m; i++) {
            dp[i][0] = i;
        }
        for (int i = 1; i <= n; i++) {
            dp[0][i] = i;
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (w1[i] == w2[j]) {
                    dp[i+1][j+1] = dp[i][j];
                }
                else {
                    dp[i + 1][j + 1] = Math.min(Math.min(dp[i + 1][j], dp[i][j + 1]), dp[i][j]) + 1;
                    
                }
            }
        }
        return dp[m][n];
    }
}
/*
   #  h o r s e
#  0  1 2 3 4 5
r  1  1 2 2 3 4
o  2  2 1 2 3 4
s  3  3 2

        */
