class Solution {
    public ListNode reverseList(ListNode head) {

        ListNode current,next,prev;
        prev = null;
        current = head;
        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
        return prev;
    }
}