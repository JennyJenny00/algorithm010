import java.util.*;
public class NaryPreorderTraversal {
    public static void main(String[] args) {
        System.out.println("Sorry no test case");
    }
    class Node {
        public int val;
        public List<Node> children;
        public Node() {}
        public Node(int _val) {
            val = _val;
        }
        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    };
    public static List<Integer> preorderR(Node root) {
        if (root == null) return new ArrayList<Integer>();
        List<Integer> res = new ArrayList<>();
        res.add(root.val);
        List<Node> cur = root.children;
        for (Node n : cur) {
            res.addAll(preorder(n));
        }
        return res;
    }
    public static List<Integer> preorderI(Node root) {
        if (root == null) return new ArrayList<Integer>();
        Deque<Node> stack = new ArrayDeque<>();
        List<Integer> res = new ArrayList<>();
        stack.offerFirst(root);
        while (!stack.isEmpty()) {
            Node cur = stack.pollFirst();
            res.add(cur.val);
            List<Node> list = cur.children;
            for (int i = list.size() - 1; i >= 0; i--) {
                stack.offerFirst(list.get(i));
            }
        }
        return res;
    }
}