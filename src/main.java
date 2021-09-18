import tools.ListNode;
import tools.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static leetcode.hotcode.hot5_longestPalindrome.longestPalindrome_1.longestPalindrome;
import static tools.TreeNode.InitTree;
import static tools.Weida_utils.make_list;

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

        Integer[] tree_input_1 = {4,1,6,0,2,5,7,null,null,null,3,null,null,null,8};
        Integer[] tree_input_2 = {5,4,8,11,null,13,4,7,2,null,null,5,1};

        String s = "babad";
        String t = "a good   example";

        ListNode list_1 = make_list(list_input_1);
        ListNode list_2 = make_list(list_input_2);

        TreeNode treeNode_1 = InitTree(tree_input_1);
        TreeNode treeNode_2 = InitTree(tree_input_2);


        // 1. List 和ArrayList互转
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        Integer[] IntegerArr = list.toArray(new Integer[list.size()]);
        List<Integer> list2 = Arrays.asList(IntegerArr);

        // 2. List 和ArrayList互转
        int[] intArr = list.stream().mapToInt(Integer::intValue).toArray();

        // 3. int[] 和Integer[]互换
        int[] intArr2 = Arrays.stream(IntegerArr).mapToInt(Integer::valueOf).toArray();
        Integer[] IntegerArr2 = Arrays.stream(intArr2).boxed().toArray(Integer[]::new);

        //#############################################################################################
//        Integer kk = Integer.valueOf(123);
        String res = longestPalindrome(s);
//        print_ListNode(res);
//        System.out.println(Integer.valueOf('1'+""));
        System.out.println(res);
//        print_arr(res);
//        print_tree(res);fun
        fun(500);
    }

    private static int fun(int x) {
        int c = 0;
        while(x != 0){
            c++;
            x=x&(x-1);

        }
        return c;
    }


}



