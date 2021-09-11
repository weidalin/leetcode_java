package written_examination.autumn.autumn19_xishanju.xishanju01_;

/**
 * @author linweida
 * 2021/9/11 9:47 下午
 */

import java.util.*;
public class Main{
    public static void main(String[] args){
        int[][] nums = new int[3][2];
        int[][] nums2 = new int[2][4];
        int[][] res = new int[3][4];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 2; j++){
                nums[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 4; j++){
                nums2[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 4; j++){
                for(int k = 0; k < 2; k++){
                    res[i][j] += nums[i][k] * nums2[k][j];
                }
            }
        }
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 4; j++){
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
}
/*
1 2 3 4 5 6 7 8 9 10 11 12 13 14
 */