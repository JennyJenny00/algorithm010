public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s == null && t == null) return true;
        if (s == null || t == null || s.length() != t.length()) return false;
        int[] map = new int[128];
        for (int i = 0; i < s.length(); i++) {
        map[s.charAt(i) - 0]++;
        map[t.charAt(i) - 0]--;
    }
    for (int count : map) {
        if (count != 0) {
            return false;
        }
    }
    return true;
    }
}