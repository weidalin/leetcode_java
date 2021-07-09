package written_examination.autumn.autumn01_NIO;

import java.util.LinkedList;

public class NIO02_compare {
    /**
     * 原题：计算两个版本的先后
     * https://leetcode-cn.com/problems/compare-version-numbers/
     * 如 1.02, 1
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 比较版本号
     * @param version1 string字符串
     * @param version2 string字符串
     * @return int整型
     */
    public static int compare (String version1, String version2) {
        // write code here
//        LinkedList<Integer> stack_multi1 = new LinkedList<>();
//        LinkedList<Integer> stack_multi2 = new LinkedList<>();
//
        int multi1 = 0, multi2 = 0;
        int i = 0, j = 0;
        while(i < version1.length() && j < version2.length()){
            if(version1.charAt(i) != '.'){
                multi1 = multi1 * 10 + Integer.parseInt(version1.charAt(i) + "");
                i++;
            }
            if(version2.charAt(j) != '.'){
                multi2 = multi2 * 10 +  Integer.parseInt(version2.charAt(j) + "");
                j++;
            }
            if(i == version1.length() && j != version2.length()){
                return -1;
            }else if(j == version2.length() && i != version1.length()){
                return 1;
            }
            if(i < version1.length() && j < version2.length() && version1.charAt(i) == '.' || version2.charAt(j) == '.'){
                if(multi1 > multi2){
                    return 1;
                }else if(multi1 < multi2){
                    return -1;
                }
                multi1 = 0;
                multi2 = 0;
                i++;
                j++;
            }
        }

        if(multi1 > multi2){
            return 1;
        }else if(multi1 < multi2){
            return -1;
        }else{
            return 0;
        }
    }

    public static void main(String[] args) {
        int res = compare("1.02", "1.002");
        System.out.println(res);
    }
}
