import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public String predictPartyVictory(String senate) {
    Queue<Integer> radQueue = new LinkedList<>();
    Queue<Integer> dirQueue = new LinkedList<>();
    char[] senators = senate.toCharArray();
    int n = senators.length;

        for(int i = 0; i < senators.length; i++) {
            if(senators[i] == 'R') {
                radQueue.add(i);
            } else {
                dirQueue.add(i);
            }
        }

        while(!radQueue.isEmpty() && !dirQueue.isEmpty()) {
            if(radQueue.element() < dirQueue.element()) {
                radQueue.add(n++);
            } else {
                dirQueue.add(n++);
            }
            radQueue.remove();
            dirQueue.remove();
        }
        return (radQueue.isEmpty()) ? ("Dire") : ("Radiant");
    }
}