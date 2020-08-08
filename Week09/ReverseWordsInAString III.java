public class ReverseWordsInAString III {
    public String reverseWords(String s) {
        if (s == null || s.length() == 0) return s;
        //String nnS = reverse(s);
        String[] strs = s.split(" ");
        StringBuilder sb = new StringBuilder();
        //str array to char array
        for (String str : strs) {
            sb.append(reverse(str));
            sb.append(" ");
        }
        sb.deleteCharAt(sb.length() - 1);
        return new String(sb);
    }
    private String reverse (String str) {
        if (str == null || str.length() == 0) return str;
        int l = 0;
        int r = str.length() - 1;
        char[] arr = str.toCharArray();
        while (l < r) {
            char c = arr[l];
            arr[l] = arr[r];
            arr[r] = c;
            l++;
            r--;
        }
        return new String(arr);
    }
}