package leetcode.swordoffer.offer07_buildTree;

import tools.TreeNode;

import java.util.HashMap;

/**
 * 剑指 Offer 07. 重建二叉树
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 *
 *
 *
 * 例如，给出
 *
 * 前序遍历 preorder = [3,9,20,15,7]
 * 中序遍历 inorder = [9,3,15,20,7]
 * 返回如下的二叉树：
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 */
public class buildTree_1 {

    HashMap<Integer, Integer> map = new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for(int i = 0; i < inorder.length; i++){
            map.put(inorder[i], i);
        }
        return buildTree_helper(0, preorder, 0, preorder.length);
    }

    private TreeNode buildTree_helper(int root_idx, int[] preorder, int left, int right) {
        if(left > right){
            return null;
        }
        TreeNode root = new TreeNode(preorder[root_idx]);
        int idx = map.get(preorder[root_idx]);
        root.left = buildTree_helper(root_idx + 1, preorder, left, idx-1);
        root.right = buildTree_helper(root_idx + idx - left + 1, preorder, idx + 1, right);
        return root;
    }

}
/**
 * 执行用时：
 * 2 ms
 * , 在所有 Java 提交中击败了
 * 99.13%
 * 的用户
 * 内存消耗：
 * 38.7 MB
 * , 在所有 Java 提交中击败了
 * 42.90%
 * 的用户
 */
