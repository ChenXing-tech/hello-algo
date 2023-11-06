package codes.java.structure.sort;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * @author chenxing@bailongma-inc.com
 * @date 2023/11/6
 * @description 桶排序
 */
public class bucket_sort {
  public void bucketSort(float[] nums){
    int k = nums.length / 2;
    List<List<Float>> buckets = new ArrayList<>();
    for (int i = 0; i < k; i++) {
      buckets.add(new ArrayList<>());
    }
    for (float num : nums) {
      int i = (int) (num * k);
      buckets.get(i).add(num);
    }
    for (List<Float> bucket : buckets) {
      Collections.sort(bucket);
    }
    int i = 0;
    for (List<Float> bucket : buckets) {
      for (Float aFloat : bucket) {
        nums[i++] = aFloat;
      }
    }
  }
}
