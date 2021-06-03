package leetcode.hotcode.hot337_robIII;

import tools.TreeNode;

public class rob_2 {
    /**
     *
     * @param root
     * @return
     */
    public int rob(TreeNode root) {
        /*
        4 个孙子投的钱加上爷爷的钱如下
int method1 = root.val + rob(root.left.left) + rob(root.left.right) + rob(root.right.left) + rob(root.right.right)
两个儿子偷的钱如下
int method2 = rob(root.left) + rob(root.right);
挑选一个钱数多的方案则
int result = Math.max(method1, method2);

作者：reals
链接：https://leetcode-cn.com/problems/house-robber-iii/solution/san-chong-fang-fa-jie-jue-shu-xing-dong-tai-gui-hu/
来源：力扣（LeetCode）
著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
         */
        if(root == null){
            return 0;
        }
        int money = root.val;
        if(root.left != null){
            money += rob(root.left.left) + rob(root.left.right);
        }
        if(root.right != null){
            money += rob(root.right.left) + rob(root.right.right);
        }

        return Math.max(money, rob(root.left) + rob(root.right));
    }
/**
 * 超时
 */
}
