import java.util.ArrayList;
import java.util.ListIterator;

public class JZ3 {
    // 遍历后逆序
    public ArrayList<Integer> printListFromTailToHead1(ListNode listNode) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        ListNode ptr = listNode;
        while (ptr != null) {
            arrayList.add(ptr.val);
            ptr = ptr.next;
        }

        ListIterator<Integer> it = arrayList.listIterator(arrayList.size());
        ArrayList<Integer> result = new ArrayList<>();

        while (it.hasPrevious()) {
            result.add(it.previous());
        }
        return result;

    }

    //递归方法
    public ArrayList<Integer> printListFromTailToHead2(ListNode listNode) {
        ArrayList<Integer> ret = new ArrayList<>();
        if (listNode == null)
            return ret;
        ret.addAll(printListFromTailToHead2(listNode.next));
        ret.add(listNode.val);
        return ret;
    }

    //反转链表 last->cur->next->x
    public ArrayList<Integer> printListFromTailToHead3(ListNode listNode) {
        ListNode cur = listNode;
        ListNode last = null;
        while (cur != null) {
            ListNode headNotReverse = cur.next;
            cur.next = last;
            last = cur;
            cur = headNotReverse;
        }

        cur = last;
        ArrayList<Integer> ret = new ArrayList<>();
        while (cur != null) {
            ret.add(cur.val);
            cur = cur.next;
        }
        return ret;
    }
}