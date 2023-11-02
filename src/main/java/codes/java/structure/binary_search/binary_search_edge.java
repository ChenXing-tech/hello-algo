package codes.java.structure.binary_search;

/**
 * @author chenxing@bailongma-inc.com
 * @date 2023/11/2
 * @description
 */
public class binary_search_edge {

  /**
   * 查找最左元素
   * @param nums
   * @param target
   * @return
   */
  int binarySearchLeftEdge(int[] nums, int target){
    binary_search binarySearch = new binary_search();
    int i = binarySearch.binarySearchInsertInsertion(nums, target);
    if (i == nums.length || nums[i] != target){
      return -1;
    }
    return i;
  }

  /**
   * 查找最右元素
   * @param nums
   * @param target
   * @return
   */
  int binarySearchRightEdge(int[] nums, int target){
    binary_search binarySearch = new binary_search();
    int i = binarySearch.binarySearchInsertInsertion(nums, target);
    int j = i - 1;
    if (j == nums.length || nums[j] != target){
      return -1;
    }
    return j;
  }

}
