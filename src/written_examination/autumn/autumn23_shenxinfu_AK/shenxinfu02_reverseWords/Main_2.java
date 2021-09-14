package written_examination.autumn.autumn23_shenxinfu_AK.shenxinfu02_reverseWords;

/**
 * @author linweida
 * 2021/9/14 7:53 下午
 */
// ac
public class Main_2 {
    public static String reverseWords (String s, int i) {
        // write code here
        String[] strs = s.split(" ");
        int n = s.split(" ").length;
        if(n < i){
            return s;
        }
        StringBuilder sb = new StringBuilder();
        int left = i-1;
        int right = n-1;
        while(left >= 0){
            sb.append(strs[left--] + " ");
        }
        while(right >= i){
            sb.append(strs[right--] + " ");
        }
        String res = sb.toString();
        res = res.substring(0, res.length()-1);
        return res;
    }
//    public String reverse(String , int left, int right){
//
//    }

    public static void main(String[] args) {
//        String res = reverseWords("I am a student.", 2);
        String res = reverseWords("I", 2);
        System.out.println(res);
    }
}
/*

"I am a student.",2

"am I student. a"



 */
