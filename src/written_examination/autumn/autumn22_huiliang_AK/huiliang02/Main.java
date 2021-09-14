package written_examination.autumn.autumn22_huiliang_AK.huiliang02;

import java.util.Scanner;

/**
 * @author linweida
 * 2021/9/12 8:43 下午
 */
// AC
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strs = str.split(", ");

        int n = strs.length;
        int[] height = new int[n];
        for(int i = 0; i < n; i++){
            height[i] = Integer.parseInt(strs[i]);
        }

        int i = 0, j = height.length-1, res = 0;
        while(i < j){
            res = height[i] < height[j] ?
                    Math.max(res, (j - i) * height[i++]) :
                    Math.max(res, (j - i) * height[j--]);
        }
        System.out.println(res);
    }
}
/*

1, 1
 */
