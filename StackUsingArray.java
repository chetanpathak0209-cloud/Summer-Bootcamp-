import java.util.Scanner;

class StackArray {
    int[] stack;
    int top;
    int size;

    StackArray(int size) {
        this.size = size;
        stack = new int[size];
        top = -1;
    }

    void push(int data) {
        if (top == size - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        stack[++top] = data;
        System.out.println(data + " pushed.");
    }

    void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return;
        }
        System.out.println(stack[top--] + " popped.");
    }

    void peek() {
        if (top == -1)
            System.out.println("Stack is Empty");
        else
            System.out.println("Top Element: " + stack[top]);
    }

    void display() {
        if (top == -1) {
            System.out.println("Stack is Empty");
            return;
        }

        System.out.println("Stack Elements:");
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }
}

public class StackUsingArray {
    public static void main(String[] args) {
        StackArray s = new StackArray(5);

        s.push(10);
        s.push(20);
        s.push(30);

        s.display();
        s.peek();

        s.pop();
        s.display();
    }
}