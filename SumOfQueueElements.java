import java.util.*;

public class SumOfQueueElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Queue<Integer> queue = new LinkedList<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter queue elements:");
        for (int i = 0; i < n; i++) {
            queue.add(sc.nextInt());
        }

        int sum = 0;

        for (int num : queue) {
            sum += num;
        }

        System.out.println("Queue Elements: " + queue);
        System.out.println("Sum of Elements: " + sum);

        sc.close();
    }
}