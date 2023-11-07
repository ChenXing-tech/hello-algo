package codes.java.algo.recursion.recall;

import codes.java.structure.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;

/**
 * @author chenxing@bailongma-inc.com
 * @date 2023/11/7
 * @description
 */
public class preorder_traversal_ii_compact {

  public List<List<TreeNode>> list = new ArrayList<>();
  public List<TreeNode> path =  new ArrayList<>();


  public void preOrder(TreeNode treeNode){
    if (treeNode == null){
      return;
    }
    // 尝试
    path.add(treeNode);
    if (treeNode.val == 7){
      // 记录解
      list.add(path);
    }
    preOrder(treeNode.left);
    preOrder(treeNode.right);
    // 回退
    path.remove(path.size() - 1);
  }
}
