package leetcode.swordoffer.offer25_mergeTwoLists;

import tools.ListNode;

public class MergeTwoLists_1 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode res = new ListNode();
        ListNode res_head = res;

        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                res.next = l1;
                l1 = l1.next;
            }else{
                res.next = l2;
                l2 = l2.next;
            }
            res = res.next;
        }
        if(l1 != null)
            res.next = l1;
        else if(l2 != null){
            res.next = l2;
        }
        return res_head.next;
    }
}
