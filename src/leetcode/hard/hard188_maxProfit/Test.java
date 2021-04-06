package leetcode.hard.hard188_maxProfit;
import java.util.*;


public class Test {
    public static void main(String[] args){
        int cheems = get_cheems();
        System.out.print(cheems);
    }
    public static int get_cheems(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //input
        if(n <= 1)
            return n;

        int[] h = new int[n];
        int highest = -1;
        int cheems = 0;
        for(int i = 0; i < n; i++){
            h[i] = sc.nextInt();
            if(highest < h[i]){
                highest = h[i];
                cheems = 1;
            }else if (h[i] == highest){
                cheems += 1;
            }
        }
//
        return cheems;
    }
}
