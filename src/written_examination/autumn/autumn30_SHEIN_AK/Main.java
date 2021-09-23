package written_examination.autumn.autumn30_SHEIN_AK;
import java.util.Scanner;

/**
 * @author linweida
 * 2021/9/22 11:10 上午
 */
 class ListNode {
    public int val;
    public ListNode next;
    public ListNode() {}
    public ListNode(int val) { this.val = val; }

}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        ListNode list = make_list(nums);
        ListNode fast = list;

        if(m <= 1){
            print_ListNode(list.next);
        }else {
            while (--m > 1) {
                fast = fast.next;
            }
            fast.next = fast.next.next;
            print_ListNode(list);
        }
    }

    public static void print_ListNode(ListNode list){
        while (list != null){
            System.out.print(list.val);
            if(list.next != null) {
                System.out.print(" ");
            }
            list = list.next;
        }
    }

    public static ListNode make_list(int[] arrs){
        ListNode pre = new ListNode(0);
        ListNode cur = pre;

        for (Integer arr: arrs){
            cur.next = new ListNode(arr);
            cur = cur.next;
        }
        return pre.next;
    }
}
/*
5 3
1 2 3 4 5
 */
