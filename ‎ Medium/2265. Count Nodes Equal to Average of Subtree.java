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
    int count = 0;

    public int averageOfSubtree(TreeNode root) {
        postOrder(root);
        return count;
    }

    public Pair<Integer, Integer> postOrder(TreeNode root) {
        //First integer will be the sum of all nodes
        //Second will be the count of nodes

        if(root == null) {
            return new Pair(0,0);
        }
        Pair<Integer, Integer> leftPair = postOrder(root.left);
        Pair<Integer, Integer> rightPair = postOrder(root.right);

        int nodeSum = root.val + leftPair.getKey() + rightPair.getKey();
        int nodeCount = 1 + leftPair.getValue() + rightPair.getValue();

        int average = (nodeSum / nodeCount);
        if(root.val == average)
            count++;

        return new Pair(nodeSum, nodeCount);
    }
}