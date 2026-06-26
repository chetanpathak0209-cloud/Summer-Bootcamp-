import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    
    void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null)
            temp = temp.next;

        temp.next = newNode;
    }

    
    void removeEveryKthNode(int k) {
        if (head == null || k <= 0)
            return;

        if (k == 1) {
            head = null;
            return;
        }

        Node temp = head;
        Node prev = null;
        int count = 1;

        while (temp != null) {
            if (count % k == 0) {
                prev.next = temp.next;
            } else {
                prev = temp;
            }
            temp = temp.next;
            count++;
        }
    }

    
    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedList list = new LinkedList();

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            list.insert(sc.nextInt());
        }

        int k = sc.nextInt();

        list.removeEveryKthNode(k);

        list.display();
    }
}