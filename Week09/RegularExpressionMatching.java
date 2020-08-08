public class RegularExpressionMatching {
    public boolean isMatch(String s, String p) {
        if (p.isEmpty()) return s.isEmpty();
        //if (s.isEmpty()) return false;
        boolean firstMatch;
        firstMatch = (!s.isEmpty() && s.charAt(0) == p.charAt(0) || p.charAt(0) == '.');
        if (p.length() >= 2 && p.charAt(1) == '*') {
            return isMatch(s, p.substring(2)) || firstMatch && !s.isEmpty() && isMatch(s.substring(1),p);
        }
        return firstMatch && !s.isEmpty() && !p.isEmpty() && isMatch(s.substring(1), p.substring(1));
    }
}