import java.util.*;
public class WordLadderII {
    public static void main(String[] args) {
        String begin = "hit";
        String end = "cog";
        List<String> wordList = new ArrayList<String>(List.of("hot","dot","dog","lot","log","cog"));
        //System.out.println(ladderLength(begin, end,wordList ));
        List<List<String>> ans = new ArrayList<List<String>>();
        for (List<String> strs : ans) {
            for (String s : strs) {
                System.out.println(s);
            }
        }
    }
    public static List<List<String>> ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> list = new HashSet<>(wordList);
        Set<String> begin = new HashSet<>();
        Set<String> end = new HashSet<>();
        HashSet<String> visited = new HashSet<String>();
        List<List<String>> res = new ArrayList<>();
        if (!list.contains(endWord)) return res;
        
        begin.add(beginWord);
        end.add(endWord);
        int step = 1;
        
        while (!begin.isEmpty() && !end.isEmpty()) {
            if (begin.size() > end.size()) {
                Set<String> tmp = new HashSet<>();
                tmp = begin;
                begin = end;
                end = tmp;
            }
            
            Set<String> tmp = new HashSet<>();
            for (String s : begin) {
                List<String> curLevel = new ArrayList<String>();
                char[] array = s.toCharArray();
                for (int i = 0; i < s.length(); i++) {
                    for (char j = 'a'; j <= 'z'; j++) {
                        char old = array[i];
                        array[i] = j;
                        String t = String.valueOf(array);
                        if (end.contains(t)) {
                            curLevel.add(t);
                            System.out.println(t);
                        }
                        if (!visited.contains(t) && list.contains(t)) {
						    tmp.add(t);
						    visited.add(t);
					    }
                        array[i] = old;
                    }
                }
                res.add(curLevel);
                System.out.println(curLevel);
            }
            step++;
            begin = tmp;
        }
        return res;
    }
}