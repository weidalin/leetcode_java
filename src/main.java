import tools.ListNode;

import static src.leetcode.hotcode.hot2_add_two_numbers.addTwoNumbers.addTwoNumbers_1;
import static tools.Weida_utils.make_list;
import static tools.Weida_utils.print_ListNode;

public class main {
    public  static void main(String[] args) {
        //input ##################################################
        int[] nums = {2, 0, 9,9, 11, 15};


        int[] list_input_1 = {2,4,3};
        int[] list_input_2 = {5,6,4};
        ListNode list_1 = make_list(list_input_1);
        ListNode list_2 = make_list(list_input_2);

        //##################################################
        ListNode res = addTwoNumbers_1(list_1, list_2);

        print_ListNode(res);


    }
}