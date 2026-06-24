class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class CountOccurrences {

    static int countOccurrences(Node head, int key) {
        int count = 0;
        Node temp = head;

        while (temp != null) {
            if (temp.data == key) {
                count++;
            }
            temp = temp.next;
        }

        return count;
    }

    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(10);
        head.next.next.next = new Node(30);
        head.next.next.next.next = new Node(10);

        int key = 10;

        int occurrences = countOccurrences(head, key);

        System.out.println("Occurrences of " + key + " = " + occurrences);
    }
}
