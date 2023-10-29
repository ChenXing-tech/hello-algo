package codes.java.structure.array;

/**
 * @author chenxing@bailongma-inc.com
 * @date 2023/10/25
 * @description
 */
public class array {

  /**
   * 增加元素
   * @param nums
   * @param index
   * @param num
   */
  private void insert(int[] nums , int index, int num){
    for (int i = nums.length - 1;  i > index; i--) {
      nums[i] = nums[i - 1];
    }
    nums[index] = num;
  }

  /**
   * 删除元素
   * @param nums
   * @param index
   * @param num
   */
  private void remove(int[] nums, int index, int num){
    for(int i = index; i < nums.length - 1; i++){
      nums[i] = nums [i+1];
    }
  }

  /**
   * 遍历数组
   * @param nums
   */
  private void traverse(int[] nums){
    for (int i = 0; i < nums.length - 1; i++) {
      System.out.println(nums[i]);
    }
  }

  /**
   * 在数组中查找指定元素
   * @param nums
   * @param target
   * @return
   */
  private int find(int[] nums, int target){
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == target){
        return i;
      }
    }
    return -1;
  }

  /**
   * 扩容数组
   * @param nums
   * @param enlarge
   * @return
   */
  private int[] extend(int[] nums, int enlarge){
    // 初始化一个扩展长度的数组
    int[] res = new int[nums.length + enlarge];
    for (int i = 0; i < nums.length; i++) {
      res[i] = nums[i];
    }
    return res;
  }




}
