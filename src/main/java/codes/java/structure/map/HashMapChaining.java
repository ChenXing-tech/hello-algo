package codes.java.structure.map;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chenxing@bailongma-inc.com
 * @date 2023/10/30
 * @description 链式地址哈希表
 * 注意当链表很长时，此时可以将链表转化为avl树或者红黑树
 */
public class HashMapChaining {

  // 键值对数量
  int size;
  // 容量
  int capacity;
  // 触发扩容的负载因子阈值
  double loadThres;
  // 扩容倍数
  int extendRatio;
  // 桶数组
  List<List<Pair>> buckets;

  public HashMapChaining() {
    size = 0;
    capacity = 4;
    loadThres = 2.0 / 3.0;
    extendRatio = 2;
    buckets = new ArrayList<>(capacity);
    for (int i = 0; i < capacity; i++) {
      List<Pair> list = new ArrayList<>();
      buckets.add(list);
    }
  }

  /**
   * 哈希函数
   * @param key
   * @return
   */
  public int hashFunc(int key){
    return key % capacity;
  }

  /**
   * 负载因子
   * @return
   */
  public double loadFactor(){
    return (double) size / capacity;
  }

  /**
   * 查询操作
   */
  public String get(int key){
    int index = hashFunc(key);
    List<Pair> pairs = buckets.get(index);
    if (pairs == null || pairs.size() == 0){
      return null;
    }
    for (Pair pair : pairs) {
      if (pair.key == key){
        return pair.val;
      }
    }
    return null;
  }

  /**
   * 添加操作
   */
  public void put(int key , String val){
    if (loadFactor() > loadThres){
      extend();
    }
    int index = hashFunc(key);
    List<Pair> pairs = buckets.get(index);
    for (Pair pair : pairs) {
      if (pair.key == key){
        pair.val = val;
        return;
      }
    }
    Pair pair = new Pair(key, val);
    pairs.add(pair);
    size++;
  }

  /**
   * 删除
   */
  public void remove(int key){
    int index = hashFunc(key);
    List<Pair> pairs = buckets.get(index);
    for (Pair pair : pairs) {
      if (pair.key == key){
        pairs.remove(key);
        size--;
        break;
      }
    }
  }

  /**
   * 扩容
   */
  public void extend(){
    // 暂存原哈希表
    List<List<Pair>> bucketsTmp = buckets;
    // 初始化扩容后的新哈希表
    capacity *= extendRatio;
    buckets = new ArrayList<>(capacity);
    for (int i = 0; i < capacity; i++) {
      buckets.add(new ArrayList<Pair>());
    }
    for (List<Pair> pairs : bucketsTmp) {
      for (Pair pair : pairs) {
        put(pair.getKey(), pair.getVal());
      }
    }
  }

  /**
   * 打印哈希表
   */
  public void print(){
    for (List<Pair> bucket : buckets) {
      for (Pair pair : bucket) {
        System.out.println("key:"+ pair.key + "val:" + pair.val);
      }
    }
  }
}
