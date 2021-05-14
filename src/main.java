import tools.ListNode;
import tools.TreeNode;

import java.util.List;

import static leetcode.dfs.bt46_permute.permute_1.permute;
import static leetcode.dfs.leetcode39_combinationSum.combinationSum_1.combinationSum;
import static leetcode.dfs.offer38_permutation.permutation_4.permutation;
import static leetcode.hotcode.hot94_inorderTraversal.inorderTraversal_1.inorderTraversal;
import static leetcode.swordoffer.offer10II_numWays.NumWays_1.numWays;
import static leetcode.swordoffer.offer13_movingCount.movingCount_1.movingCount;
import static leetcode.swordoffer.offer14I_cuttingRope.cuttingRope_1.cuttingRope;
import static leetcode.swordoffer.offer31_validateStackSequences.validateStackSequences_1.validateStackSequences;
import static leetcode.swordoffer.offer32III_levelOrder.levelOrder_1.levelOrder;
import static leetcode.swordoffer.offer34_pathSum.pathSum_1.pathSum;
import static leetcode.swordoffer.offer45_minNumber.minNumber_2.minNumber;
import static leetcode.swordoffer.offer46_translateNum.translateNum_1.translateNum;
import static leetcode.swordoffer.offer47_maxValue.maxValue_1.maxValue;
import static leetcode.swordoffer.offer48_lengthOfLongestSubstring.lengthOfLongestSubstring_1.lengthOfLongestSubstring;
import static leetcode.swordoffer.offer49_nthUglyNumber.nthUglyNumber_1.nthUglyNumber;
import static leetcode.swordoffer.offer56II_singleNumber.SingleNumber_1.singleNumber;
import static leetcode.swordoffer.offer56I_singleNumbers.singleNumbers_1.singleNumbers;
import static leetcode.swordoffer.offer58I_reverseWords.ReverseWords_1.reverseWords;
import static leetcode.swordoffer.offer60_dicesProbability.dicesProbability_1.dicesProbability;
import static leetcode.swordoffer.offer63_maxProfit.maxProfit_1.maxProfit;
import static leetcode.swordoffer.offer64_constructArr.constructArr_1.constructArr;
import static leetcode.swordoffer.offer64_sumNums.SumNums_1.sumNums;
import static tools.TreeNode.InitTree;
import static tools.Weida_utils.*;
import static written_examination.tx.tx1_xuanzhuanlistnode.Main_ac.solve;

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

        Integer[] tree_input_1 = {3,9,20,null,null,15,7};
        Integer[] tree_input_2 = {5,4,8,11,null,13,4,7,2,null,null,5,1};

        String s = "  hello world!  ";
        String t = "a good   example";

        ListNode list_1 = make_list(list_input_1);
        ListNode list_2 = make_list(list_input_2);

        TreeNode treeNode_1 = InitTree(tree_input_1);
        TreeNode treeNode_2 = InitTree(tree_input_2);
        //#############################################################################################
        List<Integer> res = inorderTraversal(treeNode_1);
//        print_ListNode(res);
        System.out.println(res);
//        print_arr(res);
    }

}



