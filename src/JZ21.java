import java.util.Stack;

public class JZ21 {
    public boolean IsPopOrder(int[] pushA, int[] popA) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0, j = 0; i < pushA.length; i++) {
            stack.push(pushA[i]);

            while (!stack.empty() && j < popA.length) {
                if (stack.peek() == popA[j]) {
                    stack.pop();
                    j++;
                } else
                    break;
            }
        }
        return stack.empty();
    }

    public static void main(String[] args) {
        JZ21 test = new JZ21();
        System.out.println(test.IsPopOrder(new int[]{1, 2, 3, 4, 5}, new int[]{4, 3, 5, 1, 2}));
    }
}


