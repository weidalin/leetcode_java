package leetcode.hotcode.hot206_reverseList;

import tools.ListNode;
import tools.TreeNode;

import static leetcode.hotcode.hot206_reverseList.reverseList_2.reverseList;
import static tools.TreeNode.InitTree;
import static tools.Weida_utils.make_list;
import static tools.Weida_utils.print_ListNode;

public class main {
    public  static void main(String[] args) {
        //input #############################################################################################
        int[] nums = {3,2,6,5,0,3};

        int k = 2;

        int[] list_input_1 = {1,2,3,4,5};
        int[] list_input_2 = {5,6,4};

        Integer[] tree_input_1 = {3,9,20,null,null,15,7};
        Integer[] tree_input_2 = {2,1,3,null,4,null,7};

        String s = "lili";
        String t = "coco";

        ListNode list_1 = make_list(list_input_1);
        ListNode list_2 = make_list(list_input_2);

        TreeNode treeNode_1 = InitTree(tree_input_1);
        TreeNode treeNode_2 = InitTree(tree_input_2);
        //#############################################################################################
        ListNode res = reverseList(list_1);

        print_ListNode(res);



    }
}