package src.leetcode.easy;

/**
 * 405. 数字转换为十六进制数
 * 给定一个整数，编写一个算法将这个数转换为十六进制数。对于负整数，我们通常使用 补码运算 方法。
 *
 * 注意:
 *
 * 十六进制中所有字母(a-f)都必须是小写。
 * 十六进制字符串中不能包含多余的前导零。如果要转化的数为0，那么以单个字符'0'来表示；对于其他情况，十六进制字符串中的第一个字符将不会是0字符。
 * 给定的数确保在32位有符号整数范围内。
 * 不能使用任何由库提供的将数字直接转换或格式化为十六进制的方法。
 */
public class easy_405_convert_a_number_to_hexadecimal {
    public static String toHex(int num) {
        if (num==0)
            return "0";
        char[] ch = "0123456789abcdef".toCharArray();
        StringBuilder res = new StringBuilder();
        while(num != 0) {
            int idx = num & 0xf;
//            System.out.println(num+"-"+idx);
            res.append(ch[idx]);
            /**
             * <<      :     左移运算符，num << 1,相当于num乘以2
             *
             * >>      :     右移运算符，num >> 1,相当于num除以2
             *
             * >>>    :     无符号右移，忽略符号位，空位都以0补齐
             */
            num >>>= 4;


        }
        return res.reverse().toString();

    }
    public static void main(String[] args) {
        System.out.print(toHex(-1));//
    }
}
