import java.util.Scanner;

public class LongestPalindromicSubsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int n = str.length();
        int[][] dp = new int[n][n];

        // Length 1 substrings
        for (int i = 0; i < n; i++) {
            dp[i][i] = 1;
        }

        // Length >= 2
        for (int len = 2; len <= n; len++) {
            for (int i = 0; i <= n - len; i++) {
                int j = i + len - 1;

                if (str.charAt(i) == str.charAt(j)) {
                    if (len == 2)
                        dp[i][j] = 2;
                    else
                        dp[i][j] = dp[i + 1][j - 1] + 2;
                } else {
                    dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
                }
            }
        }

        System.out.println("Length of LPS = " + dp[0][n - 1]);
    }
}
