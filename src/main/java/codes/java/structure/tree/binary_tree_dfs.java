package codes.java.structure.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chenxing@bailongma-inc.com
 * @date 2023/10/31
 * @description
 */
public class binary_tree_dfs {

  public List<Integer> list = new ArrayList<Integer>();

  /**
   * 前序遍历
   * @param root
   */
  void preOrder(TreeNode root){
    if (root == null){
      return;
    }
    list.add(root.val);
    preOrder(root.left);
    preOrder(root.right);
  }

  /**
   * 中序遍历
   */
  void inOrder(TreeNode root){
    if (root == null){
      return;
    }
    inOrder(root.left);
    list.add(root.val);
    inOrder(root.right);
  }

  /**
   * 后序遍历
   * @param root
   */
  void postOrder(TreeNode root){
    if (root == null){
      return;
    }
    postOrder(root.left);
    postOrder(root.right);
    list.add(root.val);
  }
}
