import tools.ListNode;
import tools.TreeNode;

import static leetcode.swordoffer.offer18_deleteNode.DeleteNode_1.deleteNode;
import static leetcode.swordoffer.offer28_isSymmetric.IsSymmetric_1.isSymmetric;
import static leetcode.swordoffer.offer40_getLeastNumbers.getLeastNumbers_2.getLeastNumbers;
import static leetcode.swordoffer.offer55II_isBalanced.isBalanced_1.isBalanced;
import static leetcode.swordoffer.offer57_findContinuousSequence.FindContinuousSequence_1.findContinuousSequence;
import static leetcode.swordoffer.offer57_twoSum.TwoSum_1.twoSum;
import static leetcode.swordoffer.offer62_lastRemaining.lastRemaining_1.lastRemaining;
import static leetcode.swordoffer.offer65_add.Add_1.add;
import static tools.TreeNode.InitTree;
import static tools.Weida_utils.*;

public class main {
    public  static void main(String[] args) {
        //input #############################################################################################
        int[] nums = {1,2,3,1};

        int k = 1;

        int x = 00000000000000000000000000001011 , y = 4;

        int[] list_input_1 = {2,34,45,5,5231,12,34,21};
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
        int[] res = getLeastNumbers(list_input_1, 6);
//        print_ListNode(res);
        System.out.println(res);
//        print_arr(res)
    }

}