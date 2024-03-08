
//Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode wait = head;
        double count = 1;
        while(head.next != null) {
            count++;
            head = head.next;
        }

        count = Math.floor(count / 2);
        for(int i = 0; i < count; i++) {
            wait = wait.next;
        }
        return wait;
    }
}