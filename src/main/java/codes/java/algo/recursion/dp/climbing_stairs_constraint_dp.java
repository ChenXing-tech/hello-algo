package codes.java.algo.recursion.dp;

/**
 * @author chenxing@bailongma-inc.com
 * @date 2023/11/8
 * @description
 */
public class climbing_stairs_constraint_dp {
  int climbingStairsConstraintDP(int n){
    if (n == 1 || n == 2){
      return 1;
    }
    int[][] dp = new int[n + 1][3];
    dp[1][1] = 1;
    dp[1][2] = 0;
    dp[2][1] = 0;
    dp[2][2] = 1;
    for (int i = 3; i <=n ; i++) {
      dp[i][1] = dp[i - 1][2];
      dp[i][2] = dp[i - 2][1] + dp[i - 2][2];
    }
    return dp[n][1] + dp[n][2];
  }
}
