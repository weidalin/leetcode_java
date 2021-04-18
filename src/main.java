import tools.ListNode;
import tools.TreeNode;

import static leetcode.swordoffer.offer10II_numWays.NumWays_1.numWays;
import static leetcode.swordoffer.offer58I_reverseWords.ReverseWords_1.reverseWords;
import static leetcode.swordoffer.offer64_sumNums.SumNums_1.sumNums;
import static tools.TreeNode.InitTree;
import static tools.Weida_utils.*;

public class main {
    public  static void main(String[] args) {
        //input #############################################################################################
        int[] nums = {1,2,3,1};

        int k = 1;

        int x = 00000000000000000000000000001011 , y = 4;

        int[] list_input_1 = {2,34,45,5,5231,12,34,21};
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
        int res = sumNums(9);
//        print_ListNode(res);
        System.out.println(res);
//        print_arr(res);
    }

}


