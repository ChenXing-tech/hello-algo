package codes.java.structure.sort;

/**
 * @author chenxing@bailongma-inc.com
 * @date 2023/11/6
 * @description 基数排序
 */
public class radix_sort {

  int digit(int num, int exp){
    return (num / exp) % 10;
  }
  /**
   * 计数排序
   */
  void countingSortDight(int[] nums, int exp){
    int[] counter = new int[10];
    int n = nums.length;
    // 统计 0~9 各数字的出现次数
    for (int i = 0; i < n; i++) {
      int d = digit(nums[i], exp); // 获取 nums[i] 第 k 位，记为 d
      counter[d]++;                // 统计数字 d 的出现次数
    }
    for (int i = 0; i < counter.length; i++) {
      counter[i + 1] += counter[i];
    }
    int[] res = new int[n];
    for (int i = n - 1; i >= 0; i--) {
      int d = digit(nums[i], exp);
      res[counter[d] - 1] = nums[i];
      counter[d]--;
    }
    for (int i = 0; i < n; i++) {
      nums[i] = res[i];
    }
  }

  public void radixSort(int[] nums){
    int m = 0;
    for (int num : nums) {
      m = Math.max(num, m);
    }
    for (int exp = 1; exp <=m ; exp *= 10){
      countingSortDight(nums,exp);
    }
  }
}
