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
    int result=0;
    int cnt = 0;
    public int kthSmallest(TreeNode root, int k) {
        inO(root,k);
        return result ;
    }
    void inO(TreeNode  node, int k){
        if(node==null) return;
        inO(node.left,k);
        cnt++;
        if(cnt==k){
            result = node.val;
            return;
        }
        inO(node.right,k);
    }
}