import java.util.*;
public class PreOrder {
   public static void main(String[] args) {
       System.out.println("Sorry no test case");
   }
   public class TreeNode {
         int val;
         TreeNode left;
         TreeNode right;
         TreeNode() {}
         TreeNode(int val) { this.val = val; }
         TreeNode(int val, TreeNode left, TreeNode right) {
             this.val = val;
             this.left = left;
             this.right = right;
         }
    } 
   public static List<Integer> preorderTraversalI(TreeNode root) {
    if (root == null) return new ArrayList<>();
    List<Integer> res = new ArrayList<>();
    Deque<TreeNode> stack = new ArrayDeque<>();
    stack.offerFirst(root);
    while (!stack.isEmpty()) {
        TreeNode cur = stack.pollFirst();
        res.add(cur.val);
        if (cur.right != null)stack.offerFirst(cur.right);
        if (cur.left != null)stack.offerFirst(cur.left);
    }
    return res;
    }
    public List<Integer> preorderTraversalR(TreeNode root) {
        if (root == null) return new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        res.add(root.val);
        res.addAll(preorderTraversal(root.left));
        res.addAll(preorderTraversal(root.right));
        return res;
    }
}