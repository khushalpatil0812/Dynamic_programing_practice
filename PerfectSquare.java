import java.util.*;
public class PerfectSquare{
public static int clac(int n ){
   int [] dp = new int [n+1];
           Arrays.fill(dp,Integer.MAX_VALUE);
           dp[0]=0;
           int count=1;
           while(count * count<= n){
              int sq = count * count;
              for(int i =sq;i<=n;i++){
                  dp[i]=Math.min(dp[i-sq]+1,dp[i]);
              }
              count++;
           }
         return dp[n];
}

public static void main(String args[]){
 Scanner sc = new Scanner(System.in);
 int n =sc.nextInt();
 int result= clac(n);
 System.out.println(result);
}
}