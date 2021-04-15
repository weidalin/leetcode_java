package leetcode.hotcode.hot121_best_time_to_buy_and_sell_stock;

import tools.ListNode;
import tools.TreeNode;

import static leetcode.hotcode.hot121_best_time_to_buy_and_sell_stock.MaxProfit_1.maxProfit_1;
import static tools.TreeNode.InitTree;
import static tools.Weida_utils.make_list;

public class main {
    public  static void main(String[] args) {
        //input #############################################################################################
        int[] nums = {3,2,6,5,0,3};

        int k = 1;

        int x = 1 , y = 4;

        int[] list_input_1 = {1,2,3,4,5};
        int[] list_input_2 = {7,1,5,3,6,4};
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};

        Integer[] tree_input_1 = {5,3,6,2,4,null,8,1,null,null,null,7,9};
        Integer[] tree_input_2 = {9,15,7,20,3};

        String s = "lili";
        String t = "coco";

        ListNode list_1 = make_list(list_input_1);
        ListNode list_2 = make_list(list_input_2);

        TreeNode treeNode_1 = InitTree(tree_input_1);
        TreeNode treeNode_2 = InitTree(tree_input_2);
        //#############################################################################################
        int res = maxProfit_1(list_input_2);
        System.out.print(res);
    }

}