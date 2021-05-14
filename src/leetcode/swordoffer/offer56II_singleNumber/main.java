package leetcode.swordoffer.offer56II_singleNumber;

import tools.ListNode;
import tools.TreeNode;

import static leetcode.swordoffer.offer56II_singleNumber.SingleNumber_1.singleNumber;
import static tools.TreeNode.InitTree;
import static tools.Weida_utils.make_list;

public class main {
    public  static void main(String[] args) {
        //input #############################################################################################
        int[] nums = {1,2,3,1};

        int k = 1;

        int x = 00000000000000000000000000001011 , y = 4;

        int[] list_input_1 = {3,4,3,3};
        int[] list_input_2 = {0,2,3,4,5};
        int[][] matrix = {{1,2,3},{4,5,6}};
        int[][] matrix2 = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] matrix3 = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};

        Integer[] tree_input_1 = {1, 2, 3};
        Integer[] tree_input_2 = {1,2,2,3,3,null,null,4,4};

        String s = "  hello world!  ";
        String t = "a good   example";

        ListNode list_1 = make_list(list_input_1);
        ListNode list_2 = make_list(list_input_2);

        TreeNode treeNode_1 = InitTree(tree_input_1);
        TreeNode treeNode_2 = InitTree(tree_input_2);
        //#############################################################################################
        int res = singleNumber(list_input_1);
//        print_ListNode(res);
        System.out.println(res);
//        print_arr(res);
    }

}


