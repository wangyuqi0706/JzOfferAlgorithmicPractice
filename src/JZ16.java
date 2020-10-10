public class JZ16 {
    public ListNode Merge(ListNode list1, ListNode list2) {
        ListNode head1 = list1, head2 = list2;
        ListNode low = lower(head1, head2);
        ListNode newHead = low;
        ListNode resultTail = low;
        if (low == null)
            return null;
        if (low == head1)
            head1 = head1.next;
        else
            head2 = head2.next;

        while (head1 != null || head2 != null) {
            low = lower(head1, head2);
            if (low == head1)
                head1 = head1.next;
            else
                head2 = head2.next;
            resultTail.next = low;
            resultTail = resultTail.next;

        }
        return newHead;
    }

    public ListNode lower(ListNode p1, ListNode p2) {
        if (p1 == null)
            return p2;
        if (p2 == null)
            return p1;
        return p1.val <= p2.val ? p1 : p2;
    }


    public static void main(String[] args) {
        JZ16 test = new JZ16();
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(3);

        ListNode list2 = new ListNode(4);
        list2.next = new ListNode(5);
        list2.next.next = new ListNode(6);
        ListNode result = test.Merge(list1, list2);
        System.out.println(result);
    }
}
