package codes.java.algo.recursion.dp;

/**
 * @author chenxing@bailongma-inc.com
 * @date 2023/11/8
 * @description 最小路径和
 */
public class min_path_sum {

  /**
   * 最小路径和 暴力搜索
   */
  public int minPathSumDFS(int[][] grid, int[][] mem, int i, int j){
    // 若为左上角单元格停止搜索
    if (i == 0 && j == 0){
      return grid[0][0];
    }
    // 如果数组越界，返回正无穷
    if (i < 0 || j < 0){
      return Integer.MAX_VALUE;
    }

    if (mem[i][j] == -1){
      return mem[i][j];
    }

    // 计算从左上角（i - 1, j）和 （i， j-1）的最小路径代价
    int up = minPathSumDFS(grid, mem,i - 1, j);
    int left = minPathSumDFS(grid, mem, i, j - 1);
    // 返回左上角（i- 1， j) 和 （i, j-1)的最小路径代价
    int min = Math.min(up, left) + grid[i][j];
    // 记录左上角到(i,j)的最小路径代价
    mem[i][j] = min;
    return min;
  }

  /**
   * 最小路径和: 动态规划
   */
  public int minPathSumDP(int[][] grid){
    int n = grid.length, m = grid[0].length;
    int[][] dp = new int[n][m];
    for (int i = 0; i < n; i++) {
      dp[i][0] = dp[i - 1][0] + grid[i][0];
    }
    for (int j = 0; j < n; j++) {
      dp[0][j] = dp[0][j - 1] + grid[0][j];
    }
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        dp[i][j] = Math.min(dp[i][0], dp[0][j]) + grid[i][j];
      }
    }
    return dp[n - 1][m - 1];
  }
}
