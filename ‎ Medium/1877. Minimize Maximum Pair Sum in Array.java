import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int minPairSum(int[] nums) {
        Integer[] m = new Integer[nums.length/2];
        Arrays.sort(nums);
        int n=0;
        for(int i=0;i<nums.length/2;i++) {
            m[n++] = nums[i]+nums[nums.length-1-i];
        }
    int max = Collections.max(Arrays.asList(m));
    return max;
    }
}