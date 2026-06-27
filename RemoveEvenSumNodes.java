
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class RemoveEvenSumNodes {
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

   
    void removeEvenSumNodes() {
        Node temp = head;

        while (temp != null && temp.next != null) {
            if ((temp.data + temp.next.data) % 2 == 0) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
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
        RemoveEvenSumNodes list = new RemoveEvenSumNodes();

       
        list.insert(2);
        list.insert(4);
        list.insert(7);
        list.insert(5);
        list.insert(8);
        list.insert(1);

        System.out.print("Original List: ");
        list.display();

        list.removeEvenSumNodes();

        System.out.print("\nAfter Removing Nodes: ");
        list.display();
    }
}