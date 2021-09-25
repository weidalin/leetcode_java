package written_examination.autumn.autumn25_zoom_OK;

/**
 * @author linweida
 * 2021/9/16 5:32 下午
 */

public class Main2 {
    public static String intToRoman (int num) {
        // write code here
        String[] value = new String[]{"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] key = new int[]{1000, 900, 500,400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        StringBuilder res = new StringBuilder();
        for(int i = 0; i < 13; i++){
            if(num <= 0){
                return res.toString();
            }
            int curSub = key[i];
            while(num >= curSub){
                res.append(value[i]);
                num -= curSub;
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        String res = intToRoman(3);
        System.out.println(res);
    }
}
