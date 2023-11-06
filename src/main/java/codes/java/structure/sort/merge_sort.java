package codes.java.structure.sort;

/**
 * @author chenxing@bailongma-inc.com
 * @date 2023/11/6
 * @description
 */
public class merge_sort {

  public void merge(int[] nums, int left, int mid, int right){
    int[] temp = new int[right - left + 1];
    // 初始化左子数组和右子数组的起始索引
    int i = left ,j = mid + 1, k = 0;
    while (i <= mid && j <= right){
      if (nums[i] <= nums[j]){
        temp[k++] = nums[i++];
      } else {
        temp[k++] = nums[j++];
      }
    }
    while (i <= mid){
      temp[k++] = nums[i++];
    }
    while (j <= right){
      temp[k++] = nums[j++];
    }
    for (k = 0; k < temp.length ; k++) {
      nums[left + k] = temp[k];
    }
  }

  void mergeSort(int[] nums, int left, int right){
    if (left > right){
      return; // 当子数组为1时终止递归
    }
    int mid = (right - left) / 2; // 计算中点
    mergeSort(nums, left, mid); // 递归左子数组
    mergeSort(nums, mid + 1, right); //递归右子数组
    // 合并阶段
    merge(nums, left, mid, right);
  }
}
