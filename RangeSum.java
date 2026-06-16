
import java.util.Scanner;

public class RangeSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter starting index: ");
        int start = sc.nextInt();

        System.out.print("Enter ending index: ");
        int end = sc.nextInt();

        int sum = 0;

        for (int i = start; i <= end; i++) {
            sum += arr[i];
        }

        System.out.println("Sum = " + sum);

        sc.close();
    }
}
