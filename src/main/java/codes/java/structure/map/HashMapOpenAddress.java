package codes.java.structure.map;

import java.security.Key;

/**
 * @author chenxing@bailongma-inc.com
 * @date 2023/10/30
 * @description 开放地址寻址法
 */
public class HashMapOpenAddress {
  private int size; // 大小
  private int capacity = 4; // 容量
  private final double loadThres = 2.0 / 3.0; // 负载因子阈值
  private int extendRatio = 2; // 扩容倍数
  private Pair[] buckets; // 桶数组
  private final Pair TOMBSTONE = new Pair(-1, "-1"); // 删除标记

  public HashMapOpenAddress() {
    size = 0;
    buckets = new Pair[capacity];
  }

  public int hashFunc(int key){
    return key % capacity;
  }

  public double loadFactor(){
    return (double)size/capacity;
  }

  /* 搜索key对应的桶索引 */
  public int findBucket(int key){
    int index = hashFunc(key);
    int firstTombstone = -1;
    // 线性检测，当遇到空桶退出
    while (buckets[index] != null){
      // 遇到key，返回桶索引
      if( buckets[index].key == key){
        // 若遇到了标记，则将键值对移动到至该索引
        if (firstTombstone != -1){
          buckets[firstTombstone] = buckets[index];
          buckets[index] = TOMBSTONE;
          return firstTombstone;
        }
        return index;
      }
      // 记录遇到的首个删除标记
      if (firstTombstone == -1 && buckets[index] == TOMBSTONE){
        firstTombstone = index;
      }
      index = (index + 1) % capacity;
    }
    return firstTombstone == -1 ? index : firstTombstone;
  }



  public String get(int key){
    int index = findBucket(key);
    if (buckets[index] != null && buckets[index] != TOMBSTONE){
      return buckets[index].val;
    }
    return null;
  }

  /**
   * 添加元素
   * @param key
   * @param val
   */
  public void put(int key, String val){
    if (loadFactor() > loadThres){
      extend();
    }
    int index = findBucket(key);
    if(buckets[index] != null && buckets[index] != TOMBSTONE){
      buckets[index].val = val;
      return;
    }
    buckets[index] = new Pair(key,val);
    size++;
  }

  /**
   * 删除元素
   * @param key
   */
  public void remove(int key){
    int index = findBucket(key);
    if (buckets[index] != null && buckets[index] != TOMBSTONE) {
      buckets[index] = TOMBSTONE;
      size--;
    }
  }

  public void extend(){
    Pair[] bucketsTmp = buckets;
    capacity *= extendRatio;
    buckets = new Pair[capacity];
    for (Pair pair : bucketsTmp) {
      if (pair != null && pair != TOMBSTONE){
        put(pair.key, pair.val);
      }
    }
  }

  public void print(){

  }
}
