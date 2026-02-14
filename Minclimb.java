import java.util.*;

public class Minclimb {

    public static int minclimb(int arr[], int n) {

        if (n == 0 || n == 1) return 0;

        int dp[] = new int[n + 1];

        dp[0] = 0;
        dp[1] = 0;

        for (int i = 2; i <= n; i++) {
            dp[i] = Math.min(
                dp[i - 1] + arr[i - 1],
                dp[i - 2] + arr[i - 2]
            );
        }

        return dp[n];
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = minclimb(arr, n);

        System.out.println(result);
    }
}
