package codes.java.structure.queue;

/**
 * @author chenxing@bailongma-inc.com
 * @date 2023/10/27
 * @description
 */
public class ArrayDeque {
  private int[] arr;
  private int front;
  private int queSize;

  /**
   * 构造方法
   */
  public ArrayDeque(int capacity) {
    this.arr = new int[capacity];
  }

  /**
   * 容量大小
   * @return
   */
  public int capacity(){
    return arr.length;
  }

  /**
   * 判断双向队列是否为空
   */
  public boolean isEmpty(){
    return queSize == 0;
  }

  /**
   * 获取元素索引
   * @param i
   * @return
   */
  public int index(int i){
    return (i + capacity()) % capacity();
  }

  /**
   * 队首入队
   * @param num
   */
  public void pushFirst(int num){
    if (queSize == capacity()){
      System.out.println("双向队列已满");
      return;
    }
  }
}
