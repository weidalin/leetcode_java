package written_examination.autumn.autumn12_mi.mi01_mergearray;

import java.util.Scanner;

/**
 * @author linweida
 * 2021/9/1 6:51 下午
 */
// 100%
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] mn = line.split(",");
        int m = Integer.parseInt(mn[0].split("=")[1]);
        int n = Integer.parseInt(mn[1].split("=")[1]);
        int[] A = new int[m + n];
        int[] B = new int[n];
        String ALine = sc.nextLine();
        String[] AStr = ALine.split(",");
        String BLine = sc.nextLine();
        String[] BStr = BLine.split(",");
        int idx = 0;
        for(int i = 0, j = 0; i < AStr.length || j < BStr.length; ){
            int AInt = Integer.MAX_VALUE;
            int BInt = Integer.MAX_VALUE;
            if(i < AStr.length)
                AInt  = Integer.parseInt(AStr[i]);
            if(j < BStr.length)
               BInt= Integer.parseInt(BStr[j]);

            if(AInt < BInt){
                i++;
                A[idx++] = AInt;
            }else{
                j++;
                A[idx++] = BInt;
            }
        }
        for(int i = 0; i < A.length; i++){
            System.out.print(A[i] + " ");
        }
    }
    /*
m=2,n=2
1,3
2,4
     */
}
