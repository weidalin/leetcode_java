package leetcode.sort.sort215_findKthLargest;

import tools.ListNode;
import tools.TreeNode;

import static leetcode.sort.sort215_findKthLargest.FindKthLargest_3.findKthLargest;
import static tools.TreeNode.InitTree;
import static tools.Weida_utils.make_list;

public class main {
    public  static void main(String[] args) {
        //input #############################################################################################
        int[] nums = {1,2,3,1};

        int k = 1;

        int x = 1 , y = 4;

        int[] list_input_1 = {3,2,1,5,6,4};
        int[] list_input_2 = {9,15,7,20,3};
        int[][] matrix = {{1,2,3},{4,5,6}};
        int[][] matrix2 = {{1,3,1},{1,5,1},{4,2,1}};

        Integer[] tree_input_1 = {5,3,6,2,4,null,8,1,null,null,null,7,9};
        Integer[] tree_input_2 = {9,15,7,20,3};

        String s = "lili";
        String t = "coco";

        ListNode list_1 = make_list(list_input_1);
        ListNode list_2 = make_list(list_input_2);

        TreeNode treeNode_1 = InitTree(tree_input_1);
        TreeNode treeNode_2 = InitTree(tree_input_2);
        //#############################################################################################
        int res = findKthLargest(list_input_2, 2);
        System.out.print(res);
    }

}