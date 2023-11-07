package codes.java.algo.recursion.recall;

import codes.java.structure.tree.TreeNode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author chenxing@bailongma-inc.com
 * @date 2023/11/7
 * @description
 */
public class preorder_traversal_iii_template {

  // 是否为解
  boolean isSolution(List<TreeNode> state){
    return !state.isEmpty() && state.get(state.size() - 1).val == 7;
  }

  // 记录解
  void recordSolution(List<TreeNode> state, List<List<TreeNode>> res){
    res.add(new ArrayList<>(state));
  }

  // 判断当前状态是否合法
  boolean isValid(List<TreeNode> state, TreeNode choice){
    return choice != null && choice.val != 3;
  }

  // 更新状态
  void makeChoice(List<TreeNode> state, TreeNode choice){
    state.add(choice);
  }

  // 恢复状态
  void undoChoice(List<TreeNode> state, TreeNode choice){
    state.remove(state.size() - 1);
  }

  // 回溯算法
  void backtrack(List<TreeNode> state, List<TreeNode> choices, List<List<TreeNode>> res){
    // 检查是否为解
    if (isSolution(state)){
      // 记录解
      recordSolution(state, res);
    }
    // 检查所有选择
    for (TreeNode choice : choices) {
      // 剪枝： 检查选择是否合法
      if (isValid(state, choice)){
        // 尝试做出选择，更新状态
        makeChoice(state, choice);
        // 进行下一轮选择
        backtrack(state, Arrays.asList(choice.left, choice.right),res);
        // 回退: 撤销选择，恢复到之前的状态
        undoChoice(state, choice);
      }
    }
  }
}
