import java.util.List;

class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int total = 0;
        for(int i = 0; i < nums.size(); i++) {
            String currBinary = Integer.toBinaryString(i);
            char[] currBinaryArray = currBinary.toCharArray();
            int binaryCount = 0;
            for(char c : currBinaryArray) {
                if(c == '1') binaryCount++;
            }
            if (binaryCount == k) total += nums.get(i);
        }
        return total;
    }
}