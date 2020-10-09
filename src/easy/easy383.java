package easy;

public class easy383 {
    /**
     *
     * @param ransomNote
     * @param magazine
     * @return
     * 执行用时：
     * 1 ms
     * , 在所有 Java 提交中击败了
     * 100.00%
     * 的用户
     * 内存消耗：
     * 39.2 MB
     * , 在所有 Java 提交中击败了
     * 58.88%
     * 的用户
     */
    public static boolean canConstructv2(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length())
            return false;
        int[] begin_index = new int[26];
        for (int i=0; i<ransomNote.length(); i++){
            char c = ransomNote.charAt(i);
            int index = magazine.indexOf(c, begin_index[c-97]);
            if (index < 0)
                return false;
            else{
                begin_index[c-97] = index+1;
            }
        }
        return true;
    }

    /**'
     *
     * @param ransomNote
     * @param magazine
     * @return
     * 执行用时：
     * 2 ms
     * , 在所有 Java 提交中击败了
     * 94.08%
     * 的用户
     * 内存消耗：
     * 39.2 MB
     * , 在所有 Java 提交中击败了
     * 48.87%
     * 的用户
     * 炫耀一下:
     */
    public static boolean canConstruct(String ransomNote, String magazine) {
        int[] map = new int[26];
//        System.out.println(map[1]);
        for (int i = 0; i < magazine.length(); i++){
            map[magazine.charAt(i) - 97]++;
        }
        for(int i=0; i<ransomNote.length();i++){
            if(map[ransomNote.charAt(i)-97] > 0){
                map[ransomNote.charAt(i)-97]--;
            }else{
                return false;
            }
        }
        return true;
    }

    //error: 超出输出限制
    public static boolean canConstructv1(String ransomNote, String magazine) {
        if (ransomNote.length() == 0)
            return true;
        String filt = ransomNote.substring(0, 1);
        int index = magazine.indexOf(filt);
        String filted_str="";
        if (index < 0)
            return false;
        else if (index==0) {
            filted_str = magazine.substring(index+1);
        } else{
            filted_str = magazine.substring(0, index)+ magazine.substring(index+1);
        }
        System.out.println(filted_str);
        return canConstruct(ransomNote.substring(1),filted_str);

    }
    public  static void main(String[] args) {
        boolean res = canConstructv2("aa", "aba");
        System.out.print(res);
    }
}
