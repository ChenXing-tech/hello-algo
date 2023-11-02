package codes.java.structure.sort;

/**
 * @author chenxing@bailongma-inc.com
 * @date 2023/11/2
 * @description
 */
public class insert_sort {

  public void insertSort(int[] nums){
    for (int i = 0; i < nums.length - 1; i++) {
      int base = nums[i];
      int j = i - 1;
      // 内循环
      while( j > 0  && nums[j] > base){
        nums[j + 1] = nums[j] ;
        j--;
      }
      nums[j + 1] = base;
    }
  }

}
