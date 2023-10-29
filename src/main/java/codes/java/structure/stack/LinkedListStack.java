package codes.java.structure.stack;

import codes.java.structure.linkList.ListNode;

/**
 * @author chenxing@bailongma-inc.com
 * @date 2023/10/26
 * @description
 */

public class LinkedListStack {
  private ListNode stackPeek; // 将头节点做为栈顶
  private int stkSize; // 栈的大小

  public LinkedListStack(){
    stackPeek = null;
  }

  /**
   * 获取栈的大小
   */
  public int size(){
    return stkSize;
  }

  /**
   * 判断栈是否为空
   */
  public boolean isEmpty(){
    return size() == 0;
  }

  /**
   * 入栈
   */
  public void push(int num){
    ListNode listNode = new ListNode(num);
    listNode.next = stackPeek;
    stackPeek = listNode;
    stkSize++;
  }

  /**
   * 出栈
   */
  public int pop(){
    int peek = peek();
    stackPeek = stackPeek.next;
    stkSize--;
    return peek;
  }

  public int peek(){
    if (size() == 0){
      throw new IndexOutOfBoundsException();
    }
    return stackPeek.val;
  }

  /**
   * 将List转化为array并返回
   */
  public int[] toArray(){
    ListNode listNode = stackPeek;
    int[] res = new int[size()];
    for (int i = res.length - 1; i >= 0 ; i--) {
      res[i] = listNode.val;
      listNode = listNode.next;
    }
    return res;
  }
}
