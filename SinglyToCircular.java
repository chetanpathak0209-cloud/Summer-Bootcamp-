class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class SinglyToCircular {

    static Node convertToCircular(Node head) {
        if (head == null)
            return null;

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        
        temp.next = head;

        return head;
    }

    static void printCircularList(Node head, int count) {
        if (head == null)
            return;

        Node temp = head;

        for (int i = 0; i < count; i++) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        head = convertToCircular(head);

        System.out.println("Circular Linked List:");
        printCircularList(head, 8); 
    }
}
