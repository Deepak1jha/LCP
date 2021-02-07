Q. Middle Of The Linked List In Single Pass With Two Pointer.

Solution:

class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode rabbit,tort;
        rabbit = tort = head;
        while(rabbit.next != null && rabbit != null){
            rabbit = rabbit.next.next;
            tort = tort.next;
        }
        return tort;
    }
}

Q. Dlete a node in Linked-List.

class Solution {
    public void deleteNode(ListNode node) {
        ListNode current = node;
        current.val = node.next.val;
        current.next= node.next.next;
    }
}
