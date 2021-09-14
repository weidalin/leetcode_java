package written_examination.autumn.autumn23_shenxinfu_AK.shenxinfu02_reverseWords;

import static tools.Weida_utils.print_arr;

/**
 * @author linweida
 * 2021/9/14 7:53 下午
 */
// ac
public class Main {
    public static String reverseWords (String s, int i) {
        // write code here
        s = s.trim().replaceAll("\\s+", " ");
        String[] strs = s.split(" ");
        int n = s.split(" ").length;
        if(i == 0){
            return reverse(strs, 0, n-1);
        }
        if(i >= n){
            return reverse(strs, 0, n-1);
        }
        else{
            return reverse(strs, 0, i-1) + " " + reverse(strs, i, n-1);
        }
    }
    public static String reverse(String[] strs, int left, int right){
        StringBuilder sb = new StringBuilder();
        while(right >= left){
            sb.append(strs[right--] + " ");
        }
        String res = sb.toString();
        res = res.substring(0, res.length()-1);
        return res;
    }

    public static void main(String[] args) {
        String res = reverseWords("I am  a student.", 4);
//        String res = reverseWords("I", 2);
        System.out.println(res);
    }
}
/*

"I am a student.",2

"am I student. a"



 */
