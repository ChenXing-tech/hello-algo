package codes.java.structure.heap;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author chenxing@bailongma-inc.com
 * @date 2023/11/1
 * @description 堆
 */
public class heap {

  public void nature(){
    Queue<Integer> minHeap = new PriorityQueue<>(); // 小顶堆
    Queue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a); // 大顶堆

    /* 元素入堆 */
    maxHeap.offer(1);
    maxHeap.offer(3);
    maxHeap.offer(2);
    maxHeap.offer(5);
    maxHeap.offer(4);

    /* 元素出堆 */
    maxHeap.poll();

    /* 获取堆大小 */
    maxHeap.size();

    /* 判断堆是否为空 */
    maxHeap.isEmpty();

    /* 输入列表并创建堆 */
    Queue<Integer> priorityQueue = new PriorityQueue<>(Arrays.asList(1, 3, 2, 5, 4));
  }
}
