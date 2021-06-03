package leetcode.hotcode.hot160_getIntersectionNode;

import tools.ListNode;

public class getIntersectionNode_1 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null){
            return null;
        }
        while(headA != headB){
            headA = headA == null ? headB : headA.next;
            headB = headB == null ? headA : headB.next;
        }
        return headA;


    }
}
