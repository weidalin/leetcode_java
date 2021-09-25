package test;

import java.util.Scanner;

/**
 * @author linweida
 * 2021/8/26 8:21 下午
 */

public class Main {
    static int bb;
    public static void main(String[] args) {
        int a= 10;
        bb = a;
        System.out.println(bb);
//        int x = 1, y = 2, z = 3;
//        ;
//        System.out.println(y += (z--) / (++x));
//        System.out.println(args.length);
//        String s1 = "hello";
//        test(s1, s1 + "world");
//

        // 1.
//        final String s1 = new String("hello"); // 字符串常量池 + 堆， s1->堆
//        final String s2 = new String(s1+"world"); // 字符串常量池 + 堆， s2->堆
//        System.out.println(s2.intern() == "helloworld"); // true
//        System.out.println(s2 == "helloworld"); // true

        // 2.
//        final String s1 = "hello";  // s1->字符串常量池
//        final String s2 = new String(s1+"world");  // 字符串常量池 + 堆， s2->堆
//        String s3 = s2.intern();      // s3->常量池
//        System.out.println(s3 == s2);   // false
//        System.out.println(s2.intern() == "helloworld"); // true
//        System.out.println(s2 == "helloworld"); // false

        // 3.
//        String s1 = new String("first");    // 字符串常量池 + 堆, s1->堆
//        String s2 = "first";    // s2->字符串常量池
//        System.out.println(s1 == s2); // false

        // 4.
//        final String s1 = "hello";  // s1->字符串常量池
//        final String s2 = s1+"world"; // s2 -> 常量池
//        String s3 = s2.intern();      // s3->常量池
//        final String s4 = new String("helloworld");
//        System.out.println(s3 == s2);   // true
//        System.out.println(s2.intern() == "helloworld"); // true
//        System.out.println(s2 == "helloworld"); // true
//        System.out.println(s2 == s4); // false
        // 5.
//        String str = "abc" + "def";//很明显，字节码中只有拼接好的abcdef。,常量池中只有
        // 6.
        String str = "abc" + new String("def");
        String s = new String("def");
        new StringBuilder().append("abc").append(s).toString(); // 多出了一个StringBuilder对象，那就应该是5个对象。

        /*
        结论：
        采用new 创建的字符串对象不进入字符串池
        字符串相加的时候，都是静态字符串的结果会添加到字符串池，如果其中含有变量（如f中的e）则不会进入字符串池中
         */
    }

    private static void test(String s1, String s) {
        System.out.println(s1);
        System.out.println(s);
    }

    private static void findMaxSubStr(String str, int len) {
        int i = 0, j = len;
        String tmp = str.substring(i,j);
        String res = tmp;

        while(j < str.length()+1){
            tmp = str.substring(i,j);
            if(tmp.compareTo(res) > 0){
                res = tmp;
            }
            i++;
            j++;
        }
        System.out.println(res);
    }
}
