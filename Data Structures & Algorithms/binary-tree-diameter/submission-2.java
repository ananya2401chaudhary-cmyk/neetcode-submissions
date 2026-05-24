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
    int maxDiameter=0;
    public int diameterOfBinaryTree(TreeNode root) {
        heightTree(root);
        return maxDiameter;
    }
    public int heightTree(TreeNode root){
        if(root==null){
            return 0;
        }
        int dleft=(heightTree(root.left));
        int dright=(heightTree(root.right));
        maxDiameter=Math.max(dleft+dright, maxDiameter);
        return (Math.max(dleft,dright)+1);
    }
}
