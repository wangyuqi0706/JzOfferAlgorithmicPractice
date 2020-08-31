import java.util.Stack;

public class JZ5 {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public void push(int node) {
        while (!stack2.empty())
            stack1.push(stack2.pop());
        stack1.push(node);
    }

    public int pop() {
        while (!stack1.empty())
            stack2.push(stack1.pop());
        return stack2.pop();
    }
}
