package leetcode.swordoffer.offer33_verifyPostorder;

/**
 * 剑指 Offer 33. 二叉搜索树的后序遍历序列
 * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历结果。如果是则返回 true，否则返回 false。假设输入的数组的任意两个数字都互不相同。
 *
 *
 *
 * 参考以下这颗二叉搜索树：
 *
 *      5
 *     / \
 *    2   6
 *   / \
 *  1   3
 * 示例 1：
 *
 * 输入: [1,6,3,2,5]
 * 输出: false
 * 示例 2：
 *
 * 输入: [1,3,2,6,5]
 * 输出: true
 */
public class verifyPostorder_2 {
    public boolean verifyPostorder(int[] postorder) {
        return recur(postorder, 0, postorder.length - 1);

    }

    private boolean recur(int[] postorder, int i, int j) {
        if( i >= j){
            return true;
        }
        int p = i;
        while(postorder[p] < postorder[j]){
            p++;
        }
        int m = p;
        while(postorder[p] > postorder[j]){
            p++;
        }
        return p==j && recur(postorder, i, m - 1) && recur(postorder, m, j - 1);
    }
}
/**
 * 时间复杂度 O(N^2)O(N
 * 2
 *  ) ： 每次调用 recur(i,j)recur(i,j) 减去一个根节点，因此递归占用 O(N)O(N) ；最差情况下（即当树退化为链表），每轮递归都需遍历树所有节点，占用 O(N)O(N) 。
 * 空间复杂度 O(N)O(N) ： 最差情况下（即当树退化为链表），递归深度将达到 NN 。
 *
 * 作者：jyd
 * 链接：https://leetcode-cn.com/problems/er-cha-sou-suo-shu-de-hou-xu-bian-li-xu-lie-lcof/solution/mian-shi-ti-33-er-cha-sou-suo-shu-de-hou-xu-bian-6/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
