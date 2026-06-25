class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class IntersectionPoint {

    static Node getIntersectionNode(Node head1, Node head2) {
        Node p1 = head1;
        Node p2 = head2;

        while (p1 != p2) {
            p1 = (p1 == null) ? head2 : p1.next;
            p2 = (p2 == null) ? head1 : p2.next;
        }

        return p1;
    }

    public static void main(String[] args) {

        Node common = new Node(30);
        common.next = new Node(40);
        common.next.next = new Node(50);

        Node head1 = new Node(10);
        head1.next = new Node(20);
        head1.next.next = common;

        Node head2 = new Node(15);
        head2.next = common;

        Node intersection = getIntersectionNode(head1, head2);

        if (intersection != null)
            System.out.println("Intersection Point: " + intersection.data);
        else
            System.out.println("No Intersection");
    }
}
