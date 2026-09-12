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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ls = new ArrayList<>();
        return postorder(ls,root);
    }
      public List<Integer> postorder(List<Integer> ls,TreeNode root){
        if(root!=null){
           
            postorder(ls,root.left);
            postorder(ls,root.right);
             ls.add(root.val);
        }
        return ls;
      }
}