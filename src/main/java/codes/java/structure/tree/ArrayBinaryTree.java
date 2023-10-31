package codes.java.structure.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chenxing@bailongma-inc.com
 * @date 2023/10/31
 * @description
 */
public class ArrayBinaryTree {

  private List<Integer> tree;

  public ArrayBinaryTree(List<Integer> tree) {
    this.tree = tree;
  }

  /**
   * 节点数量
   * @return
   */
  int size(){
    return tree.size();
  }

  public Integer val(int i){
    if (i < 0 || i >= size()){
      return null;
    }
    return tree.get(i);
  }

  public Integer left(int i){
    return 2 * i + 1;
  }

  public Integer right(int i){
    return 2 * i + 2;
  }

  public Integer parent(int i ){
    return (i - 1) / 2;
  }

  /**
   * 层次遍历
   * @return
   */
  public List<Integer> levelOrder(){
    List<Integer> res = new ArrayList<>();
    for (int i = 0; i < tree.size(); i++) {
      Integer val = val(i);
      if (val != null){
        res.add(val);
      }
    }
    return res;
  }

  private void dfs(Integer i, String order, List<Integer> res){
    if (val(i) == null){
      return;
    }
    if (order.equals("pre")){
      res.add(val(i));
    }
    dfs(left(i), order, res);
    if (order.equals("in")){
      res.add(val(i));
    }
    dfs(right(i), order ,res);
    if (order.equals("post")){
      res.add(val(i));
    }
  }

  public List<Integer> preOrder(){
    List<Integer> res = new ArrayList<>();
    dfs(0, "pre", res);
    return res;
  }

  public List<Integer> inOrder(){
    List<Integer> res = new ArrayList<>();
    dfs(0, "in", res);
    return res;
  }

  public List<Integer> postOrder(){
    List<Integer> res = new ArrayList<>();
    dfs(0, "post", res);
    return res;
  }
}
