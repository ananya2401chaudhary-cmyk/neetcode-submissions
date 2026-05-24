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
    int balCalc=0;
    public boolean isBalanced(TreeNode root) {
        
        heightTree(root);
        if (balCalc>1){
            return false;
        }
        else{
            return true;
        }
    }

    public int heightTree(TreeNode root){
        if(root==null){
            return 0 ;
        }
        int dleft=heightTree(root.left);
        int dright=heightTree(root.right);
        balCalc=Math.max(Math.abs(dleft-dright), balCalc);
        return (Math.max(dleft,dright)+1);
    }
}
