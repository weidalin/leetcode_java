package written_examination.autumn.autumn01_NIO;

public class NIO02_compare_2 {
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
        int multi1 = 0, multi2 = 0;
        int i = 0, j = 0;
        while(i < version1.length() || j < version2.length()){
            if(i < version1.length() && version1.charAt(i) == '.'){
                i++;
            }
            if(j < version2.length() && version2.charAt(j) == '.'){
                j++;
            }
            multi1 = 0;
            multi2 = 0;
            while(i < version1.length() && version1.charAt(i) != '.'){
                multi1 = multi1 * 10 + Integer.parseInt(version1.charAt(i) + "");
                i++;
            }
            while(j < version2.length() && version2.charAt(j) != '.'){
                multi2 = multi2 * 10 +  Integer.parseInt(version2.charAt(j) + "");
                j++;
            }
            if(multi1 != multi2){
                return multi1 < multi2 ? -1 : 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int res = compare("1.02", "1.002");
        System.out.println(res);
    }
}
