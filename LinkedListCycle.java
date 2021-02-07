
public class Solution {
    public boolean hasCycle(ListNode head) {
      if(head == null || head.next == null){
          return false;
      }
    ListNode tortoise = head;
    ListNode rabbit   = head.next;
        while(tortoise != null || tortoise.next != null ){
            if(tortoise == rabbit ){
                return true;
            }
            rabbit = rabbit.next.next;
            tortoise = tortoise.next;
        }
            return false;
    }
}
