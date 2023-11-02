package codes.java.structure.binary_search;

import java.util.HashMap;

/**
 * @author chenxing@bailongma-inc.com
 * @date 2023/11/2
 * @description
 */
public class two_sum {

  int[] twoSumForce(int[] nums, int target){
    for (int i = 0; i < nums.length ; i++) {
      for (int j = i + 1; j < nums.length ; j++) {
        if (nums[i] + nums[j] == target){
          return new int[]{i, j};
        }
      }
    }
    return new int[]{0};
  }

  int[] twoSum(int[] nums, int target){
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length - 1; i++) {
      if (map.containsKey(target - nums[i])){
        Integer j = map.get(target - nums[i]);
        return new int[]{i, j};
      }
      map.put(nums[i], i);
    }
    return new int[]{0};
  }
}
