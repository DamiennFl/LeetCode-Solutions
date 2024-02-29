class Solution {
    public String reverseVowels(String s) {
        String VOWELS = "aeiouAEIOU";
        char[] word = s.toCharArray();
        int r = word.length - 1;
        int l = 0;

        while(l < r) {
            while(l < r && VOWELS.indexOf(word[l]) == -1) {
                l++;
            }

            while(l < r && VOWELS.indexOf(word[r]) == -1) {
                r--;
            }
            char temp = word[l];
            word[l] = word[r];
            word[r] = temp;

            l++;
            r--;
        }
        
        String ret = new String(word);
        return ret;
    }
}