package codes.java.algo.recursion.divide;

import codes.java.structure.tree.TreeNode;
import java.util.HashMap;

/**
 * @author chenxing@bailongma-inc.com
 * @date 2023/11/6
 * @description
 */
public class build_tree {

  public TreeNode dfs(int[] preOrder ,HashMap<Integer, Integer> map, int i, int l, int r){
    if (r - l < 0){
      return null;
    }
    TreeNode root = new TreeNode(preOrder[i]);
    int m = map.get(preOrder[i]);
    root.left = dfs(preOrder, map, i , l, m - 1);
    root.right = dfs(preOrder, map, i + 1 + m - l , m + 1, r);
    return root;
  }

  /**
   * 根据前序，中序遍历二叉树
   * @param preOrder
   * @param inOrder
   * @return
   */
  public TreeNode buildTree(int[] preOrder ,int[] inOrder){
    HashMap<Integer, Integer> inOrderheadMap = new HashMap<>();
    for (int i = 0; i < inOrder.length - 1; i++) {
      inOrderheadMap.put(inOrder[i], i);
    }
    TreeNode dfs = dfs(preOrder, inOrderheadMap, 0, 0, preOrder.length - 1);
    return dfs;
  }
}
