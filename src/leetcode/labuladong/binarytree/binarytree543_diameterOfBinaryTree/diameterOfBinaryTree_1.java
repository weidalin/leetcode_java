package leetcode.labuladong.binarytree.binarytree543_diameterOfBinaryTree;


import tools.TreeNode;

/*
543. 二叉树的直径
给定一棵二叉树，你需要计算它的直径长度。一棵二叉树的直径长度是任意两个结点路径长度中的最大值。这条路径可能穿过也可能不穿过根结点。



示例 :
给定二叉树

          1
         / \
        2   3
       / \
      4   5
返回 3, 它的长度是路径 [4,2,1,3] 或者 [5,2,1,3]。
 */
public class diameterOfBinaryTree_1 {

    static int res = 0;
    public static int diameterOfBinaryTree(TreeNode root) {
        depth(root);
        return res;
    }
    public static int depth(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = depth(root.left);
        int right = depth(root.right) ;
        res = Math.max(left + right, res);

        return Math.max(left, right) + 1;

    }
}/**
 执行用时：
 0 ms
 , 在所有 Java 提交中击败了
 100.00%
 的用户
 内存消耗：
 38.7 MB
 , 在所有 Java 提交中击败了
 11.77%
 的用户*/
