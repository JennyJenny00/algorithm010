public class ReverseWordsInAString {
    public String reverseWords(String s) {
        if (s == null || s.length() == 0) return s;
        String nS = trimSpaces(s);
        String nnS = reverse(nS);
        String[] strs = nnS.split(" ");
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
     public String trimSpaces(String s) {
    int left = 0, right = s.length() - 1;
    // remove leading spaces
    while (left <= right && s.charAt(left) == ' ') ++left;

    // remove trailing spaces
    while (left <= right && s.charAt(right) == ' ') --right;

    // reduce multiple spaces to single one
    StringBuilder sb = new StringBuilder();
    while (left <= right) {
      char c = s.charAt(left);
      if (c != ' ') sb.append(c);
        //check the last bit is ' ' or not
      else if (sb.charAt(sb.length() - 1) != ' ') sb.append(c);

      ++left;
    }
    return new String(sb);
  }
}