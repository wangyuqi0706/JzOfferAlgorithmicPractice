import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;

import java.util.Stack;

public class JZ23 {

    public boolean VerifySquenceOfBST(int[] sequence) {
        if (sequence == null || sequence.length == 0)
            return false;
        Stack<Integer> roots = new Stack<>();
        int max = Integer.MAX_VALUE;
        roots.push(Integer.MIN_VALUE);
        for (int i = sequence.length - 1; i >= 0; i--) {
            if (sequence[i] > max) return false;

            while (sequence[i] < roots.peek()) {
                max = roots.pop();
            }

            roots.push(sequence[i]);
        }
        return true;

    }

    @Test
    public void test() {
        Assertions.assertTrue(VerifySquenceOfBST(new int[]{4, 8, 6, 12, 16, 14, 10}));
    }
}
