package codes.java.algo.recursion.recall;

import codes.java.structure.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;

/**
 * @author chenxing@bailongma-inc.com
 * @date 2023/11/7
 * @description 剪枝
 */
public class preorder_traversal_iii_compact {
  private List<List<TreeNode>> res = new ArrayList<>();
  private List<TreeNode> path = new ArrayList<>();

  public void preOrder(TreeNode treeNode){
    if (treeNode == null || treeNode.val == 3){
      return;
    }
    path.add(treeNode);
    if (treeNode.val == 7){
      res.add(path);
    }
    preOrder(treeNode.left);
    preOrder(treeNode.right);
    path.remove(path.size() - 1);
  }
}
