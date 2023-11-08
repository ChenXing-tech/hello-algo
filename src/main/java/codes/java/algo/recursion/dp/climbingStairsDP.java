package codes.java.algo.recursion.dp;

/**
 * @author chenxing@bailongma-inc.com
 * @date 2023/11/8
 * @description
 */
public class climbingStairsDP {

  /**
   * 爬楼梯动态规划
   * @param n
   * @return
   */
  int climbingStairsDP(int n){
    if (n == 1 || n == 2){
      return n;
    }
    // 初始化dp表，用于存储子问题的解
    int[] dp = new int[n + 1];
    // 初始状态，预设最小问题的解
    dp[1] = 1;
    dp[2] = 2;
    // 状态转移: 从较小子问题逐步求解较大问题的解
    for (int i = 3; i <= n ; i++) {
      dp[i] = dp[i - 1] + dp[i - 2];
    }
    return dp[n];
  }

  /**
   * 爬楼梯: 空间优化后的动态规划
   * @param n
   * @return
   */
  int climbingStairsDPComp(int n ){
    if ( n == 1 || n == 2){
      return n;
    }
    int a = 1;
    int b = 2;
    for (int i = 3; i <= n; i++) {
      int tmp = b;
      b = a + b;
      a = tmp;
    }
    return b;
  }
}
