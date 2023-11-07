package codes.java.algo.recursion.recall;

import codes.java.structure.tree.TreeNode;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;

/**
 * @author chenxing@bailongma-inc.com
 * @date 2023/11/7
 * @description
 */
public class preorder_traversal_i_compact {

  public List list = new ArrayList();

  public void preOrder(TreeNode treeNode){
    if (treeNode == null){
      return;
    }
    if (treeNode.val == 7){
      // 记录解
      list.add(treeNode.val);
    }
    preOrder(treeNode.left);
    preOrder(treeNode.right);
  }



}
