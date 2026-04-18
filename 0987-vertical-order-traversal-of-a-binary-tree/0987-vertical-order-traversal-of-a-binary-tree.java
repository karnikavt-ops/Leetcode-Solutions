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

    class NodeInfo {
        int row, col, val;

        NodeInfo(int row, int col, int val) {
            this.row = row;
            this.col = col;
            this.val = val;
        }
    }

    List<NodeInfo> list = new ArrayList<>();

    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;

        dfs(root, 0, 0);

        Collections.sort(list, (a, b) -> {
            if (a.col != b.col) return a.col - b.col;
            if (a.row != b.row) return a.row - b.row;
            return a.val - b.val;
        });

        Map<Integer, List<Integer>> map = new TreeMap<>();

        for (NodeInfo node : list) {
            map.putIfAbsent(node.col, new ArrayList<>());
            map.get(node.col).add(node.val);
        }

        result.addAll(map.values());
        return result;
    }

    private void dfs(TreeNode root, int row, int col) {
        if (root == null) return;

        list.add(new NodeInfo(row, col, root.val));

        dfs(root.left, row + 1, col - 1);
        dfs(root.right, row + 1, col + 1);
    }
}