import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    public int[] findMode(TreeNode root) {
        Map<Integer, Integer> mapOfInts = new HashMap<Integer, Integer>();
        dfs(root, mapOfInts);
        int maxFrequency = 0;

        for(int n : mapOfInts.keySet()) {
            maxFrequency = Math.max(maxFrequency, mapOfInts.get(n));
        }

        List<Integer> answer = new ArrayList();

        for(int n : mapOfInts.keySet()) {
            if(mapOfInts.get(n) == maxFrequency) {
                answer.add(n);
            }
        }

        int[] result = new int[answer.size()];
        for(int i = 0; i < answer.size(); i++) {
            result[i] = answer.get(i);
        }
        return result;
    }

    private void dfs(TreeNode node, Map<Integer, Integer> counter) {
        if (node == null) {
            return;
        }

        counter.put(node.val, counter.getOrDefault(node.val, 0) + 1);
        dfs(node.left, counter);
        dfs(node.right, counter);
    }
}