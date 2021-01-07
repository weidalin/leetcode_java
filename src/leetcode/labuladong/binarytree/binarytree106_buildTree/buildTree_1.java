package leetcode.labuladong.binarytree.binarytree106_buildTree;

import tools.TreeNode;

import java.util.HashMap;

/*
106. 从中序与后序遍历序列构造二叉树
根据一棵树的中序遍历与后序遍历构造二叉树。

注意:
你可以假设树中没有重复的元素。

例如，给出

中序遍历 inorder = [9,3,15,20,7]
后序遍历 postorder = [9,15,7,20,3]
返回如下的二叉树：

    3
   / \
  9  20
    /  \
   15   7
 */
public class buildTree_1 {

    private static HashMap<Integer, Integer> in_idx;
    public static TreeNode buildTree(int[] inorder, int[] postorder) {
        in_idx = new HashMap<>();
        for (int i = 0; i < inorder.length; i++){
            in_idx.put(inorder[i], i);
        }
        return helper(inorder, 0, inorder.length-1, postorder, 0, postorder.length-1);
    }

    private static TreeNode helper(int[] inorder, int in_l, int in_r, int[] postorder, int post_l, int post_r) {
        if (in_l > in_r)
            return null;
        int root_idx_in_in = in_idx.get(postorder[post_r]);
        int size_left_subtree = root_idx_in_in - in_l - 1;
        TreeNode root = new TreeNode(postorder[post_r]);

        root.left = helper(inorder, in_l, root_idx_in_in - 1, postorder, post_l, post_l + size_left_subtree);
        root.right = helper(inorder, root_idx_in_in + 1, in_r, postorder, post_l + size_left_subtree + 1, post_r - 1);
        return root;
    }
}
/**
 * 显示详情
 * 执行用时：
 * 2 ms
 * , 在所有 Java 提交中击败了
 * 97.50%
 * 的用户
 * 内存消耗：
 * 38.7 MB
 * , 在所有 Java 提交中击败了
 * 39.51%
 * 的用户
 */
