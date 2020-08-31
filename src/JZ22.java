import java.util.*;

public class JZ22 {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        Deque<TreeNode> deque = new LinkedList<>();
        ArrayList<Integer> result = new ArrayList<>();
        if (root != null)
            deque.offerLast(root);
        while (!deque.isEmpty()) {
            if (deque.getFirst().left != null)
                deque.offerLast(deque.getFirst().left);

            if (deque.getFirst().right != null)
                deque.offerLast(deque.getFirst().right);

            if (!deque.isEmpty())
                result.add(deque.pollFirst().val);
        }
        return result;
    }

}
