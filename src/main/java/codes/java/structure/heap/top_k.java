package codes.java.structure.heap;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author chenxing@bailongma-inc.com
 * @date 2023/11/1
 * @description
 */
public class top_k {
  Queue<Integer> topKHead(int[] nums, int k){
    // 初始化小顶堆
    Queue<Integer> minHead = new PriorityQueue<>();
    // 将数组的前k个元素入堆
    for (int i = 0; i < k ; i++) {
      minHead.offer(nums[i]);
    }
    // 从第k+1个元素开始，保持堆的长度为k
    for (int i = k; i < nums.length  ; i++) {
      // 若当前元素大于堆顶元素，则将堆顶元素出堆，当前元素入堆
      Integer peek = minHead.peek();
      if (peek < nums[i]){
        minHead.poll();
        minHead.offer(nums[i]);
      }
    }
    return minHead;
  }
}
