import java.util.Stack;

class MinStack {
    Stack<Integer> stack;
    Stack<Integer> minStack;

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    
    public void push(int val) {
        stack.push(val);

        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }
    }

   
    public void pop() {
        if (stack.isEmpty()) {
            System.out.println("Stack is Empty");
            return;
        }

        int removed = stack.pop();

        if (removed == minStack.peek()) {
            minStack.pop();
        }
    }

  
    public int top() {
        if (stack.isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return stack.peek();
    }

  
    public int getMin() {
        if (minStack.isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return minStack.peek();
    }

    public static void main(String[] args) {
        MinStack ms = new MinStack();

        ms.push(5);
        ms.push(3);
        ms.push(7);
        ms.push(2);

        System.out.println("Minimum: " + ms.getMin()); // 2

        ms.pop();

        System.out.println("Top: " + ms.top());         // 7
        System.out.println("Minimum: " + ms.getMin()); // 3
    }
}
