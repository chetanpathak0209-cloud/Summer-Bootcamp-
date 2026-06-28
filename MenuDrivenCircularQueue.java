import java.util.Scanner;

class CircularQueue {
    int[] queue;
    int front, rear, size, capacity;

    CircularQueue(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = -1;
        rear = -1;
        size = 0;
    }

   
    void enqueue(int data) {
        if (size == capacity) {
            System.out.println("Queue Overflow!");
            return;
        }

        if (front == -1)
            front = 0;

        rear = (rear + 1) % capacity;
        queue[rear] = data;
        size++;

        System.out.println(data + " inserted.");
    }

   
    void dequeue() {
        if (size == 0) {
            System.out.println("Queue Underflow!");
            return;
        }

        System.out.println(queue[front] + " deleted.");

        if (front == rear) {
            front = rear = -1;
        } else {
            front = (front + 1) % capacity;
        }

        size--;
    }

   
    void display() {
        if (size == 0) {
            System.out.println("Queue is empty.");
            return;
        }

        System.out.print("Queue Elements: ");
        int i = front;

        while (true) {
            System.out.print(queue[i] + " ");
            if (i == rear)
                break;
            i = (i + 1) % capacity;
        }
        System.out.println();
    }

   
    void peek() {
        if (size == 0) {
            System.out.println("Queue is empty.");
        } else {
            System.out.println("Front Element: " + queue[front]);
        }
    }
}

public class MenuDrivenCircularQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Queue Size: ");
        int n = sc.nextInt();

        CircularQueue cq = new CircularQueue(n);

        int choice, value;

        do {
            System.out.println("\n----- CIRCULAR QUEUE MENU -----");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value: ");
                    value = sc.nextInt();
                    cq.enqueue(value);
                    break;

                case 2:
                    cq.dequeue();
                    break;

                case 3:
                    cq.peek();
                    break;

                case 4:
                    cq.display();
                    break;

                case 5:
                    System.out.println("Program Ended.");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}
