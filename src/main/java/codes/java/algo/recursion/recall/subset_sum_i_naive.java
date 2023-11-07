package codes.java.algo.recursion.recall;

import java.util.List;

/**
 * @author chenxing@bailongma-inc.com
 * @date 2023/11/7
 * @description
 */
public class subset_sum_i_naive {

  public void backtrack(List<Integer> state, int target, int[] choices, int start,  List<List<Integer>> res){
    // 子集和等于target元素时记录解
    if (target == 0){
      res.add(state);
    }
    // 剪枝二：从 start 开始遍历，避免生成重复子集
    for (int i = start; i < choices.length; i++) {
      // 剪枝: 若子集和超过target跳过该选择
      if (target - choices[i] < 0){
        break;
      }
      // 剪枝四：如果该元素与左边元素相等，说明该搜索分支重复，直接跳过
      if (i > start && choices[i] == choices[i - 1]) {
        continue;
      }
      // 尝试: 做出选择，更新元素和total
      state.add(choices[i]);
      // 进行下一轮选择
      backtrack(state, target, choices, i,  res);
      // 回退：撤销选择，恢复到之前的状态
      state.remove(state.size() - 1);
    }
  }
}
