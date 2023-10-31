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
    // 队首指针向左移动一位
    // 通过取余操作，实现front跃过数组头部后回到尾部
    front = index(front - 1);
    arr[front] =  num;
    queSize++;
  }

  public void pushLast(int num){
    if (queSize == capacity()){
      System.out.println("双向队列已满");
      return;
    }
    // 队尾指针向右移动一位
    // 通过取余操作，实现rear跃过数组尾部
    int rear = index(front + queSize);
    arr[rear] = num;
    queSize++;
  }

  public int popFirst(){
    int num = peekFirst();
    front = index(front + 1);
    queSize--;
    return num;
  }

  public int popLast(){
    int num = peekLast();
    queSize--;
    return num;
  }


  /**
   * 获取队首元素
   * @return
   */
  public int peekFirst(){
    if (isEmpty()){
      throw new IndexOutOfBoundsException();
    }
    return arr[front];
  }

  /**
   * 获取队尾元素
   */
  public int peekLast(){
    if (isEmpty()){
      throw new IndexOutOfBoundsException();
    }
    int lastIndex = index(front + queSize - 1);
    return arr[lastIndex];
  }

  /* 返回数组用于打印 */
  public int[] toArray() {
    // 仅转换有效长度范围内的列表元素
    int[] res = new int[queSize];
    for (int i = 0, j = front; i < queSize; i++, j++) {
      res[i] = arr[index(j)];
    }
    return res;
  }
}
