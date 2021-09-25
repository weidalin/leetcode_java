package written_examination.autumn.autumn29_wangyi.wangyi03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

/**
 * @author linweida
 * 2021/9/18 7:46 下午
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        int n = 17;
        int res = Integer.bitCount(n);
        String str = Integer.toString(n, 2);
        int maxLen = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '1'){
                maxLen++;
            }else{
                map.put(i, maxLen);
                maxLen = 0;
            }
        }
        for(Integer key : map.keySet()){
            int count = map.get(key);
            if(count > 2){
                res = res - count + 2;
            }
        }
        System.out.println(res);
    }
}
