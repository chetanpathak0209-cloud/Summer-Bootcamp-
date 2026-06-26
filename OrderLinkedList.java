class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class OrderLinkedList {
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

    void segregateOddEven() {
        Node oddHead = null, oddTail = null;
        Node evenHead = null, evenTail = null;

        Node temp = head;

        while (temp != null) {
            if (temp.data % 2 != 0) {
                if (oddHead == null) {
                    oddHead = oddTail = temp;
                } else {
                    oddTail.next = temp;
                    oddTail = temp;
                }
            } else {
                if (evenHead == null) {
                    evenHead = evenTail = temp;
                } else {
                    evenTail.next = temp;
                    evenTail = temp;
                }
            }
            temp = temp.next;
        }

        if (oddHead == null) {
            head = evenHead;
        } else {
            oddTail.next = evenHead;
            head = oddHead;
        }

        if (evenTail != null)
            evenTail.next = null;
    }

   
    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        OrderLinkedList list = new OrderLinkedList();

        // Predefined Input
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.insert(6);
        list.insert(7);
        list.insert(8);

        System.out.println("Original Linked List:");
        list.display();

        list.segregateOddEven();

        System.out.println("Segregated Linked List:");
        list.display();
    }
}