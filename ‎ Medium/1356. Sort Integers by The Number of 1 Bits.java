import java.util.Arrays;

class Solution {
    public int[] sortByBits(int[] arr) {
        int[] finalList = new int[arr.length];

        for(int i = 0; i < arr.length; i++) {
            finalList[i] = onesCount(arr[i]) * 10001 + arr[i];
        }
        Arrays.sort(finalList);
        for(int i = 0; i < arr.length; i++) {
            finalList[i] %= 10001;
        }
        return finalList;
    }

    private int onesCount(int n) {
        int amt = 0;
        while(n != 0) {
            amt += (n & 1);
            n >>= 1;
        }
        return amt;
    }
}