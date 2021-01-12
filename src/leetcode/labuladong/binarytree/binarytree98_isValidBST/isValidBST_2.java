package leetcode.labuladong.binarytree.binarytree98_isValidBST;

import tools.TreeNode;

public class isValidBST_2 {
//    public boolean isValidBST(TreeNode root) {
//        if(root == null)    return true;
//        //1.找到左边最大的
//        int max_in_left = find_min(root.left);
//        //2.找到右边最小的
//        int min_in_right = find_max(root.right);
//        if (root.val >= max_in_left && root.val < min_in_right)
//            return isValidBST(root.left) && isValidBST(root.right);
//        else
//            return false;
//    }
//
//    private int find_min(TreeNode root) {
//        int min = Integer.MAX_VALUE;
//        if(root != null){
//            min = root.val > min ? min : root.val;
//            min = find_min((root.left))
//        }

//    }
}
