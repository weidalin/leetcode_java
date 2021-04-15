package leetcode.hotcode.hot617_mergeTrees;

import tools.ListNode;
import tools.TreeNode;

import java.util.List;

import static leetcode.hotcode.hot448_findDisappearedNumbers.findDisappearedNumbers_1.findDisappearedNumbers;
import static tools.TreeNode.InitTree;
import static tools.Weida_utils.make_list;

public class main {
    public  static void main(String[] args) {
        //input #############################################################################################
        int[] nums = {3,2,6,5,0,3};

        int k = 2;

        int[] list_input_1 = {2,4,3};
        int[] list_input_2 = {5,6,4};

        Integer[] tree_input_1 = {1,3,2,5};
        Integer[] tree_input_2 = {2,1,3,null,4,null,7};

        String s = "lili";
        String t = "coco";

        ListNode list_1 = make_list(list_input_1);
        ListNode list_2 = make_list(list_input_2);

        TreeNode treeNode_1 = InitTree(tree_input_1);
        TreeNode treeNode_2 = InitTree(tree_input_2);
        //#############################################################################################

        List<Integer> res = findDisappearedNumbers(list_input_1);




    }
}