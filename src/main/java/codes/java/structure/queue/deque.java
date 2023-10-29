package codes.java.structure.queue;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author chenxing@bailongma-inc.com
 * @date 2023/10/26
 * @description 双向队列
 */
public class deque {

  /**
   * 双向队列性质
   */
  public void nature(){
    /**
     * 初始化双向队列
     */
    Deque<Integer> deque = new LinkedList<>();
    /* 元素入队 */
    deque.offerLast(2);
    deque.offerLast(5);
    deque.offerLast(4);
    deque.offerFirst(3);
    deque.offerFirst(1);
    /* 访问元素 */
    Integer peekFirst = deque.peekFirst();
    Integer peekLast = deque.peekLast();
    /* 元素出队 */
    Integer popFirst = deque.pollFirst();
    Integer popLast = deque.pollLast();
    /* 获取双向队列的长度 */
    int size = deque.size();
    boolean empty = deque.isEmpty();
  }


}
