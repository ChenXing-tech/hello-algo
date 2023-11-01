package codes.java.structure.linkList;

import java.util.Objects;

/**
 * @author chenxing@bailongma-inc.com
 * @date 2023/10/25
 * @description
 */
public class linked_list {

  /**
   * 初始化链表数据
   * @return
   */
  private ListNode init(){
    ListNode n0 = new ListNode(1);
    ListNode n1 = new ListNode(3);
    ListNode n2 = new ListNode(2);
    ListNode n3 = new ListNode(5);
    ListNode n4 = new ListNode(4);
    n0.next = n1;
    n1.next = n2;
    n2.next = n3;
    n3.next = n4;
    return n0;
  }

  /**
   * 插入节点
   * @param n0
   * @param p
   */
  void insert(ListNode n0, ListNode p){
    ListNode n1 = n0.next;
    p.next = n1;
    n0.next = p;
  }

  /**
   * 删除节点
   */
  void remove(ListNode n0){
    // 删除n0后面的元素
    ListNode p = n0.next;
    ListNode n1 = p.next;
    n0.next = n1;
  }

  /**
   * 访问节点
   */
  ListNode access(ListNode head,  int index){
    // 访问链表的第i个节点
    for (int i = 0; i < index; i++) {
      if (head == null){
        return null;
      }
      head = head.next;
    }
    return head;
  }

  /**
   * 查找节点
   * @param head
   * @param target
   * @return
   */
  int find(ListNode head, Object target){
    int index = 0;
    while(head != null){
      if (Objects.equals(target, head.val)){
        return index;
      }
      head = head.next;
      index ++;
    }
    return -1;
  }


}

