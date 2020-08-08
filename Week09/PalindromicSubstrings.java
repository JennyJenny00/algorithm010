public class PalindromicSubstrings {
    public int countSubstrings(String s) {
        if (s == null || s.length() == 0) return 0;
        int l = s.length();
        if (l < 2) return 1;
        int[] maxStart = new int[1];
        int[] maxEnd = new int[1];
        int[] ans = new int[1];                    
        for (int i = 0; i < l; i++) {
            extend(i, i, maxStart, maxEnd, s, ans);
            extend(i, i + 1, maxStart, maxEnd, s, ans);
        }
        return ans[0];
    }
    private void extend(int i, int j , int[] maxS, int[] maxE, String s, int[] ans) {
        while (i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)) {
            i--;
            j++;
            ans[0] ++;
        }
    }
}