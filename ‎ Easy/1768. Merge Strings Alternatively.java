class Solution {
    public String mergeAlternately(String word1, String word2) {
        char[] word1Array = word1.toCharArray();
        char[] word2Array = word2.toCharArray();
        String finalString = "";

        int i = 0;

        while(i < word1Array.length && i < word2Array.length) {
            finalString += word1Array[i];
            finalString += word2Array[i];
            i++;
        }

        if(word1Array.length > i) {
            for(int j = i; j < word1Array.length; j++) {
                finalString += word1Array[j];
            }
        }

        if(word2Array.length > i) {
            for(int j = i; j < word2Array.length; j++) {
                finalString += word2Array[j];
            }
        }

        return finalString;
    }
}