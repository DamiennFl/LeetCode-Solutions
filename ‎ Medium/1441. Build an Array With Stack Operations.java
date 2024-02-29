import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> list = new ArrayList<String>();
        List<Integer> numList = new ArrayList<Integer>();
        int addedCount = 0;
        for(int d : target) {
            numList.add(d);
        }
        
        for(int i = 1; i <= n; i++) {
            if(addedCount < target.length) {
                if(numList.contains(i)) {
                    list.add("Push");
                    addedCount++;
                } else {
                    list.add("Push");
                    list.add("Pop");
                }
            }
            
            
        }
        return list;
    }
}