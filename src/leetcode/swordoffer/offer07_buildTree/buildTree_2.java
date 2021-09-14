package leetcode.swordoffer.offer07_buildTree;

import tools.TreeNode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import static tools.Weida_utils.print_tree;

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
public class buildTree_2 {
    static int[] preorder;
    static Map<Integer, Integer> map;
    public static TreeNode buildTree(int[] pre, int[] inorder) {
        preorder = pre;
        map = new HashMap<>();
        for(int i = 0; i < inorder.length; i++){
            map.put(inorder[i], i);
        }
        return recure(0, 0, inorder.length - 1);
    }
    public static TreeNode recure(int rootIdxatPre, int inLeft, int inRight){
        if(inLeft > inRight)    return null;
        int rootIdxatIn = map.get(preorder[rootIdxatPre]);
        TreeNode root = new TreeNode(preorder[rootIdxatPre]);
        int leftTreeSize = rootIdxatIn - inLeft + 1;
        root.left = recure(rootIdxatPre + 1, inLeft, rootIdxatIn -1);
        root.right = recure(rootIdxatPre + leftTreeSize, rootIdxatIn + 1, inRight);
        return root;
    }

    public static void main(String[] args) {
        int[] preorder = {3,9,20,15,7};
        int[] inorder = {9,3,15,20,7};
        TreeNode root = buildTree(preorder, inorder);
        print_tree(root);
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
