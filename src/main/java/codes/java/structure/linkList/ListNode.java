package codes.java.structure.linkList;

/**
 * @author chenxing@bailongma-inc.com
 * @date 2023/10/25
 * @description
 */

/**
 * 链表节点类
 */
public class ListNode {

  /**
   * 节点值
   */
  public int val;

  /**
   * 下个节点的引用
   */
  public ListNode next;

  public Object getVal() {
    return val;
  }

  public void setVal(int val) {
    this.val = val;
  }

  public ListNode getNext() {
    return next;
  }

  public void setNext(ListNode next) {
    this.next = next;
  }

  public ListNode(int val) {
    this.val = val;
  }

}
