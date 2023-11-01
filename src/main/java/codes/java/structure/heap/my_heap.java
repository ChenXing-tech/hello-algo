package codes.java.structure.heap;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chenxing@bailongma-inc.com
 * @date 2023/11/1
 * @description
 */
public class my_heap {

  private List<Integer> maxHeap;

  public my_heap(List<Integer> nums) {
    this.maxHeap = new ArrayList<>(nums);
    for (int i = parent(size() - 1); i >= 0 ; i--) {
      signDown(i);
    }
  }

  public int size(){
    return maxHeap.size();
  }

  public boolean isEmpty(){
    return maxHeap.size() == 0;
  }

  public int left(int i){
    return 2 * i - 1;
  }

  public int right (int i){
    return 2 * i - 2;
  }

  public int parent(int i){
    return  (i - 1) / 2;
  }

  public void swap(int i, int j){
    Integer tmp = maxHeap.get(i);
    maxHeap.set(i, maxHeap.get(j));
    maxHeap.set(j, tmp);
  }

  public void peek(){
    maxHeap.get(0);
  }

  public void push(int val){
    maxHeap.add(val);
    siftUp(size() - 1);
  }

  /***
   * 从节点i开始彻底堆化
   * @param i
   */
  private void siftUp(int i) {
    while(true){
      // 获取i的父节点
      int parent = parent(i);
      // 无法修复或越过根节点，结束堆化
      if (maxHeap.get(i) <= maxHeap.get(parent) || parent < 0){
        return;
      }
      swap(i, parent);
      i = parent;
    }
  }

  /**
   * 元素出堆
   */
  public int pop(){
    if (isEmpty()){
      throw new IndexOutOfBoundsException();
    }
    swap(0, size() - 1);
    Integer integer = maxHeap.remove(size() - 1);
    signDown(0);
    return integer;
  }

  public void signDown(int i) {
    while(true){
      // 判断 i， l, r中最大的节点，记为ma
      int l = left(i), r = right(i), ma = i;
      if (l < size() && maxHeap.get(l) > maxHeap.get(ma)){
        ma = l;
      }
      if (r < size() && maxHeap.get(r) > maxHeap.get(ma)){
        ma = r;
      }
      if (ma == i){
        break;
      }
      swap(i, ma);
      i = ma;
    }
  }
}
