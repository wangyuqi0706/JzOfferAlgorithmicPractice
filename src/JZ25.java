import org.junit.jupiter.api.Test;

import java.util.HashMap;

class JZ25 {

    RandomListNode Clone(RandomListNode pHead) {
        HashMap<RandomListNode, RandomListNode> map = new HashMap<>();
        RandomListNode p1 = pHead;
        RandomListNode p2;
        while (p1 != null) {
            if (!map.containsKey(p1))
                map.put(p1, new RandomListNode(p1.label));
            p2 = map.get(p1);

            if (map.containsKey(p1.next))
                p2.next = map.get(p1.next);
            else if (p1.next == null)
                p2.next = null;
            else {
                map.put(p1.next, new RandomListNode(p1.next.label));
                p2.next = map.get(p1.next);
            }


            if (map.containsKey(p1.random))
                p2.random = map.get(p1.random);
            else if (p1.random == null)
                p2.random = null;
            else {
                map.put(p1.random, new RandomListNode(p1.random.label));
                p2.random = map.get(p1.random);
            }


            p1 = p1.next;
        }
        return map.get(pHead);
    }

    @Test
    void test() {
        RandomListNode head = new RandomListNode(1);
        head.next = new RandomListNode(2);
        head.next.next = new RandomListNode(3);
        head.next.next.next = new RandomListNode(4);

        head.random = head.next.next; //3
        head.next.random = head; //1
        head.next.next.random = head.next.next.next; //4
        head.next.next.next.random = head.next.next.next;//4

        RandomListNode p = Clone(head);
        while (p != null) {
            System.out.println(p.label);
            p = p.next;
        }

    }
}
