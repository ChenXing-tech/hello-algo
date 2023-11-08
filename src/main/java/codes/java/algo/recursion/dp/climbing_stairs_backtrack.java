package codes.java.algo.recursion.dp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author chenxing@bailongma-inc.com
 * @date 2023/11/8
 * @description
 */
public class climbing_stairs_backtrack {

  public static void backTrack(List<Integer> state, int[] choices, List<List<Integer>> res, int target){
    if (target == 0){
      res.add(new ArrayList<>(state));
      return;
    }
    for (int i = 0; i < choices.length; i++) {
      if (target - choices[i] < 0){
        break;
      }
      state.add(choices[i]);
      backTrack(state, choices, res, target - choices[i]);
      state.remove(state.size() - 1);
    }
  }

  public static void main(String[] args) {
    int[] arr = {1, 2};
    List<List<Integer>> res = new ArrayList<>();
    backTrack(new ArrayList<>(), arr,res , 3);
    System.out.println(111);
  }
}
