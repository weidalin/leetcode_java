package src.leetcode.medium;

import tools.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * 145. 二叉树的后序遍历
 * 给定一个二叉树，返回它的 后序 遍历。
 *
 * 示例:
 *
 * 输入: [1,null,2,3]
 *    1
 *     \
 *      2
 *     /
 *    3
 *sss
 * 输出: [3,2,1]
 * 进阶: 递归算法很简单，你可以通过迭代算法完成吗？
 *
 *
 * kljlkjlssss三四三sss 三四三履历ssssssssaaa
 */



public class easy145_postorderTraversal {
    //version2: iterate----------------------------------------------------
    public static List<Integer> iterate(TreeNode root) {
        LinkedList<Integer> list = new LinkedList<>();
        Stack<TreeNode> stack = new Stack();
        while (!stack.empty() || root != null) {
            while (root != null) {
                list.addFirst(root.val);
                stack.push(root);
                root = root.right;
            }
            if (!stack.empty()) {
                root = stack.pop();
                root = root.left;
            }
        }
        return list;
    }

    //version1: traversal----------------------------------------------------
    public static List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        postorder(root, res);
        return res;
    }
    public static void postorder(TreeNode root, List<Integer> res){
        if (root == null){
            return;
        }
        postorder(root.left, res);
        postorder(root.right, res);
        res.add(root.val);
    }

    public static void main(String[] args) {
        Integer[] integers = {1, null, 2, 3};
        TreeNode treeNode = TreeNode.InitTree(integers);
        List res = iterate(treeNode);
        System.out.println(res);
    }
}
