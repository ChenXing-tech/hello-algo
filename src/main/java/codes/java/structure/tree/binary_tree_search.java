package codes.java.structure.tree;

/**
 * @author chenxing@bailongma-inc.com
 * @date 2023/10/31
 * @description
 */
public class binary_tree_search {

  private TreeNode root;

  private TreeNode getRoot(){
    return root;
  }

  /**
   * 查找节点
   * @param num
   * @return
   */
  TreeNode search(int num){
    TreeNode cur = root;
    while (cur != null){
      int val = cur.val;
      if (num > val){
        cur = cur.right;
      } else if (num < val){
        cur = cur.left;
      } else {
        break;
      }
    }
    return cur;
  }

  /**
   * 插入节点
   * @param num
   */
  void insert(int num){
    if (root == null){
      root = new TreeNode(num);
      return;
    }
    TreeNode cur = root ,pre =null;
    while (cur != null){
      if (cur.val == num){
        return;
      }
      pre = cur;
      if (cur.val > num){
        cur = cur.left;
      }
      if (cur.val < num){
        cur = cur.right;
      }
    }
    if (pre.val > num){
      pre.left = new TreeNode(num);
    }
    if (pre.val < num){
      pre.right = new TreeNode(num);
    }
  }

  /**
   * 删除节点
   */
  void remove(int num){
    if (root == null){
      return;
    }
    TreeNode cur = root, pre = null;
    while(cur != null){
      if (cur.val == num){
        break;
      }
      pre = cur;
      if (cur.val > num){
        cur = cur.left;
      }
      if (cur.val < num){
        cur = cur.right;
      }
    }
    if (cur == null){
      return;
    }

    if (cur.left == null || cur.right == null){
      TreeNode chlid = cur.left != null ? cur.left : cur.right;
      if (cur != root){
        if (pre.left == cur){
          pre.left = chlid;
        } else {
          pre.right = chlid;
        }
      } else {
        root = chlid;
      }
    }
    if (cur.left != null && cur.right != null){
      TreeNode tmp = cur.right;
      while (tmp.left != null){
        tmp = tmp.left;
      }
      remove(tmp.val);
      cur.val  = tmp.val;
    }
  }



}
