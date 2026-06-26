class Node {
    int data;
    Node prev, next;

    Node(int data) {
        this.data = data;
        prev = next = null;
    }
}

class DoublyLinkedList {
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
        newNode.prev = temp;
    }

   
    void updateAtIndex(int index, int value) {
        Node temp = head;
        int i = 0;

        while (temp != null && i < index) {
            temp = temp.next;
            i++;
        }

        if (temp != null) {
            temp.data = value;
        } else {
            System.out.println("Invalid Index");
        }
    }

    
    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();

       
        dll.insert(10);
        dll.insert(20);
        dll.insert(30);
        dll.insert(40);
        dll.insert(50);

        int index = 2;
        int newValue = 100;

        dll.updateAtIndex(index, newValue);

        System.out.println("Updated Doubly Linked List:");
        dll.display();
    }
}
