package codes.java.structure.tree;

/**
 * @author chenxing@bailongma-inc.com
 * @date 2023/10/31
 * @description 二叉树
 * */
public class binary_tree {

  public void init(){
    TreeNode n1 = new TreeNode(1);
    TreeNode n2 = new TreeNode(2);
    TreeNode n3 = new TreeNode(3);
    TreeNode n4 = new TreeNode(4);
    TreeNode n5 = new TreeNode(5);
    n1.left = n2;
    n1.right = n3;
    n2.left = n4;
    n2.right = n5;
    // 插入节点p
    TreeNode p = new TreeNode(0);
    n1.left = p;
    p.left = n2;
    // 删除节点p
    n1.left = n2;
  }
}
