package codes.java.structure.list;

/**
 * @author chenxing@bailongma-inc.com
 * @date 2023/10/26
 * @description
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 初始化列表
 * 无初始值
 */
public class list {

  private List<Integer> init(){
    ArrayList list = new ArrayList<>();
    Integer[] nums = {1, 2, 3, 4, 5};
    List<Integer> integers = Arrays.asList(nums);
    return integers;
  }

  /**
   * 随机访问
   * @param num
   * @return
   */
  private Integer access(int num){
    List<Integer> list = init();
    Integer integer = list.get(num);
    list.set(1,0);
    return integer;
  }

  /**
   * 插入数据
   * @param num
   * @param index
   */
  private void insert(int num, int index){
    List<Integer> integers = init();
    // 插入到指定位置
    Integer integer = integers.set(index, num);
    // 插入到尾部
    integers.add(num);
  }

  /**
   * 删除数据
   * @param num
   * @param index
   */
  private void remove(int num, int index){
    List<Integer> integers = init();
    integers.remove(index);
  }

  /**
   * 遍历list
   */
  private void traverse(){
    List<Integer> list = init();
    for (int i = 0; i < list.size(); i++) {
      System.out.println(i);
    }
  }

  /**
   * 集合元素排序
   */
  private void sort(){
    List<Integer> list = init();
    Collections.sort(list);
  }

}
