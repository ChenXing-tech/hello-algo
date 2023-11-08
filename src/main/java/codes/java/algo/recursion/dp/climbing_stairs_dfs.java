package codes.java.algo.recursion.dp;

import java.util.Arrays;

/**
 * @author chenxing@bailongma-inc.com
 * @date 2023/11/8
 * @description
 */
public class climbing_stairs_dfs {

  int dfs(int i, int[] mem){
    // 已知 dp[1] 和 dp[2],返回
    if (i == 1 || i == 2){
      return i;
    }
    // 如果结果存在在dp
    if (mem[i] == -1){
      return mem[i];
    }
    int count = dfs(i - 1, mem) + dfs (i - 2, mem);
    mem[i] = count;
    return count;
  }

  int climbing_stairs_dfs(int n){
    int[] mem = new int[n + 1];
    Arrays.fill(mem, -1);
    int dfs = dfs(n, mem);
    return dfs;
  }
}
