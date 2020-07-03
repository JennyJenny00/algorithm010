public class MinimunGeneticMutation {
    public int minMutation(String start, String end, String[] bank) {
        if  (start.equals(end)) return 0;
        //如果bank里不存在end?
        Set<String> bankSet = new HashSet<>(Arrays.asList(bank));
        char[] charset = new char[]{'A', 'C', 'G', 'T'};
        int level = 0;
        Set<String> visited = new HashSet<>();
        Queue<String> q = new LinkedList<>();
        q.offer(start);
        visited.add(start);
        //bfs 挨个看改变其中的一个字母后是不是可以到达
        while (!q.isEmpty()) {
            int size = q.size();
            while (size-- > 0) {
                String cur = q.poll();
                if (cur.equals(end)) return level;
                char[] curArray = cur.toCharArray();
                for (int i = 0; i < curArray.length; i++) {
                    char old = curArray[i];
                    for (char c : charset) {
                        curArray[i] = c;
                        String curString = new String(curArray);
                        if (!visited.contains(curString) && bankSet.contains(curString)) {
                            visited.add(curString);
                            q.offer(curString);
                        }
                    }
                    curArray[i] = old;
                }
            }
            level++;
        }
        return -1;
    }
}