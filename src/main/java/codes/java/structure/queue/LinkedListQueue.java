package codes.java.structure.queue;

import codes.java.structure.linkList.ListNode;

/**
 * @author chenxing@bailongma-inc.com
 * @date 2023/10/26
 * @description
 */
public class LinkedListQueue {

  /**
   * 头节点
   */
  private ListNode front;

  /**
   * 尾节点
   */
  private ListNode rear;

  private int queSize = 0;

  /**
   * 获取队列的长度
   * @return
   */
  private int size(){
    return queSize;
  }

  /**
   * 判断队列是否为空
   */
  private boolean isEmpty(){
    return size() == 0;
  }

  /**
   * 入队
   */
  public void push(int num){
    // 尾节点后添加元素
    ListNode node = new ListNode(num);
    // 如果队列为空，则令头尾节点都指向该节点
    if (front == null){
      front = node;
      rear = node;
    } else {
      // 如果队列不为空，则将该节点添加到尾节点后
      rear.next = node;
      rear = node;
    }
    queSize++;
  }

  /**
   * 出队
   */
  public int pop(){
    int peek = peek();
    front = front.next;
    queSize--;
    return peek;
  }

  /**
   * 获取队列头节点
   */
  public int peek(){
    if (isEmpty()){
      throw new IndexOutOfBoundsException("索引越界");
    }
    return front.val;
  }

  /**
   * 将链表转化为Array并返回
   */
  public int[] toArray(){
    ListNode node = front;
    int[] res = new int[size()];
    for (int i = 0; i < res.length; i++) {
      res[i] = node.val;
      node = node.next;
    }
    return res;
  }
}
