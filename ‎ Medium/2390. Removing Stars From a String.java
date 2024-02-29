import java.util.Stack;

class Solution {
    public String removeStars(String s) {
        Stack<Character> stack = new Stack<Character>();
        String finalString = "";

        for(int i = 0; i < s.length(); i++) {
            stack.push(s.charAt(i));
            if(s.charAt(i) == '*') {
                if(stack.size() >= 2) {
                    stack.pop();
                    stack.pop();
                } else if(stack.size() == 1) {
                    stack.pop();
                }
            }
        }
        
        int stackSize = stack.size();
        for(int i = 0; i < stackSize; i++) {
            finalString += stack.pop();
        }

        String nstr ="";
        for(int i = 0; i < finalString.length(); i++) {
            char ch = finalString.charAt(i);
            nstr = ch + nstr;
        }

        return nstr;
    }
}