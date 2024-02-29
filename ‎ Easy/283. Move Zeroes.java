import java.util.ArrayList;
import java.util.List;

class Solution {
    public void moveZeroes(int[] nums) {
        int count = 0;

        List<Integer> nonZeroes = new ArrayList<Integer>();
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0)
                nonZeroes.add(nums[i]);
        }

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 0)
                count++;
        }

        for(int i = 0; i < nonZeroes.size(); i++) {
            nums[i] = nonZeroes.get(i);
        }

        for(int i = nonZeroes.size(); i < nonZeroes.size() + count; i++) {
            nums[i] = 0;
        }
    }
}