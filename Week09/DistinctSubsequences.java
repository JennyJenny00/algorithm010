public class DistinctSubsequences {
    public int numDistinct(String s, String t) {
        //check null
        //set boudary to 1s
        //filling in ij cells 
        //return mn
        if (s == null) return 0;
        if (t == null) return 1;
        int sl = s.length();
        int tl = t.length();
        char[] sA = s.toCharArray();
        char[] tA = t.toCharArray();
        int[][] dp = new int[tl + 1][sl + 1];
        for (int i = 0; i <= sl; i++) {
            dp[0][i] = 1;
        }
        for (int i = 0; i < tl; i++) {
            for (int j = 0; j <sl; j++) {
                if (tA[i] == sA[j ]) {
                    dp[i + 1][j + 1] = dp[i][j] + dp[i + 1][j];
                } else {
                    dp[i + 1][j + 1] = dp[i + 1][j];
                }   
            }
        }
        return dp[tl][sl];
    }
}
/*
 s # b a b g b a g
# 1  1 1 1 1 1 1 1
b 0  1 1 2 
a 0
g 0

*/