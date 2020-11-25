package BigDecimal精确运算;

import java.math.BigDecimal;

public class demo {
    public static void main(String[] args) {
        double d1 = 1.0;//double存储的是一个近似值
        double d2 = 0.9;
        System.out.println(d1-d2);

        double d5 = 0.9 ;
        System.out.println(d5);
        BigDecimal bd1 = new BigDecimal("1.0");
        BigDecimal bd2 = new BigDecimal("0.9");
        BigDecimal r = bd1.subtract(bd2);
        System.out.println(r);

        BigDecimal r4 = new BigDecimal("1.4")
                .subtract(new BigDecimal("0.5"))
                .divide(new BigDecimal("0.9"));
        System.out.println(r4);//1
    }
}
