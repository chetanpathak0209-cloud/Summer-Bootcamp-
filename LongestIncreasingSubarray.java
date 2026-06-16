import java.util.Scanner;

public class LongestIncreasingSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int maxLen = 1;
        int currLen = 1;

        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i - 1]) {
                currLen++;
            } else {
                maxLen = Math.max(maxLen, currLen);
                currLen = 1;
            }
        }

        maxLen = Math.max(maxLen, currLen);

        System.out.println("Length of Longest Consecutive Increasing Subarray = " + maxLen);

        sc.close();
    }
}
