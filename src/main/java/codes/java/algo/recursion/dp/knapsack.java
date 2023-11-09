package codes.java.algo.recursion.dp;

/**
 * @author chenxing@bailongma-inc.com
 * @date 2023/11/8
 * @description
 */
public class knapsack {
  int knapsackDFS(int[][] mem, int[] wgt, int[] val, int i , int c){
    // 已经选完或者背包没有容量返回价值0
    if (i == 0 || c == 0){
      return 0;
    }
    if (mem[i][c] != -1){
      return mem[i][c];
    }
    if (wgt[i - 1] > c){
      return knapsackDFS(mem, wgt, val, i - 1, c);
    }
    int no = knapsackDFS(mem, wgt, val, i - 1, c);
    int yes = knapsackDFS(mem, wgt, val, i - 1, c -wgt[i - 1]) + val[i - 1];
    mem[i][c] = Math.max(yes,no);
    return mem[i][c];
  }
  int knapsackDP(int[] wgt, int[] val, int cap){
    int n = wgt.length;
    // 初始化dp表
    int[][] dp = new int[n + 1][cap + 1];
    // 状态转移
    for (int i = 0; i <= n; i++) {
      for (int c = 0; c <= cap; c++) {
        if (wgt[i - 1] > c){
          // 超过背包容量，则不选择物品i
          dp[i][c] = dp[i -1][c];
        }
        dp[i][c] = Math.max( dp[i-1][c], dp[i-1][c-wgt[i - 1]] + val[i - 1]);
      }
    }
    return dp[n][cap];
  }
}
