package written_examination.autumn.autumn14_meituan.meituan03_noac;

import java.util.Scanner;

import static tools.Weida_utils.print_arr;

/**
 * @author linweida
 * 2021/9/5 11:20 上午
 */

public class Main_answer {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=Integer.parseInt(in.nextLine());
        String input=in.nextLine();
        int[] dp=new int[n+1];
        char[] c=input.toCharArray();
        int indexa=0;

//        indexa 为当前下标
        if(c[0]=='a')
            indexa=1;
        // dp[i] = dp[i-1] + i - indexa;
        for(int i=2;i<=n;++i){
            if(c[i-2]=='a' && c[i-1]=='c'){ // i前两个为ac
                dp[i] = dp[i-1] + i - indexa;
                indexa++;
                c[i-1]='a';
                c[i-2]='c';
            }
            else{
                if(c[i-1]=='a' && indexa==0){
                    indexa=i;
                }
                dp[i]=dp[i-1];
            }
            print_arr(c);
            System.out.print("\t");
            print_arr(dp);
            System.out.println("\t" + i + "\t" + indexa);
        }
        System.out.println(dp[n]);
    }
}

/*
c           dp          i   indexa     变化
c a c a 	0 0 1 0 0 	2	2
c c a a 	0 0 1 2 0 	3	3
c c a a 	0 0 1 2 2 	4	3

4
acca

out:
2

 */
