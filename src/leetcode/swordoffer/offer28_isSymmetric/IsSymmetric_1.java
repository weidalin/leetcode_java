package leetcode.swordoffer.offer28_isSymmetric;

import tools.TreeNode;

/**
 * 剑指 Offer 28. 对称的二叉树
 * 请实现一个函数，用来判断一棵二叉树是不是对称的。如果一棵二叉树和它的镜像一样，那么它是对称的。
 *
 * 例如，二叉树 [1,2,2,3,4,4,3] 是对称的。
 *
 *     1
 *    / \
 *   2   2
 *  / \ / \
 * 3  4 4  3
 * 但是下面这个 [1,2,2,null,3,null,3] 则不是镜像对称的:
 *
 *     1
 *    / \
 *   2   2
 *    \   \
 *    3    3
 *
 *
 *
 * 示例 1：
 *
 * 输入：root = [1,2,2,3,4,4,3]
 * 输出：true
 * 示例 2：
 *
 * 输入：root = [1,2,2,null,3,null,3]
 * 输出：false
 */
public class IsSymmetric_1 {
    public static boolean isSymmetric(TreeNode root) {
        if(root == null){
            return true;
        }
        return isSymmetric_help(root.left, root.right);
    }

    private static boolean isSymmetric_help(TreeNode left, TreeNode right) {
        if (left == null && right == null){
            return true;
        }else if (left == null || right == null){
            return false;
        }else if(left.val != right.val){
            return false;
        }
        return isSymmetric_help(left.left, right.right) && isSymmetric_help(left.right, right.left);
    }
}
/**
 * 时间复杂度 O(N)O(N) ： 其中 NN 为二叉树的节点数量，每次执行 recur() 可以判断一对节点是否对称，因此最多调用 N/2N/2 次 recur() 方法。
 * 空间复杂度 O(N)O(N) ： 最差情况下（见下图），二叉树退化为链表，系统使用 O(N)O(N) 大小的栈空间。
 *
 * 作者：jyd
 * 链接：https://leetcode-cn.com/problems/dui-cheng-de-er-cha-shu-lcof/solution/mian-shi-ti-28-dui-cheng-de-er-cha-shu-di-gui-qing/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 *
 * 执行用时：
 * 0 ms
 * , 在所有 Java 提交中击败了
 * 100.00%
 * 的用户
 * 内存消耗：
 * 36.3 MB
 * , 在所有 Java 提交中击败了
 * 86.42%
 * 的用户
 */
