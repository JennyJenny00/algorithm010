public class FindLargestValueinEachTreeRow {
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> ans = new LinkedList<>();
        if (root == null) return ans;
        Queue<TreeNode> q = new ArrayDeque<>();
        q.offer(root);
        while(!q.isEmpty()) {
            int size = q.size(); 
            int max = q.peek().val;
            for (int i = 0; i < size; i++) {
                TreeNode cur = q.poll();
                max = Math.max(max, cur.val);
                if (cur.left != null) {
                    q.offer(cur.left);
                }
                if (cur.right != null) {
                    q.offer(cur.right);
                }
            }
            ans.add(max);
        }
        return ans;
    }
}