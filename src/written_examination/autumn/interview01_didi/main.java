package written_examination.autumn.interview01_didi;

import tools.ListNode;
import tools.TreeNode;

import static leetcode.hotcode.hot5_longestPalindrome.longestPalindrome_1.longestPalindrome;
import static tools.TreeNode.InitTree;
import static tools.Weida_utils.make_list;
import static written_examination.autumn.interview01_didi.didi01_snaketraverse.snaketraverse;

public class main {
    public  static void main(String[] args) {
        //input #############################################################################################
        int[] nums = {1,2,3,1};

        int k = 1;

        int x = 00000000000000000000000000001011 , y = 4;

        int[] list_input_1 = {999999998,999999997,999999999};
        int[] list_input_2 = {1,1,1,1,2,2,2,2};
        //int[] list_input_1 = {1, 0, 2};
        //        int[] list_input_2 = {2, 1, 0};
        int[][] matrix = {  {1,3,1},
                            {1,5,1},
                            {4,2,1}};
        int[][] matrix2 = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] matrix3 = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};

        Integer[] tree_input_1 = {1,2,3,4,5,6,7};
        Integer[] tree_input_2 = {5,4,8,11,null,13,4,7,2,null,null,5,1};

        String s = "babad";
        String t = "a good   example";

        ListNode list_1 = make_list(list_input_1);
        ListNode list_2 = make_list(list_input_2);

        TreeNode treeNode_1 = InitTree(tree_input_1);
        TreeNode treeNode_2 = InitTree(tree_input_2);
        //#############################################################################################
       snaketraverse(treeNode_1);
//        print_ListNode(res);
//        System.out.println(res);
//        print_arr(res);
//        print_tree(res);
    }

}



