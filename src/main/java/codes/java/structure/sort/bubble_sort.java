package codes.java.structure.sort;

/**
 * @author chenxing@bailongma-inc.com
 * @date 2023/11/2
 * @description 冒泡排序
 */
public class bubble_sort {

  /**
   * 冒泡排序
   * @param nums
   */
  public void bubbleSort(int[] nums){
    for (int i = nums.length -1 ; i > 0; i--) {
      for (int j = 0; j < i; j++) {
        if (nums[j] > nums[j + 1]){
          int temp = nums[j];
          nums[j] = nums[j + 1];
          nums[j + 1] = temp;
        }
      }
    }
  }

  /**
   * 冒泡排序优化
   */
  public void bubbleSortWithFlag(int[] nums){
    for (int i = nums.length -1 ; i > 0; i--) {
      boolean flag = false;
      for (int j = 0; j < i; j++) {
        if (nums[j] > nums[j + 1]){
          int temp = nums[j];
          nums[j] = nums[j + 1];
          nums[j + 1] = temp;
          flag = true;
        }
      }
      if (!flag){
        return;
      }
    }
  }




}
