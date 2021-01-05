package leetcode.labuladong.binarytree.binarytree114_flatten;

import tools.TreeNode;
/*
给定一个二叉树，原地将它展开为一个单链表。

 

例如，给定二叉树

    1
   / \
  2   5
 / \   \
3   4   6
将其展开为：

1
 \
  2
   \
    3
     \
      4
       \
        5
         \
          6

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/flatten-binary-tree-to-linked-list
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class flatten_1 {
    public static void flatten(TreeNode root) {
        if(root == null)    return;
        //左右被拉直
        flatten(root.left);
        flatten(root.right);
        //得到左右
        TreeNode left = root.left;
        TreeNode right = root.right;

        //断开
        root.left = null;
        root.right = left;

        //将原先右子树接到当前右子树的末端
        TreeNode p = root;
        while(p.right != null)
            p = p.right;
        p.right = right;
    }
}/**
 执行用时：
 1 ms
 , 在所有 Java 提交中击败了
 40.68%
 的用户
 内存消耗：
 37.9 MB
 , 在所有 Java 提交中击败了
 70.24%
 的用户*/

