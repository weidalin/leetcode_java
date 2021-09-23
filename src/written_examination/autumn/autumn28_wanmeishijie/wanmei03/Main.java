package written_examination.autumn.autumn28_wanmeishijie.wanmei03;

import java.math.BigDecimal;

/**
 * @author linweida
 * 2021/9/18 3:18 下午
 */
// ac
public class Main {
    public String multiply (String num1, String num2) {
        // write code here
        return new BigDecimal(num1).multiply(new BigDecimal(num2)).toString();
    }
}
