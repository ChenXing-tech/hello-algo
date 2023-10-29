package codes.java.structure.queue;

/**
 * @author chenxing@bailongma-inc.com
 * @date 2023/10/26
 * @description 基于环形数组实现的队列
 */

public class ArrayQueue {
  // 用户存储队列元素的数组
  private int[] arr;
  // 队首指针，指向队首元素
  private int front;
  // 队列长度
  private int queSize;

  public ArrayQueue(int capacity){
    arr = new int[capacity];
    front = 0;
    queSize = 0;
  }

  /**
   * 获取队列的容量
   */
  public int capacity(){
    return arr.length;
  }

  /**
   * 获取队列的长度
   */
  public int size(){
    return queSize;
  }

  /**
   * 判断队列是否为空
   */
  public boolean isEmpty(){
    return queSize == 0;
  }

  /**
   * 入队
   * @param num
   */
  public void push(int num){
    // 判断队列是否已满
    if (queSize == capacity()){
      System.out.println("队列已满");
      return;
    }
    int rear = (front + queSize) % capacity();
    // 将num添加至队尾
    arr[rear] = num;
    queSize++;
  }

  /**
   * 出队
   * @return
   */
  public int pop(){
    int peek = peek();
    // 队首指针向后移动一位，若越过尾部则返回到数组头部
    front = (front + 1) / capacity();
    queSize--;
    return peek;
  }

  public int peek(){
    if (isEmpty()){
      throw new IndexOutOfBoundsException();
    }
    return arr[front];
  }

  /**
   * 返回数组
   */
  public int[] toArray(){
    // 仅转换有效长度范围内的列表元素
    int[] nums = new int[queSize];
    for (int i = 0; i < nums.length; i++) {
      nums[i] = arr[front % capacity()];
      front++;
    }
    return nums;
  }
}
