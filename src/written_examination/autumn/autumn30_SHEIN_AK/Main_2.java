package written_examination.autumn.autumn30_SHEIN_AK;
import java.util.Scanner;

/**
 * @author linweida
 * 2021/9/22 11:10 上午
 */


public class Main_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        int[] res = new int[n-1];
        int idx = 0;
        for(int i = 0; i < m - 1; i++){
//            System.out.print(nums[i] + " ");
            res[idx++] = nums[i];
        }
        for(int i = m; i < nums.length; i++){
//            System.out.print(nums[i] + " ");
            res[idx++] = nums[i];
        }
        for(int i = 0; i < n - 2 ; i++){
            System.out.print(res[i] + " ");
        }
        System.out.print(res[n-2]);
//        ListNode list = make_list(nums);
//        ListNode fast = list;
//        if(m == 1){
//            print_ListNode(list.next);
//        }else {
//            while (--m > 1) {
//                fast = fast.next;
//            }
//            fast.next = fast.next.next;
//            print_ListNode(list);
//        }
    }

    public static void print_ListNode(ListNode list){
        while (list != null){
            System.out.print(list.val);
            System.out.print(" ");
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
