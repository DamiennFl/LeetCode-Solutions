//Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}


//First need to find the length of the ListNode, then I need to iterate to the length - n - 1.
//Then, link that node to the next next node.
//Notes: When iterating through linked lists, don't check if the current node points to null, instead
//       just check when the node itself is null. This avoids null pointer exceptions.
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int length = findLength(head);
        int i = 0;
        int traverse = length - n - 1;
        if(traverse == -1) return head.next;

        ListNode temp = head;
        while(i < traverse) {
            temp = temp.next;
            i++;
        }
        temp.next = temp.next.next;
        return head;
    }

    private int findLength(ListNode head) {
        int length = 0;
        if(head == null) return length;
        ListNode d = head;
        while(d != null) {
            length++;
            d = d.next;
        }
        return length;
    }
}
