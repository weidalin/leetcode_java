package leetcode.swordoffer.offer26_isSubStructure;

import tools.TreeNode;

/**
 * 剑指 Offer 26. 树的子结构
 * 输入两棵二叉树A和B，判断B是不是A的子结构。(约定空树不是任意一个树的子结构)
 *
 * B是A的子结构， 即 A中有出现和B相同的结构和节点值。
 *
 * 例如:
 * 给定的树 A:
 *
 *      3
 *     / \
 *    4   5
 *   / \
 *  1   2
 * 给定的树 B：
 *
 *    4
 *   /
 *  1
 * 返回 true，因为 B 与 A 的一个子树拥有相同的结构和节点值。
 *
 * 示例 1：
 *
 * 输入：A = [1,2,3], B = [3,1]
 * 输出：false
 * 示例 2：
 *
 * 输入：A = [3,4,5,1,2], B = [4,1]
 * 输出：true
 */
public class isSubStructure_1 {
    public static boolean isSubStructure(TreeNode A, TreeNode B) {
        if(B == null || A == null){
            return false;
        }
        if(A.val == B.val && helper(A.left, B.left) && helper(A.right, B.right)){
            return true;
        }
        return isSubStructure(A.left, B) || isSubStructure(A.right, B);
    }

    private static boolean helper(TreeNode A, TreeNode B) {
        if( B == null){
            return true;
        }
        if(A == null){
            return false;
        }
        if(A.val == B.val){
            return helper(A.left, B.left) && helper(A.right, B.right);
        }else{
            return false;
        }
    }
}
