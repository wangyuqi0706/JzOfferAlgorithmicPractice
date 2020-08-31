public class JZ14 {
    public ListNode FindKthToTail(ListNode head, int k) {
        if (head == null || k == 0)
            return null;
        ListNode p1 = null, p2 = head;
        int i = 1;
        while (true) {
            if (i == k)
                p1 = head;
            if (i > k)
                p1 = p1.next;
            if (p2.next == null)
                return p1;
            p2 = p2.next;
            i++;
        }
    }
}
