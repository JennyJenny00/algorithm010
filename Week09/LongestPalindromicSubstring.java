public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        if (s == null || s.length() == 0) return "";
        int l = s.length();
        if (l < 2) return s;
        int[] maxStart = new int[1];
        int[] maxEnd = new int[1];
                                 
        for (int i = 0; i < l - 1; i++) {
            extend(i, i, maxStart, maxEnd, s);
            extend(i, i + 1, maxStart, maxEnd, s);
        }
        return s.substring(maxStart[0], maxEnd[0] + 1);
    }
    private void extend(int i, int j, int[] maxS, int[] maxE, String s) {
        while (i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)) {
            i--;
            j++;
        }
        i++;
        j--;
        if (j - i + 1 > maxE[0] - maxS[0] + 1) {
            maxS[0] = i;
            maxE[0] = j;
        }
    }
}