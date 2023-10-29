package codes.java.structure.queue;

import java.util.Objects;

/**
 * @author chenxing@bailongma-inc.com
 * @date 2023/10/27
 * @description
 */
public class linkedlist_deque {

  /**
   * 双向链表节点
   */
  class ListNode{
    int val; // 节点值
    ListNode next; // 后继节点引用
    ListNode prev; // 前驱节点引用

    ListNode(int val){
      this.val = val;
      prev = null;
      next = null;
    }
  }

  /**
   * 基于双向链表实现的双向队列
   */
  class LinkedListDeque{
    private ListNode front, rear; // 头节点front, 尾节点 rear
    private int queSize;

    public LinkedListDeque() {
      front = null;
      rear = null;
    }

    /**
     * 获取双向队列的长度
     */
    public int size(){
      return this.queSize;
    }

    /**
     * 判断双向队列是否为空
     */
    public boolean isEmpty(){
      return this.queSize == 0;
    }

    /**
     * 入队操作
     */
    private void push(int val, boolean isFront){
      ListNode node = new ListNode(val);
      if (isEmpty()){
        front = rear = node;
      }
      // 队首入队操作
      else if(isFront){
        // 将node添加至节点头部
        front.prev = node;
        node.next = front;
        front = node; //更新头节点
      } else {
        rear.next = node;
        node.prev = node;
        rear = node;
      }
      queSize++;
    }

    /**
     * 队首入队
     */
    public void pushFirst(int val){
      push(val, true);
    }

    /**
     * 队尾入队
     */
    public void pushLast(int val){
      push(val, false);
    }

    /**
     * 出队操作
     */
    public int pop(boolean isFront){
      if (isEmpty()){
        throw new IndexOutOfBoundsException();
      }
      int val;
      if (isFront){
        val = front.val;
        ListNode next = front.next;
        if (Objects.nonNull(next)){
          front.next = null;
          next.prev = null;
        }
        front = next;
      } else {
        val = rear.val;
        ListNode prev = rear.prev;
        if (Objects.nonNull(prev)){
          rear.prev = null;
          prev.next = null;
        }
        rear = prev;
      }
      queSize--;
      return val;
    }



  }

}
