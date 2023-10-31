package codes.java.structure.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author chenxing@bailongma-inc.com
 * @date 2023/10/31
 * @description
 */
public class binary_tree_bfs {

  /**
   * 层次遍历
   * @param treeNode
   */
  public void levelOrder(TreeNode treeNode){
    LinkedList<TreeNode> queue = new LinkedList();
    queue.add(treeNode);
    List<Integer> list = new ArrayList<>();
    while (!queue.isEmpty()){
      TreeNode node = queue.poll();
      list.add(node.val);
      TreeNode leftNode = node.left;
      TreeNode rightNode = node.right;
      if (leftNode != null){
        queue.offer(leftNode);
      }
      if (rightNode != null){
        queue.offer(rightNode);
      }
    }
  }

}
