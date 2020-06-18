import java.util.*;
public class GroupAnagrams {
    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println("The string array is : ");
        for (String s : strs) {
            System.out.print(s + "_");
        }
        List<List<String>> res = groupAnagrams(strs);
        System.out.println("\n The anagrams groups are : ");
        for (List<String> ss : res) {
            for (String s : ss) {
                System.out.print(s + "_");
            }
            System.out.print("\n");
        }
    }
    public static List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) return new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            //turn each str into hashcode
            String hcode = hash(str);
            if (!map.containsKey(hcode)) {
                map.put(hcode, new ArrayList<String>());
            }
            map.get(hcode).add(str);
        }
        
        return new ArrayList<>(map.values());
    }
    private static String hash(String s) {
        char[] map = new char[26]; //why char? not int?
        for (char c : s.toCharArray()) {
            map[(int)(c - 'a')] ++;
        }
        return String.valueOf(map); //因为这地方要return string...
    }
}