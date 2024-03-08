import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int maxFrequencyElements(int[] nums) {
        int ret = 0;
        Map<Integer,Integer> table = new HashMap<>();
        for(int n : nums) {
            table.put(n,table.getOrDefault(n,0)+1);
        }
        int max = Collections.max(table.values());
        for(int value : table.values()) {
            if(value == max) ret += max;
        }
        return ret;
    }
}