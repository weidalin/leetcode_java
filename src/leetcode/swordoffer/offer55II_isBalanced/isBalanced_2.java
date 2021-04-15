package leetcode.swordoffer.offer55II_isBalanced;

import tools.TreeNode;


/**
 * 剑指 Offer 55 - II. 平衡二叉树
 * 输入一棵二叉树的根节点，判断该树是不是平衡二叉树。如果某二叉树中任意节点的左右子树的深度相差不超过1，那么它就是一棵平衡二叉树。
 *
 *
 *
 * 示例 1:
 *
 * 给定二叉树 [3,9,20,null,null,15,7]
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * 返回 true 。
 *
 * 示例 2:
 *
 * 给定二叉树 [1,2,2,3,3,null,null,4,4]
 *
 *        1
 *       / \
 *      2   2
 *     / \
 *    3   3
 *   / \
 *  4   4
 */
public class isBalanced_2 {
    //自顶向下
    public static boolean isBalanced(TreeNode root) {
        if(root == null){
            return true;
        }
        int left = depth(root.left);
        int right = depth(root.right);
        if(Math.abs(left - right) >= 2){
            return false;
        }
        return true && isBalanced(root.left) && isBalanced(root.right);
    }

    private static int depth(TreeNode root) {
        if(root == null){
            return 0;
        }
        return 1 + Math.max(depth(root.left), depth(root.right));
    }
}
/**
 * 时间复杂度 O(N log N)O(NlogN)： 最差情况下（为 “满二叉树” 时）， isBalanced(root) 遍历树所有节点，判断每个节点的深度 depth(root) 需要遍历 各子树的所有节点 。
 *
 * 空间复杂度 O(N)O(N)： 最差情况下（树退化为链表时），系统递归需要使用 O(N)O(N) 的栈空间。
 *
 * 作者：jyd
 * 链接：https://leetcode-cn.com/problems/ping-heng-er-cha-shu-lcof/solution/mian-shi-ti-55-ii-ping-heng-er-cha-shu-cong-di-zhi/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 执行用时：
 1 ms
 , 在所有 Java 提交中击败了
 100.00%
 的用户
 内存消耗：
 38.6 MB
 , 在所有 Java 提交中击败了
 42.68%
 的用户*/