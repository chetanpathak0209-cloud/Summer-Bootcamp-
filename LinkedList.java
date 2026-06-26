class Node {
    String data;
    Node next;

    Node(String data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedList {
    Node head;

    
    void insert(String data) {
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

    void deletePrefix(String prefix) {

        while (head != null && head.data.startsWith(prefix)) {
            head = head.next;
        }

        Node temp = head;

        while (temp != null && temp.next != null) {
            if (temp.next.data.startsWith(prefix)) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }
    }

   
    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        LinkedList list = new LinkedList();

      
        list.insert("apple");
        list.insert("banana");
        list.insert("app");
        list.insert("cat");
        list.insert("application");

        String prefix = "app";

        System.out.println("Original List:");
        list.display();

        list.deletePrefix(prefix);

        System.out.println("After Deleting Prefix \"" + prefix + "\":");
        list.display();
    }
}