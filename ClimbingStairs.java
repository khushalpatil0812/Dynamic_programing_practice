/* climbing stairs */

import java.util.*;

public class ClimbingStairs {

    public static int climb(int[] dp, int n) {

        if (n == 0) return 1;
        if (n == 1) return 1;

        if (dp[n] != -1) {
            return dp[n];
        }

        dp[n] = climb(dp, n - 1) + climb(dp, n - 2);
        return dp[n];
    }

    public static int climbing(int n) {
        int dp[] = new int[n + 1];
        Arrays.fill(dp, -1);
        return climb(dp, n);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int result = climbing(n);
        System.out.println(result);
    }
}



}