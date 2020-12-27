package src.leetcode.easy;

/**
 * 344. 反转字符串
 * 编写一个函数，其作用是将输入的字符串反转过来。输入字符串以字符数组 char[] 的形式给出。
 *
 * 不要给另外的数组分配额外的空间，你必须原地修改输入数组、使用 O(1) 的额外空间解决这一问题。
 *
 * 你可以假设数组中的所有字符都是 ASCII 码表中的可打印字符。
 *
 *
 *
 * 示例 1：
 *
 * 输入：["h","e","l","l","o"]
 * 输出：["o","l","l","e","h"]
 * 示例 2：
 *
 * 输入：["H","a","n","n","a","h"]
 * 输出：["h","a","n","n","a","H"]
 */
public class easy_344 {
    /**
     * 执行用时：
     * 1 ms
     * , 在所有 Java 提交中击败了
     * 99.98%
     * 的用户
     * 内存消耗：
     * 45.3 MB
     * , 在所有 Java 提交中击败了
     * 87.10%
     * 的用户
     * 炫耀一下:
     * @param s
     */
    public static void reverseString(char[] s) {
        int len = s.length;
        for (int i=0; i<=(len+1)/2 -1; i++){
            if (i == len-i-1)
                continue;
            s[i] = (char) (s[len-i-1] + s[i]);
            s[len-i-1] = (char) (s[i] - s[len-i-1]);
            s[i] = (char) (s[i] - s[len-i-1]);
        }
    }
    public  static void main(String[] args) {
        String str = "hellsss";
        char[] ch = str.toCharArray();
        reverseString(ch);
        System.out.println(ch);
//        ["a","m","a","n","a","P"," ",":","l","a","n","a","c"," "," ","a",",","n","a","l","p"," ","a"," ",",","n","a","m"," ","A"]
//        ["a","m","a","n","a","P"," ",":","l","a","n","a","c"," ","a"," ",",","n","a","l","p"," ","a"," ",",","n","a","m"," ","A"]
    }
}
