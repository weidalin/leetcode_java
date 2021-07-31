package written_examination.autumn.autmn03_yidian.yidian03_version;

import java.util.Arrays;

import static tools.Weida_utils.print_arr;

public class Solution {
    public static int[] max_version (String[][] version_list) {
        // write code here
        int[] res = new int[version_list.length];
        Arrays.fill(res, 1);
        for(int j = 0; j < version_list.length; j++){
            String[] version = version_list[j];
            String version1 = version[0];
            String version2 = version[1];
            String[] nums1 = version1.split("\\.");
            String[] nums2 = version2.split("\\.");
            int len1 = nums1.length, len2 = nums2.length;
            // compare
            int idx1, idx2;
            for(int i = 0; i < Math.max(len1,len2); i++){
                idx1 = i < len1 ? Integer.parseInt(nums1[i]) : 0;
                idx2 = i < len2 ? Integer.parseInt(nums2[i]) : 0;
                if(idx1 != idx2){
                    res[j] = idx1 >= idx2 ? 1 : 2;
                    break;
                }

            }
        }
        return res;
    }

    public static void main(String[] args) {
        String[][] version_list = {{"0.1.0", "1.0"}, {"2.1.13", "1.20.0"}, {"2.1.0", "2.1.0"}};
        int[] res = max_version(version_list);
        print_arr(res);
    }
}
