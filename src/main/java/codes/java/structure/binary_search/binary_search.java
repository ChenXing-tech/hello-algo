package codes.java.structure.binary_search;

/**
 * @author chenxing@bailongma-inc.com
 * @date 2023/11/2
 * @description
 */
public class binary_search {

  /**
   * 二分查找 双闭空间
   * @param nums
   * @param target
   * @return
   */
  int binarySearch(int[] nums, int target){
    int i = 0;
    int j = nums.length - 1;
    while (i <= j){
      int m = i + (j - i) / 2;
      int num = nums[m];
      if (num < target){
        i = m + 1;
      } else if (num > target){
        j = m - 1;
      } else {
        return num;
      }
    }
    return -1;
  }

  /**
   * 二分查找 左闭右开
   * @param nums
   * @param target
   * @return
   */
  int binarySearchLCRO(int[] nums, int target){
    int i = 0, j = nums.length;
    while (i < j){
      int m = i + (j - i) / 2; // 计算中点索引m
      if (nums[m] < target){
         i = m + 1;
      } else if (nums[m] > target){
         j = m;
      } else {
        return m;
      }
    }
    return -1;
  }

  /**
   * 不存在重复元素插入
   * @param nums
   * @param target
   * @return
   */
  int binarySearchInsertSimple(int[] nums, int target){
    int i = 0; int j = nums.length - 1;
    while (i < j){
      int m = i + (j - i) /2 ;
      if (nums[m] < target){
        i = m + 1;
      } else if (nums[m] > target){
        j = m - 1;
      } else {
        return m;
      }
    }
    return i;
  }

  /**
   * 存在重复元素插入
   */
  int binarySearchInsertInsertion(int[] nums, int target){
    int i = 0, j = nums.length - 1;
    while (i <= j){
      int m = i + (j - i) / 2;
      if (nums[m] < target){
        i = m + 1;
      } else if (nums[m] > target){
        j = m - 1;
      } else {
        j = m - 1;
      }
    }
    return i;
  }




}

