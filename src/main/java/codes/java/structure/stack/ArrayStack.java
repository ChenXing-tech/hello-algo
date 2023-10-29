package codes.java.structure.stack;

import java.util.ArrayList;

/**
 * @author chenxing@bailongma-inc.com
 * @date 2023/10/26
 * @description
 */
public class ArrayStack {
  private ArrayList<Integer> stack;

  public ArrayStack(){
    // 初始化列表（动态数组）
    stack = new ArrayList<>();
  }

  /**
   * 获取栈的长度
   */
  public int size(){
    return stack.size();
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
    stack.add(num);
  }

  /**
   * 出栈
   */
  public int pop(){
    if (isEmpty()){
      throw new IndexOutOfBoundsException();
    }
    return stack.remove(size() - 1);
  }

  /**
   * 栈顶元素
   */
  public int peek(){
    if (isEmpty()){
      throw new IndexOutOfBoundsException();
    }
    Integer peek = stack.get(size() - 1);
    return peek;
  }

  public Object[] toArray(){
    return stack.toArray();
  }
}
