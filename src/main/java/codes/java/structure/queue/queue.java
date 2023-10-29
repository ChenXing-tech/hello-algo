package codes.java.structure.queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author chenxing@bailongma-inc.com
 * @date 2023/10/26
 * @description
 */
public class queue {

  /**
   * 队列性质
   */
  public void nature(){
    Queue<Integer> queue = new LinkedList<>();
    /**
     * 入队
     */
    queue.offer(1);
    queue.offer(3);
    queue.offer(5);
    queue.offer(4);
    queue.offer(3);

    /**
     * 出队
     */
    Integer poll = queue.poll();

    // 获取队列长度
    int size = queue.size();

    /**
     * 判断队列是否为空
     */
    boolean isEmpty = queue.isEmpty();
  }



}
