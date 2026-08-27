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
    ArrayList<Integer> list = new ArrayList<>();

    public TreeNode balanceBST(TreeNode root) {
        inorder(root);

        return build(0, list.size() - 1);
    }

    void inorder(TreeNode root) {
        if (root == null)
            return;

        inorder(root.left);
        list.add(root.val);
        inorder(root.right);
    }

    TreeNode build(int left, int right) {
        if (left > right)
            return null;

        int mid = left + (right - left) / 2;

        TreeNode root = new TreeNode(list.get(mid));

        root.left = build(left, mid - 1);
        root.right = build(mid + 1, right);

        return root;
    }
}
// class Solution {
//     public int height(TreeNode root){
//         if(root == null)
//          return 0;
//     else{
//         int a = height(root.left);
//         int b = height(root.right);
//         return 1+Math.max(a,b);
//     }
//     }
//     public int balance(TreeNode root){
//         if(root == null)
//         return 0;
//         return height(root.left)-height(root.right);
//     }
//     public TreeNode leftrotate(TreeNode z){
//             TreeNode y = z.right;
//             TreeNode temp = y.left;
//             y.left = z;
//             z.right = temp;
//             height(z);
//             height(y);
//             return y;
//     }
//     public TreeNode rightrotate(TreeNode z){
//         TreeNode y = z.left;
//         TreeNode temp = y.right;
//         y.right = z;
//         z.left = temp;
//         height(z);
//         height(y);
//         return y;
//     }
//     public TreeNode balanceBST(TreeNode root) {
//       int bal = balance(root);
//       if(bal > 1 && balance(root.left)>=0)
//         return rightrotate(root);
//       if(bal > 1 && balance(root.left)<0)
//        { root.left = leftrotate(root.left);
//         return rightrotate(root);}
//       if(bal < -1 && balance(root.right)<=0)
//         return leftrotate(root);
//       if(bal < -1 && balance(root.right)>0)
//         root.right = rightrotate(root.right);
//         return leftrotate(root);
//     }
// }

