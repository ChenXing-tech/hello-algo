package codes.java.algo.recursion.recall;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author chenxing@bailongma-inc.com
 * @date 2023/11/7
 * @description 全排列问题
 */
public class permutations_i {

  void backTrack(List<Integer> state, int[] choices, boolean[] selected, List<List<Integer>> res){
    if (state.size() == choices.length){
      res.add(state);
    }
    // 遍历所有选择
    Set<Integer> duplicated = new HashSet<Integer>();
    for (int i = 0; i < choices.length; i++) {
      if (!selected[i] && !duplicated.contains(choices[i])){
        duplicated.add(choices[i]);
        selected[i] = true;
        state.add(choices[i]);
        backTrack(state, choices, selected, res);
        selected[i]  = false;
        state.remove(state.size() - 1);
      }
    }
  }
}
