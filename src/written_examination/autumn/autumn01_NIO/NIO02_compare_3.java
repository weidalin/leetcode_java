package written_examination.autumn.autumn01_NIO;

public class NIO02_compare_3 {
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
        String[] nums1 = version1.split("\\.");
        String[] nums2 = version2.split("\\.");
        int len1 = nums1.length, len2 = nums2.length;
        // compare
        int idx1, idx2;
        for(int i = 0; i < Math.max(len1,len2); i++){
            idx1 = i < len1 ? Integer.parseInt(nums1[i]) : 0;
            idx2 = i < len2 ? Integer.parseInt(nums2[i]) : 0;
            if(idx1 != idx2){
                return idx1 > idx2 ? 1 : -1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int res = compare("1.02", "1.002");
        System.out.println(res);
    }
}
