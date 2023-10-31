package codes.java.structure.map;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author chenxing@bailongma-inc.com
 * @date 2023/10/30
 * @description
 */
public class array_hash_map {

  private List<Pair> buckets;

  public array_hash_map() {
    buckets = new ArrayList<>();
    for (int i = 0; i < 100; i++) {
      buckets.add(null);
    }
  }

  public int hashFunc(int key){
    int index  = key % 100;
    return index;
  }

  /**
   * 获取value值
   * @param key
   * @return
   */
  public String get(int key){
    int index = hashFunc(key);
    Pair pair = buckets.get(index);
    if (pair == null){
      return null;
    }
    return pair.getVal();
  }

  /**
   * 添加操作
   */
  public void put(int key, String value){
    Pair pair = new Pair(key, value);
    int index = hashFunc(key);
    buckets.set(index, pair);
  }

  /**
   * 删除操作
   */
  public void remove(int key){
    int index = hashFunc(key);
    buckets.set(index, null);
  }

  /**
   * 获取所有键值对
   * @return
   */
  public List<Pair> getPairSet(){
    List<Pair> pairSet = new ArrayList<>();
    for (Pair pair : buckets) {
      if (Objects.nonNull(pair)){
        pairSet.add(pair);
      }
    }
    return pairSet;
  }

  /**
   * 获取所有键Set
   */
  public List<Integer> getKeySet(){
    List<Integer> keySet = new ArrayList<>();
    for (Pair pair : buckets) {
      if (Objects.nonNull(pair)){
        keySet.add(pair.getKey());
      }
    }
    return keySet;
  }

  /**
   * 获取所有值Set
   */
  public List<String> getValueSet(){
    List<String> valueSet = new ArrayList<>();
    for (Pair pair : buckets){
      if (Objects.nonNull(pair)){
        valueSet.add(pair.getVal());
      }
    }
    return valueSet;
  }

  /**
   * 打印哈希表
   */
  public void print(){
    for (Pair pair : buckets) {
      if (Objects.nonNull(pair)){
        System.out.println("pair key: " + pair.key + "pair val:" + pair.val);
      }
    }
  }
}
