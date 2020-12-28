import tools.ListNode;
import tools.TreeNode;

import java.util.List;

import static leetcode.labuladong.backtrack.bt46_permute.permute_1.permute;
import static leetcode.labuladong.backtrack.bt51_solveNQueens.solveNQueens.solveNQueens;
import static leetcode.labuladong.dp.dp322_coinChange.coinChange_1.coinChange;
import static tools.TreeNode.InitTree;
import static tools.Weida_utils.*;

public class main {
    public  static void main(String[] args) {
        //input #############################################################################################
        int[] nums = {3,2,6,5,0,3};

        int k = 4;

        int x = 1 , y = 4;

        int[] list_input_1 = {1, 2, 3};
        int[] list_input_2 = {4, 10, 12,};

        Integer[] tree_input_1 = {3,9,20,null,null,15,7};
        Integer[] tree_input_2 = {2,1,3,null,4,null,7};

        String s = "lili";
        String t = "coco";

        ListNode list_1 = make_list(list_input_1);
        ListNode list_2 = make_list(list_input_2);

        TreeNode treeNode_1 = InitTree(tree_input_1);
        TreeNode treeNode_2 = InitTree(tree_input_2);
        //#############################################################################################
        List<List<String>> res = solveNQueens(k);
        System.out.print(res);


    }

}