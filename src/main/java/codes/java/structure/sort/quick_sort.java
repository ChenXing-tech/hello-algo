package codes.java.structure.sort;

/**
 * @author chenxing@bailongma-inc.com
 * @date 2023/11/2
 * @description
 */
public class quick_sort {

  public void swap(int[] nums, int i , int j){
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
  }

  /**
   * 哨兵模式
   * @param nums
   * @param left
   * @param right
   * @return
   */
  public int partition(int[] nums, int left, int right){
    int i = left, j = right;
    int med = medianTree(nums, left, (right - left) / 2, right);
    swap(nums, left, med);
    while(i < j){
      while (nums[i] >= nums[left] && i < j){
        i++;
      }
      while (nums[j] <= nums[left] && i < j){
        j--;
      }
      swap(nums, left, right);
    }
    swap(nums, i, left);
    return i;
  }

  public void quickSort(int[] nums, int left, int right){
    if (left >= right){
      return;
    }
    int partition = partition(nums, left, right);
    quickSort(nums, left, partition - 1);
    quickSort(nums, partition + 1, right);
  }

  /**
   * 选取三个数中的中位数
   * @param nums
   * @param left
   * @param mid
   * @param right
   * @return
   */
  public int medianTree(int[] nums, int left, int mid, int right){
    if ( (nums[left] < nums[right]) ^ (nums[left] < nums[mid])){
      return left;
    } else if ( (nums[mid] < nums[right]) ^ (nums[mid] < nums[right])){
      return mid;
    } else {
      return right;
    }
  }
}
