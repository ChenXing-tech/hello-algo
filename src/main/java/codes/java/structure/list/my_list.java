package codes.java.structure.list;

/**
 * @author chenxing@bailongma-inc.com
 * @date 2023/10/26
 * @description
 */

import java.util.Arrays;

/**
 * 列表类的简易实现
 */
public class my_list {

  private int[] arr; // 数组，（存储列表元素）
  private int capacity = 10; // 列表容量
  private int size = 0; // 列表长度
  private int extendRatio = 2; // 每次列表扩容的倍数

  /**
   * 构造方法
   */
  public my_list(){
    arr = new int[capacity];
  }

  /**
   * 获取当前列表长度
   */
  public int size(){
    return size;
  }

  /**
   * 获取列表容量
   */
  public int capacity(){
    return capacity;
  }

  /**
   * 访问元素
   */
  public int get(int index){
    if (index < 0 || index >= size){
      throw new IndexOutOfBoundsException("索引越界");
    }
    return arr[index];
  }

  /**
   * 设置元素
   */
  public void set(int num, int index){
    if (index < 0 || index >= size){
      throw new IndexOutOfBoundsException("索引越界");
    }
    arr[index] = num;
  }

  /**
   * 尾部添加元素
   */
  public void add(int num){
    if (size == capacity){
      extendCapacity();
    }
    arr[size] = num;
    size++;
  }

  /**
   * 中间添加元素
   */
  public void insert(int num, int index){
    if (index < 0 || index > size){
      throw  new IndexOutOfBoundsException("数组越界");
    }
    if (size == capacity()){
      extendCapacity();
    }
    for (int j = size - 1; j > index ; j--) {
      arr[j + 1] = arr[j];
    }
    arr[index] = num;
    size++;
  }

  public void remove(int index){
    if (index < 0 || index > size){
      throw  new IndexOutOfBoundsException("数组越界");
    }
    for (int i = 0; i < size; i++) {
      arr[i] = arr[i+1];
    }
    size--;
  }

  /**
   * 扩容数组
   */
  public void extendCapacity(){
    arr = Arrays.copyOf(arr, capacity() * extendRatio);
    capacity = arr.length;
  }

  /**
   * 将列表转换为数组
   */
  public int[] toArray(){
    int size = size();
    int[] arr  = new int[size];
    for (int i = 0; i < size; i++) {
      arr[i] = get(i);
    }
    return arr;
  }
}
