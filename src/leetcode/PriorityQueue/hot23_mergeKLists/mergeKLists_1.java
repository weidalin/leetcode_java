package leetcode.PriorityQueue.hot23_mergeKLists;

import tools.ListNode;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * 23. 合并K个升序链表
 * 给你一个链表数组，每个链表都已经按升序排列。
 *
 * 请你将所有链表合并到一个升序链表中，返回合并后的链表。
 * 示例 1：
 *
 * 输入：lists = [[1,4,5],[1,3,4],[2,6]]
 * 输出：[1,1,2,3,4,4,5,6]
 * 解释：链表数组如下：
 * [
 *   1->4->5,
 *   1->3->4,
 *   2->6
 * ]
 * 将它们合并到一个有序链表中得到。
 * 1->1->2->3->4->4->5->6
 */
public class mergeKLists_1 {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null || lists.length == 0)  return null;
//        PriorityQueue<ListNode> queue = new PriorityQueue<>(lists.length,
//                new Comparator<ListNode>() {
//                    @Override
//                    public int compare(ListNode o1, ListNode o2) {
//                        if(o1.val < o2.val) return -1;
//                        else if(o1.val == o2.val)   return 0;
//                        else    return 1;
//                    }
//                });

        PriorityQueue<ListNode> queue = new PriorityQueue<>(lists.length, (x, y) -> (x.val-y.val));
        ListNode dummy = new ListNode(0);
        ListNode p = dummy;
        for(ListNode node : lists){
            if(node != null)    queue.add(node);
        }
        while(!queue.isEmpty()){
            p.next = queue.poll();
            p = p.next;
            if(p.next != null)  queue.add(p.next);
        }
        return dummy.next;
    }

    public static void main(String[] args) {

    }


}
