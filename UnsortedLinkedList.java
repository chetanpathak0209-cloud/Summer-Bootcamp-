import java.util.HashSet;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class UnsortedLinkedList {
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

    
    void removeDuplicates() {
        HashSet<Integer> set = new HashSet<>();

        Node temp = head;
        Node prev = null;

        while (temp != null) {
            if (set.contains(temp.data)) {
                prev.next = temp.next;
            } else {
                set.add(temp.data);
                prev = temp;
            }
            temp = temp.next;
        }
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
        UnsortedLinkedList list = new UnsortedLinkedList();

        // Predefined Input
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(20);
        list.insert(40);
        list.insert(10);
        list.insert(50);
        list.insert(30);

        System.out.println("Original Linked List:");
        list.display();

        list.removeDuplicates();

        System.out.println("Linked List after Removing Duplicates:");
        list.display();
    }
}