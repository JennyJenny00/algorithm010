public class DecodeWays {
    public int numDecodings(String s) {
        int l = s.length();
        int[] dp = new int[l + 1];
        dp[l] = 1;
        char[] sArray = s.toCharArray();
        for (int i = l - 1; i >= 0; i--) {
            if (sArray[i] == '0') dp[i] = 0;
            else {
                dp[i] = dp[i + 1];
                if (i < l - 1 &&  (sArray[i] == '1' || sArray[i] == '2' && sArray[i + 1] < '7'))
                    dp[i] += dp[i + 2];
            }
        }
        return s.isEmpty() ? 0 : dp[0];
    }
}