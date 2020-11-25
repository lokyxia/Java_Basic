package Calendar类;

import java.util.Calendar;

public class demo {
    public static void main(String[] args) {
        Calendar calendar =Calendar.getInstance();
        System.out.println(calendar.getTime());
        System.out.println(calendar.getTimeZone());
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.MONTH)+1);
        System.out.println(calendar.get(Calendar.DATE));



    }
}
