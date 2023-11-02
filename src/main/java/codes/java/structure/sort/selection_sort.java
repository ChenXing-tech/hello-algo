package codes.java.structure.sort;

/**
 * @author chenxing@bailongma-inc.com
 * @date 2023/11/2
 * @description
 */
public class selection_sort {

  /**
   * 选择排序
   * @param nums
   */
  public void selectionSort(int[] nums){
    for (int i = 0; i < nums.length - 1; i++) {
      int k = i;
      for (int j = i + 1; j < nums.length; j++) {
        if (nums[k] > nums[j]){
          k = j;
        }
      }
      // 将最小元素与未排序区间的首个元素交换
      int temp = nums[i];
      nums[i] = nums[k];
      nums[k] = temp;
    }
  }
}
