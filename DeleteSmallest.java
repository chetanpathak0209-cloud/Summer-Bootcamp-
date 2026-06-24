

import java.util.Scanner;

public class DeleteSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Find smallest element and its index
        int min = arr[0];
        int minIndex = 0;

        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }
        }

        // Shift elements to the left
        for (int i = minIndex; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }

        n--; // Reduce size of array

        System.out.println("Array after deleting smallest element:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}

