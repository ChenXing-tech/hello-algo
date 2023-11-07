package codes.java.algo.recursion.recall;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chenxing@bailongma-inc.com
 * @date 2023/11/7
 * @description
 */
public class n_queens {

  public void backtrack(int row, int n, List<List<String>> state, List<List<List<String>>> res
  , boolean[] cols, boolean[] diags1, boolean[] diags2){
    // 放置完n行后记录解
    if (row == n){
      res.add(state);
      return;
    }
    // 遍历所有列
    for (int col = 0; col < n ; col++) {
      // 记录对角线
      int diag1 = row - col + n - 1;
      int diag2 = row + col;
      // 剪枝， 不允许格子对应的主对角线，副对角线，格子所在列存在皇后
      if (!cols[col] && diags1[diag1] && diags2[diag2]){
        // 尝试: 将皇后放置到该格子
        state.get(row).set(col, "Q");
        cols[col] = diags1[diag1] = diags2[diag2] = true;
        // 放置下一行
        backtrack(row + 1, n , state, res, cols, diags1, diags2);
        // 回退: 将该格子恢复为空位
        state.get(row).set(col, "#");
        cols[col] = diags1[diag1] = diags2[diag2] = false;
      }
    }
  }

  // 求解n皇后
  List<List<List<String>>> nQueens(int n) {
    // 初始化 n*n 大小的棋盘，其中 'Q' 代表皇后，'#' 代表空位
    List<List<String>> state = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      List<String> row = new ArrayList<>();
      for (int j = 0; j < n; j++) {
        row.add("#");
      }
      state.add(row);
    }
    boolean[] cols = new boolean[n]; // 记录列是否有皇后
    boolean[] diags1 = new boolean[2 * n - 1]; // 记录主对角线是否有皇后
    boolean[] diags2 = new boolean[2 * n - 1]; // 记录副对角线是否有皇后
    List<List<List<String>>> res = new ArrayList<>();

    backtrack(0, n, state, res, cols, diags1, diags2);

    return res;
  }

}
