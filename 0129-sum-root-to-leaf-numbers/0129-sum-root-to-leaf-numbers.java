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
    int sum=0;
    void sum(TreeNode node, int cur){
        if(node==null)
            return;

        cur = cur*10 + node.val;
        if(node.left==null && node.right==null){
            sum+=cur;
            return;
        }
        sum(node.left , cur);
        sum(node.right, cur);
    }
    public int sumNumbers(TreeNode root) {
        sum(root,0);
        return sum;
    }
}