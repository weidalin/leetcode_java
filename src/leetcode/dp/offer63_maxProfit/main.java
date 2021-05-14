package leetcode.dp.offer63_maxProfit;

import tools.ListNode;
import tools.TreeNode;

import static leetcode.swordoffer.offer63_maxProfit.maxProfit_1.maxProfit;
import static tools.TreeNode.InitTree;
import static tools.Weida_utils.make_list;

public class main {
    public  static void main(String[] args) {
        //input #############################################################################################
        int[] nums = {1,2,3,1};

        int k = 1;

        int x = 00000000000000000000000000001011 , y = 4;

        int[] list_input_1 = {7,6,4,3,1};
        int[] list_input_2 = {0,2,3,4,5};
        int[][] matrix = {  {1,3,1},
                            {1,5,1},
                            {4,2,1}};
        int[][] matrix2 = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] matrix3 = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};

        Integer[] tree_input_1 = {3,9,20,null,null,15,7};
        Integer[] tree_input_2 = {1,2,2,3,3,null,null,4,4};

        String s = "  hello world!  ";
        String t = "a good   example";

        ListNode list_1 = make_list(list_input_1);
        ListNode list_2 = make_list(list_input_2);

        TreeNode treeNode_1 = InitTree(tree_input_1);
        TreeNode treeNode_2 = InitTree(tree_input_2);
        //#############################################################################################
        int res = maxProfit(list_input_1);
//        print_ListNode(res);
        System.out.println(res);
//        print_arr(res);
    }

}
/**
 * 执行用时：
 * 2 ms
 * , 在所有 Java 提交中击败了
 * 99.12%
 * 的用户
 * 内存消耗：
 * 37.3 MB
 * , 在所有 Java 提交中击败了
 * 93.91%
 * 的用户
 */


