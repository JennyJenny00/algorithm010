import java.util.*;

public class ValidAnagram {
    public static void main(String[] args) {
        String s1 = "abcdefg";
        String s2 = "gfedcba";
        String s3 = "aabbc";
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("Are s1 s2 anagram? " + isAnagram(s1, s2));
        System.out.println("s3 = " + s3);
        System.out.println("Are s1 s3 anagram? " + isAnagram(s1, s3));
    }
    public static boolean isAnagram(String s, String t) {
        if (s == null && t == null) return true;
        if (s == null || t == null || s.length() != t.length()) return false;
        int[] map = new int[26];
        for (char c : s.toCharArray()) {
            map[(int)(c-'a')]++;
        }
        for (char c : t.toCharArray()) {
            map[(int)(c - 'a')] --;
            if (map[(int)(c - 'a')] < 0)
                return false;
        }
        for(int i : map) {
            if (i != 0) return false;
        }
        return true;
    }
}