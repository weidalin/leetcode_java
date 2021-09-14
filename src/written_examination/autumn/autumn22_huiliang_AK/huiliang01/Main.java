package written_examination.autumn.autumn22_huiliang_AK.huiliang01;

import java.util.Scanner;

/**
 * @author linweida
 * 2021/9/12 8:32 下午
 */
// AC
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strs = str.split(", ");

        int n = strs.length;
        int[] nums = new int[n];
        int j = 0;
        for(int i = 0; i < n; i++){
            if(strs[i].equals("0")){
                continue;
            }else{
                nums[j++] = Integer.parseInt(strs[i]);
            }
        }
        System.out.print("[");
        for(int i = 0; i < n; i++){
            System.out.print(nums[i] + ", ");
        }
        System.out.println("\b\b]");
    }
}
/*'
1, 0, 2, 4, 0, 5
 */