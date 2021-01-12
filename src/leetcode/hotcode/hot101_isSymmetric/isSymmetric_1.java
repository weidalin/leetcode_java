package leetcode.hotcode.hot101_isSymmetric;

import tools.TreeNode;
/*
101. 对称二叉树
给定一个二叉树，检查它是否是镜像对称的。



例如，二叉树 [1,2,2,3,4,4,3] 是对称的。

    1
   / \
  2   2
 / \ / \
3  4 4  3


但是下面这个 [1,2,2,null,3,null,3] 则不是镜像对称的:

    1
   / \
  2   2
   \   \
   3    3
 */
public class isSymmetric_1 {
    public static boolean isSymmetric(TreeNode root) {
        if (root == null)   return true;
        return isSymmetric_helper(root.left, root.right);
    }

    private static boolean isSymmetric_helper(TreeNode left, TreeNode right) {
        if(left == null && right == null)   return true;
        else if(left == null || right == null)  return false;
        else if(left.val == right .val){
            return isSymmetric_helper(left.left, right.right) && isSymmetric_helper(left.right, right.left);
        }else if (left.val != right.val)
            return false;
        else
            return false;
    }
}/**
 执行用时：
 0 ms
 , 在所有 Java 提交中击败了
 100.00%
 的用户
 内存消耗：
 36.6 MB
 , 在所有 Java 提交中击败了
 38.92%
 的用户*/
