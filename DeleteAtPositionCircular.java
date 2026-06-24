class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class DeleteAtPositionCircular {

    static Node deleteAtPosition(Node head, int pos) {

        if (head == null)
            return null;

        
        if (pos == 1) {
            if (head.next == head)
                return null;

            Node last = head;
            while (last.next != head) {
                last = last.next;
            }

            last.next = head.next;
            head = head.next;
            return head;
        }

        Node temp = head;

        for (int i = 1; i < pos - 1 && temp.next != head; i++) {
            temp = temp.next;
        }

        if (temp.next == head) {
            System.out.println("Position out of range");
            return head;
        }

        temp.next = temp.next.next;

        return head;
    }

    static void printCircularList(Node head) {
        if (head == null)
            return;

        Node temp = head;

        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);

        System.out.println();
    }

    public static void main(String[] args) {

        Node head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = head; 

        System.out.println("Original Circular List:");
        printCircularList(head);

        head = deleteAtPosition(head, 3);

        System.out.println("After Deleting Position 3:");
        printCircularList(head);
    }
}