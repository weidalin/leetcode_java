package written_examination.autumn.autumn26_tecentmusice.tmusic02_;

/**
 * @author linweida
 * 2021/9/16 7:03 下午
 */

public class Main {
    public static String maxLexicographical (String num) {
        // write code here
        char[] ch = num.toCharArray();
        boolean flat = false;
        for(int i = 0; i < num.length(); i++){
            if(ch[i] == '0'){
                ch[i] = '1';
                flat = true;
                continue;
            }
            if(flat == true && ch[i] == '1'){
                break;
            }
        }
        return new String(ch);
    }

    public static void main(String[] args) {
        String res = maxLexicographical("1000");
        System.out.println(res);
    }
}
