package codes.java.structure.stack;

import java.util.Stack;

/**
 * @author chenxing@bailongma-inc.com
 * @date 2023/10/26
 * @description
 */
public class stack {

  // 堆栈性质
  public void nature(){
    // 初始化堆栈
    Stack<Integer> stack = new Stack<>();
    // 元素入栈
    stack.push(1);
    stack.push(3);
    stack.push(2);
    stack.push(5);
    stack.push(4);

    // 元素出栈
    Integer pop = stack.pop();

    // 获取栈的长度
    int size = stack.size();

    // 获取栈顶元素
    Integer peek = stack.peek();

    // 判断堆栈是否为空
    boolean empty = stack.isEmpty();
  }


}
