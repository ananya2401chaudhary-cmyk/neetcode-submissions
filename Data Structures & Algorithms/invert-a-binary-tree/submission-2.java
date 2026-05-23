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
    public TreeNode invertTree(TreeNode root) {
        if(root==null){
            return null;
        }
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            TreeNode f=q.poll();
            TreeNode temp=f.left;
            f.left=f.right;
            f.right=temp;
            /*System.out.print(f.val);*/
            if(f.right!=null){
                q.offer(f.right);
            }
            if(f.left!=null){
                q.offer(f.left);
            }
        }
        return root;
    }
}
