import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length() != word2.length()) {
            return false;
        }

        Set<Character> wordSet1 = new HashSet<Character>();
        Set<Character> wordSet2 = new HashSet<Character>();

        for(int i = 0; i < word1.length(); i++) {
            wordSet1.add(word1.charAt(i));
        }

        for(int i = 0; i < word2.length(); i++) {
            wordSet2.add(word2.charAt(i));
        }

        if(!(wordSet1.equals(wordSet2))) {
            return false;
        }

        Map<Character, Integer> map1 = new HashMap<Character, Integer>();
        Map<Character, Integer> map2 = new HashMap<Character, Integer>();
        char[] wordArray1 = word1.toCharArray();
        char[] wordArray2 = word2.toCharArray();


        for(int i = 0; i < wordArray1.length; i++) {
            if(map1.containsKey((Character) wordArray1[i])) {
                map1.replace(wordArray1[i], map1.get(wordArray1[i]) + 1);
            } else {
                map1.put(wordArray1[i], 1);
            }
        }

        for(int i = 0; i < wordArray2.length; i++) {
            if(map2.containsKey((Character) wordArray2[i])) {
                map2.replace(wordArray2[i], map2.get(wordArray2[i]) + 1);
            } else {
                map2.put(wordArray2[i], 1);
            }
        }

        ArrayList<Integer> word1Freq = new ArrayList<Integer>();
        ArrayList<Integer> word2Freq = new ArrayList<Integer>();

        for(Character c : map1.keySet()) {
            word1Freq.add(map1.get(c));
        }

        for(Character c : map2.keySet()) {
            word2Freq.add(map2.get(c));
        }

        Collections.sort(word1Freq);
        Collections.sort(word2Freq);

        if(!(word1Freq.equals(word2Freq))) {
            return false;
        }
        
        return true;
    }
}

