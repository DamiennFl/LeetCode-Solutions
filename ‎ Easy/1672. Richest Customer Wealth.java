class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        int n = accounts.length;
        int m = accounts[0].length;
        
        for(int i = 0; i < n; i++) {
            int indiv = 0;
            for(int j = 0; j < m; j++) {
                indiv += accounts[i][j];
            }
            max = Math.max(indiv, max);
        }
        return max;
    }
}