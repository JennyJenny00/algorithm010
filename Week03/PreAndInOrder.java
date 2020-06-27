public class PreAndInOrder {
    //根据preOrder 找根，用inOrder分左右子树，把inorder放到map,数值-index,随时查找，然后遍历preOrder
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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        //build map
           if (preorder == null || inorder == null || preorder.length == 0 || inorder.length == 0)
               return null;
           Map<Integer, Integer> map = new HashMap<>();
           for (int i = 0; i < inorder.length; i++) {
               map.put(inorder[i], i);
           }
           return search(map, preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
       }
       private TreeNode search(Map<Integer, Integer> map, int[] pre, int pleft, int pright, int[] in, int inleft, int inright) {
           if (pleft > pright) {
               return null;
           }
           TreeNode root = new TreeNode(pre[pleft]);
           int rIndex = map.get(root.val);
           root.left = search(map, pre, pleft + 1, pleft + rIndex - inleft, in, inleft, rIndex - 1);
           root.right = search(map, pre, pleft + rIndex - inleft  + 1, pright, in, rIndex + 1, inright);
           return root;
       }
}