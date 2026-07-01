import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {

    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

   
    void push(int data) {
        q2.add(data);

        while (!q1.isEmpty()) {
            q2.add(q1.remove());
        }

        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;

        System.out.println(data + " inserted");
    }

    
    void pop() {
        if (q1.isEmpty()) {
            System.out.println("Stack is Empty");
            return;
        }

        System.out.println("Deleted: " + q1.remove());
    }

    
    void top() {
        if (q1.isEmpty()) {
            System.out.println("Stack is Empty");
            return;
        }

        System.out.println("Top: " + q1.peek());
    }

    public static void main(String[] args) {
        StackUsingQueue s = new StackUsingQueue();

        s.push(10);
        s.push(20);
        s.push(30);

        s.top();

        s.pop();
        s.top();

        s.push(40);

        s.pop();
        s.pop();
        s.pop();
    }
}