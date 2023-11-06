package codes.java.structure.sort;

/**
 * @author chenxing@bailongma-inc.com
 * @date 2023/11/6
 * @description
 */
public class heap_sort {

  public void signDown(int[] nums, int i){
    while (true){
      int l = 2 * i + 1;
      int r = 2 * i + 2;
      int ma = i;
      if (l < nums.length && nums[l] > nums[i]){
        ma = l;
      }
      if (r < nums.length && nums[r]> nums[i]){
        ma = r;
      }
      if (ma == i){
        break;
      }
      int temp = nums[i];
      nums[i] = nums[ma];
      nums[ma] = temp;
      i = ma;
    }
  }

  public void heapSort(int[] nums){
    for (int i = (nums.length - 1) / 2; i >=0 ; i--) {
      signDown(nums,i);
    }
    for (int i = nums.length - 1; i > 0 ; i--) {
      int tmp = nums[0];
      nums[0] = nums[nums.length - 1];
      nums[nums.length - 1] = tmp;
      signDown(nums, i);
    }
  }

}
