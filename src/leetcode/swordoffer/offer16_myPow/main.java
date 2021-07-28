package leetcode.swordoffer.offer16_myPow;

import tools.ListNode;
import tools.TreeNode;

import static leetcode.hotcode.hot5_longestPalindrome.longestPalindrome_1.longestPalindrome;
import static leetcode.swordoffer.offer16_myPow.myPow_1.myPow;
import static tools.TreeNode.InitTree;
import static tools.Weida_utils.make_list;

public class main {
    public  static void main(String[] args) {
        //input #############################################################################################
        int[] nums = {1,2,3,1};

        int k = 1;

        double  x = 1.00000;
        int n = -2147483648;

        int[] list_input_1 = {999999998,999999997,999999999};
        int[] list_input_2 = {1,1,1,1,2,2,2,2};
        //int[] list_input_1 = {1, 0, 2};
        //        int[] list_input_2 = {2, 1, 0};
        int[][] matrix = {  {1,3,1},
                            {1,5,1},
                            {4,2,1}};
        int[][] matrix2 = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] matrix3 = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};

        Integer[] tree_input_1 = {4,1,6,0,2,5,7,null,null,null,3,null,null,null,8};
        Integer[] tree_input_2 = {5,4,8,11,null,13,4,7,2,null,null,5,1};

        String s = "babad";
        String t = "a good   example";

        ListNode list_1 = make_list(list_input_1);
        ListNode list_2 = make_list(list_input_2);

        TreeNode treeNode_1 = InitTree(tree_input_1);
        TreeNode treeNode_2 = InitTree(tree_input_2);
        //#############################################################################################
//        Integer kk = Integer.valueOf(123);
        double res = myPow(x, n);
//        print_ListNode(res);
//        System.out.println(Integer.valueOf('1'+""));
        System.out.println(res);
//        print_arr(res);
//        print_tree(res);
    }

}



