package codes.java.structure.map;

import java.util.HashMap;
import java.util.Map.Entry;

/**
 * @author chenxing@bailongma-inc.com
 * @date 2023/10/30
 * @description
 */
public class hash_map {

  /**
   * map性质
   */
  private void nature(){
    HashMap<Integer, String> map = new HashMap<>();
    /* 添加操作 */
    // 在哈希表中添加键值对 (key, value)
    map.put(12836, "小哈");
    map.put(15937, "小啰");
    map.put(16750, "小算");
    map.put(13276, "小法");
    map.put(10583, "小鸭");
    /*删除*/
    map.remove(12836);
    /*修改*/
    map.put(15937, "小赛");
    /*查询*/
    String name = map.get(16750);
    for (Entry<Integer, String> integerStringEntry : map.entrySet()) {
      System.out.println(integerStringEntry.getKey() + integerStringEntry.getValue());
    }
    for (Integer integer : map.keySet()) {
      System.out.println("key:" + integer);
    }

    for (String value : map.values()) {
      System.out.println("value:" + value);
    }
  }




}
