package leetcode.labuladong.binarytree.binarytree938_rangeSumBST;

import tools.ListNode;
import tools.TreeNode;

import static leetcode.labuladong.binarytree.binarytree938_rangeSumBST.rangeSumBST_1.rangeSumBST;
import static tools.TreeNode.InitTree;
import static tools.Weida_utils.make_list;

public class main {
    public  static void main(String[] args) {
        //input #############################################################################################
        int[] nums = {3,2,6,5,0,3};

        int k = 1;

        int x = 1 , y = 4;

        int[] list_input_1 = {1,2,3,4,5};
        int[] list_input_2 = {9,15,7,20,3};

        Integer[] tree_input_1 = {10,5,15,3,7,null,18};
        Integer[] tree_input_2 = {9,15,7,20,3};

        String s = "lili";
        String t = "coco";

        ListNode list_1 = make_list(list_input_1);
        ListNode list_2 = make_list(list_input_2);

        TreeNode treeNode_1 = InitTree(tree_input_1);
        TreeNode treeNode_2 = InitTree(tree_input_2);
        //#############################################################################################

        int res = rangeSumBST(treeNode_1, 7, 15);
        System.out.println(res);
    }

}