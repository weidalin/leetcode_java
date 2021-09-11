package written_examination.autumn.autumn17_wangyi_OK.wangyi01_;

/**
 * @author linweida
 * 2021/9/10 4:58 下午
 */

public class MainAnswer {
//    作者：牛客745729381号
//    链接：https://www.nowcoder.com/discuss/739215?channel=-1&source_id=profile_follow_post_nctrack
//    来源：牛客网

    static int canBePalindromicString(String str1) {
        // write code here
        int l = 0;
        int r = str1.length() - 1;
        char[] strs = str1.toCharArray();
        while (l < r && strs[l] == strs[r]) {
            l++;
            r--;
        }
        if (l + 2 >= r) return 1;
        // 得到l 和 r，
        // 1 在r中添加两个连续的字符，即从l+2开始判断是否能一一对应
        int l1 = l+2; int r1 = r;
        while (l1 < r1 && strs[l1] == strs[r1]) {
            l1++;
            r1--;
        }
        // 如果还不能完全匹配，即l1 > r1，那么就需要进一步判断、
        // 2. 在l 添加两个连续字符，即从r-2开始判断能否一一对应
        if (l1 < r1) {
            int l2 = l; int r2 = r - 2;
            while (l2 < r2 && strs[l2] == strs[r2]) {
                l2++;
                r2--;
            }
            if (l2 < r2) return 0;
        }
        return 1;
    }

    public static void main(String[] args) {
        int res = canBePalindromicString("skjl");
        System.out.println(res);
    }
}
/*
abca
1

skjl
0
 */
