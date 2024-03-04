import java.util.Arrays;

class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);

        //Edge cases: No values or power < smallest token
        if(tokens.length == 0 || power < tokens[0]) return 0;

        //Greedy algorithm: Get smallest value token face up, or largest value token face down. Repeat until pointers switch, and return value.
        int left = 0;
        int right = tokens.length - 1;
        int score = 0;

        while(left <= right) {
            if(tokens[left] <= power) {
                power -= tokens[left++];
                score++;
            } else if(left < right && score > 0){
                power += tokens[right--];
                score--;
            } else {
                return score;      
            }
        }
        return score;
    }
}