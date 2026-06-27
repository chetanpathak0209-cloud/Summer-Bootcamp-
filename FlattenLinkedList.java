class Node {
    int data;
    Node next, child;

    Node(int data) {
        this.data = data;
        next = child = null;
    }
}

public class FlattenLinkedList {

    Node head;

    
    void flatten(Node head) {
        if (head == null)
            return;

        Node tail = head;

        while (tail.next != null)
            tail = tail.next;

        Node curr = head;

        while (curr != null) {
            if (curr.child != null) {
                tail.next = curr.child;

                Node temp = curr.child;
                while (temp.next != null)
                    temp = temp.next;

                tail = temp;
                curr.child = null;
            }
            curr = curr.next;
        }
    }

   
    void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        FlattenLinkedList list = new FlattenLinkedList();

     
        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);

       
        list.head.next.child = new Node(4);
        list.head.next.child.next = new Node(5);

        
        list.head.next.next.child = new Node(6);

        System.out.print("Flattened List: ");
        list.flatten(list.head);
        list.display(list.head);
    }
}