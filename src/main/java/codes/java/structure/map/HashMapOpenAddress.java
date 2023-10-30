package codes.java.structure.map;

/**
 * @author chenxing@bailongma-inc.com
 * @date 2023/10/30
 * @description 开放地址寻址法
 */
public class HashMapOpenAddress {
  private int size; // 大小
  private int capacity = 4; // 容量
  private final double loadThres = 2.0 / 3.0; // 负载因子阈值
  private int extendRatio = 2;
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

  public int findBucket(int key){
    int index = hashFunc(key);
    int firstTombstone = -1;
    while (buckets[index] != null){
      return -1;
    }
    return -1;
  }

  public String get(int key){
    int index = hashFunc(key);
    for (int i = index; i < size ; i++) {
      if (buckets[i].key == key){
        return buckets[i].val;
      }
    }
    return null;
  }
}
