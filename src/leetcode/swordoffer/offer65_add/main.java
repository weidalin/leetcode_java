package leetcode.swordoffer.offer65_add;

import tools.ListNode;
import tools.TreeNode;

import static leetcode.swordoffer.offer65_add.Add_1.add;
import static tools.TreeNode.InitTree;
import static tools.Weida_utils.make_list;

public class main {
    public  static void main(String[] args) {
        //input #############################################################################################
        int[] nums = {1,2,3,1};

        int k = 1;

        int x = 00000000000000000000000000001011 , y = 4;

        int[] list_input_1 = {4,5,1,9};
        int[] list_input_2 = {14,15,16,22,53,60};
        int[][] matrix = {{1,2,3},{4,5,6}};
        int[][] matrix2 = {{1,3,1},{1,5,1},{4,2,1}};

        Integer[] tree_input_1 = {1, 2, 3};
        Integer[] tree_input_2 = {1,2,2,3,3,null,null,4,4};

        String s = "abcdefg";
        String t = "coco";

        ListNode list_1 = make_list(list_input_1);
        ListNode list_2 = make_list(list_input_2);

        TreeNode treeNode_1 = InitTree(tree_input_1);
        TreeNode treeNode_2 = InitTree(tree_input_2);
        //#############################################################################################
        int res = add(1, 3);
//        print_ListNode(res);
        System.out.println(res);
//        print_arr(res)
    }

}