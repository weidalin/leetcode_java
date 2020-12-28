package leetcode.easy.easy205_isisomorphic;

import tools.ListNode;

import static leetcode.easy.easy205_isisomorphic.isIsomorphic_1.isIsomorphic;
import static tools.Weida_utils.make_list;

public class main {
    public  static void main(String[] args) {
        //input #############################################################################################
        int[] nums = {2, 0, 9,9, 11, 15};

        int[] list_input_1 = {2,4,3};
        int[] list_input_2 = {5,6,4};

        String s = "lili";
        String t = "coco";

        ListNode list_1 = make_list(list_input_1);
        ListNode list_2 = make_list(list_input_2);
        //#############################################################################################
        boolean res = isIsomorphic(s, t);
        System.out.print(res);



    }
}