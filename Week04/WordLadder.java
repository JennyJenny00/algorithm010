import java.util.*;
public class WordLadder {
    public static void main(String[] args) {
        String begin = "hit";
        String end = "cog";
        List<String> wordList = new ArrayList<String>(List.of("hot","dot","dog","lot","log","cog"));
        System.out.println(ladderLength(begin, end,wordList ));
    }
    public static int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> list = new HashSet<>(wordList);
        Set<String> begin = new HashSet<>();
        Set<String> end = new HashSet<>();
        HashSet<String> visited = new HashSet<String>();
        
        if (!list.contains(endWord)) return 0;
        
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
                char[] array = s.toCharArray();
                for (int i = 0; i < s.length(); i++) {
                    for (char j = 'a'; j <= 'z'; j++) {
                        char old = array[i];
                        array[i] = j;
                        String t = String.valueOf(array);
                        if (end.contains(t)) {
                            //System.out.println(t);
                            return step + 1;
                        }
                            
                        if (!visited.contains(t) && list.contains(t)) {
						    tmp.add(t);
						    visited.add(t);
					    }
                        array[i] = old;
                    }
                }
            }
            step++;
            begin = tmp;
        }
        return 0;
    }
}