class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class CloneLinkedList {
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

    
    Node cloneList() {
        if (head == null)
            return null;

        Node cloneHead = new Node(head.data);
        Node temp = head.next;
        Node cloneTemp = cloneHead;

        while (temp != null) {
            cloneTemp.next = new Node(temp.data);
            cloneTemp = cloneTemp.next;
            temp = temp.next;
        }

        return cloneHead;
    }

   
    void display(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        CloneLinkedList list = new CloneLinkedList();

        
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);

        System.out.print("Original List: ");
        list.display(list.head);

        Node clonedHead = list.cloneList();

        System.out.print("Cloned List: ");
        list.display(clonedHead);
    }
}
