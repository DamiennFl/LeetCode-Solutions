import java.util.Stack;

class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        Stack<String> wordStack = new Stack<String>();
        String finalString = "";

        for(int i = 0; i < words.length; i++) {
            words[i].trim();
        }

        for(int i = 0; i < words.length; i++) {
            if(!(words[i].equals(""))) {
                wordStack.push(words[i]);
            }
        }

        for(String stackWord : wordStack) {
            finalString = stackWord + " " + finalString;
        }
        return finalString.trim();
    }
}