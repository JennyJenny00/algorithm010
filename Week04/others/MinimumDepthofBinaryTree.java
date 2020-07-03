public class MinimumDepthofBinaryTree {
   /**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int minDepth(TreeNode root) {
        //起点是root， 终点是叶子结点，找最短路径
        if (root == null) return 0;
        Queue<TreeNode> q = new ArrayDeque<>();
        q.offer(root);
        int dpth = 1;
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                TreeNode cur = q.poll();
                if (cur.left == null && cur.right == null) return dpth;
                if (cur.left != null) q.offer(cur.left);
                if (cur.right != null) q.offer(cur.right);
                
            }
            dpth++;
        }
        return dpth;
    }
} 
}