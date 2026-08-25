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
    public TreeNode increasingBST(TreeNode root) {
        ArrayList<Integer> al = new ArrayList<>();
        inorder(root,al);
        TreeNode dummy = new TreeNode(0);
        TreeNode curr = dummy;
        for(int v : al){
            curr.right=new TreeNode(v);
            curr=curr.right;
        }
        return dummy.right;
    }
    public void inorder(TreeNode root,ArrayList<Integer> al){
        if(root == null) return;
        inorder(root.left,al);
        al.add(root.val);
        inorder(root.right,al);
    }
}