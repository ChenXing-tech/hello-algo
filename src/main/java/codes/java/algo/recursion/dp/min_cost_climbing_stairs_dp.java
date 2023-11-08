package codes.java.algo.recursion.dp;

/**
 * @author chenxing@bailongma-inc.com
 * @date 2023/11/8
 * @description
 */
public class min_cost_climbing_stairs_dp {

  /**
   * 爬楼梯最小代价
   * @param
   * @return
   */
  int minCostClimbingStairsDP(int[] cost){
    int n = cost.length - 1;
    if (n == 1|| n== 2){
      return cost[n];
    }
    int[] dp = new int[n + 1];
    for (int i = 3; i <= n ; i++) {
      dp[i] = Math.min(dp[i - 1], dp[ i - 2]) + cost[i];
    }
    return dp[n];
  }

  /**
   * 爬楼梯最小代价，空间优化后的动态规划
   */
  int minCostClimbingStairsDPComp(int[] cost){
    int n = cost.length - 1;
    if (n == 1 || n == 2){
      return cost[n];
    }
    int a = cost[1];
    int b = cost[2];
    for (int i = 3; i <= n ; i++) {
      int temp = b;
      b = Math.min(a, b) + cost[i];
      a = temp;
    }
    return b;
  }

}
