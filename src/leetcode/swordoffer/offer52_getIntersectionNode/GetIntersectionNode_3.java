package leetcode.swordoffer.offer52_getIntersectionNode;

import tools.ListNode;

import java.util.HashSet;

/**
 * 剑指 Offer 52. 两个链表的第一个公共节点
 * 输入两个链表，找出它们的第一个公共节点。
 *
 * 如下面的两个链表：
 *
 *
 *
 * 在节点 c1 开始相交。
 *
 *
 *
 * 示例 1：
 *
 *
 *
 * 输入：intersectVal = 8, listA = [4,1,8,4,5], listB = [5,0,1,8,4,5], skipA = 2, skipB = 3
 * 输出：Reference of the node with value = 8
 * 输入解释：相交节点的值为 8 （注意，如果两个列表相交则不能为 0）。从各自的表头开始算起，链表 A 为 [4,1,8,4,5]，链表 B 为 [5,0,1,8,4,5]。在 A 中，相交节点前有 2 个节点；在 B 中，相交节点前有 3 个节点。
 *
 */
public class GetIntersectionNode_3 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode> set = new HashSet<>();
        while(headA != null){
            set.add(headA);
            headA = headA.next;
        }
        while(headB != null){
            if(set.contains(headB)){
                return headB;
            }else{
                headB = headB.next;
            }
        }
        return null;
    }
}
/**
 * 执行用时：
 * 8 ms
 * , 在所有 Java 提交中击败了
 * 13.71%
 * 的用户
 * 内存消耗：
 * 42.5 MB
 * , 在所有 Java 提交中击败了
 * 5.04%
 * 的用户
 * 炫耀一下:
 */
