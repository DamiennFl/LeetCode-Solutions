class Solution {
    //Definition for a binary tree node.
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    private int maxDepth;
    private int bottomLeftValue;

    public int findBottomLeftValue(TreeNode root) {
        //Max depth begins at -1, for an empty tree.
        //bottomLeftValue at 0 for empty tree.
        maxDepth = -1;
        bottomLeftValue = 0;
        //Depth-first search of root to find bottom-most value.
        dfs(root, 0);
        return bottomLeftValue;
    }

    private void dfs(TreeNode current, int depth) {
        //If the current node is null, return.
        if (current == null) {
            return;
        }
        //If depth is greater than current global maxDepth, a new level has been found.
        if (depth > maxDepth) {
            //Set maxDepth to new found depth.
            maxDepth = depth;
            //bottomLeftValue is the current value of the deepest level, since
            //we are doing a preorder search meaning that the first value we find
            //at this level will be the left-most.
            bottomLeftValue = current.val;
        }
        //Recursively call into left and right sides, until only nulls are found,
        //which is when the bottomLaeftValue is found.
        dfs(current.left, depth + 1);
        dfs(current.right, depth + 1);
    }
}