public class N_aryLevelOrderTraversal {
    public static void main(String[] args) {
        
    }
    public static List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> res = new LinkedList<>();
        if (root == null) return res;
        Deque<Node> q = new ArrayDeque<>();
        q.offerLast(root);
        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> sub = new LinkedList<>();
            for (int i = 0; i < size; i++) {
                Node n = q.pollFirst();
                sub.add(n.val);
                for (int j = 0; j < n.children.size(); j++) {
                    if (n.children.get(j) != null) {
                        q.offerLast(n.children.get(j));
                    }
                }
            }
            res.add(sub);
        }
        return res;
    }
}