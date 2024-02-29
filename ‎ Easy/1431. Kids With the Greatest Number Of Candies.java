import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        List<Boolean> willHaveMost = new ArrayList<Boolean>();
        int largestNum = 0;
        for(int i = 0; i < candies.length; i++) {
            if(candies[i] > largestNum)
                largestNum = candies[i];
        }

        for(int i = 0; i < candies.length; i++) {
            if(candies[i] + extraCandies >= largestNum) {
                willHaveMost.add(true);
            } else {
                willHaveMost.add(false);
            }
        }

        return willHaveMost;
    }
}