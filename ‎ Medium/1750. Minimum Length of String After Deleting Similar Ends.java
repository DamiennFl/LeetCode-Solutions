class Solution {
    public int minimumLength(String s) {
        char[] sArray = s.toCharArray();
        int left = 0;
        int right = sArray.length - 1;

        while(left < right && sArray[left] == sArray[right]) {
            char c = sArray[left];

            while(left <= right && sArray[left] == c) {
                left++;
            }
            while(right > left && sArray[right] == c) {
                right--;
            }
        }
        return right - left + 1;
    }
}