public class JZ15 {
    public ListNode ReverseList(ListNode head) {
        ListNode newHead = null;
        ListNode ptr = head;
        ListNode oldHead;
        while (ptr != null) {
            oldHead = ptr.next;
            ptr.next = newHead;
            newHead = ptr;
            ptr = oldHead;
        }
        return newHead;
    }
}
