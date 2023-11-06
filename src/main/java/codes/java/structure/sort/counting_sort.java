package codes.java.structure.sort;

/**
 * @author chenxing@bailongma-inc.com
 * @date 2023/11/6
 * @description 计数排序
 */
public class counting_sort {

  public void countingSort(int[] nums){
    int m = 0 ;
    for (int num : nums) {
      num = Math.max(m , num);
    }
    int[] counter = new int[m + 1];
    for (int num : nums) {
      counter[num]++;
    }
    int i = 0;
    for (int num = 0; num <= m; num++) {
      for (int j = 0; j < counter[i]; j++, i++) {
        nums[i] = num;
      }
    }
  }
  public void countingSortIntegrity(int[] nums){
    // 1. 统计数组最大元素 m
    int m = 0;
    for (int num : nums) {
      m = Math.max(num, m);
    }
    // 2. 统计各数字的出现次数
    // counter[num] 代表 num 的出现次数
    int[] counter = new int[m + 1];
    for (int num : nums) {
      counter[num]++;
    }

    // 3. 求 counter 的前缀和，将“出现次数”转换为“尾索引”
    // 即 counter[num]-1 是 num 在 res 中最后一次出现的索引
    for (int i = 0; i < counter.length; i++) {
      counter[i + 1] += counter[i];
    }
    int n = nums.length;
    int[] res = new int[n];
    // 4. 倒序遍历 nums ，将各元素填入结果数组 res
    // 初始化数组 res 用于记录结果
    for (int i = n - 1; i >= 0 ; i--) {
      int num = nums[i];
      res[counter[num] - 1] = num;
      counter[num]--;
    }
    for (int i = 0; i < nums.length; i++) {
      nums[i] = res[i];
    }
  }
}
