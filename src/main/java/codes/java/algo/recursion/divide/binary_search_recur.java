package codes.java.algo.recursion.divide;

import com.sun.corba.se.spi.ior.IdentifiableFactory;

/**
 * @author chenxing@bailongma-inc.com
 * @date 2023/11/6
 * @description
 */
public class binary_search_recur {

  /**
   * 二分查找
   * @param nums
   * @param target
   * @param left
   * @param right
   * @return
   */
  public int dfs(int[] nums, int target, int left, int right){
    if (left > right){
      return -1;
    }
    int m = (right - left) / 2;
    if (nums[m] < target){
      return dfs(nums, target, m + 1, right);
    }
    if (nums[m] > target){
      return dfs(nums, target, left, m);
    } else {
      return m;
    }
  }

  /**
   * 二分查找
   * @param nums
   * @param target
   * @return
   */
  int binarySearch(int[] nums, int target){
    return dfs(nums, target , 0, nums.length  -1);
  }
}
