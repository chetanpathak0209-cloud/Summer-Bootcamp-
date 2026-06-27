class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class GroupWiseReverse {
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

    
    Node reverseGroup(Node head, int k) {
        Node current = head;
        Node prev = null;
        Node next = null;
        int count = 0;

        while (current != null && count < k) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            count++;
        }

        if (next != null)
            head.next = reverseGroup(next, k);

        return prev;
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
        GroupWiseReverse list = new GroupWiseReverse();

        
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.insert(6);
        list.insert(7);
        list.insert(8);

        System.out.print("Original List: ");
        list.display();

        int k = 3;
        list.head = list.reverseGroup(list.head, k);

        System.out.print("After Group Wise Reverse: ");
        list.display();
    }
}
