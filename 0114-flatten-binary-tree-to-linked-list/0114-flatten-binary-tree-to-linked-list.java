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
    public void flatten(TreeNode root) {
        LinkedList<TreeNode> ls =new LinkedList<>();
        preorder(ls,root);
        for (int i = 0; i < ls.size() - 1; i++) {
            TreeNode curr = ls.get(i);
            TreeNode next = ls.get(i + 1);
            curr.left = null;
            curr.right = next;
        }
    }
        public LinkedList<TreeNode> preorder(LinkedList<TreeNode>ls,TreeNode root){
            if(root!=null)
           { ls.add(root);
            preorder(ls,root.left);
            preorder(ls,root.right);}
            return ls;
        }
}