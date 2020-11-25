package StringBuffer和StringBuilder;

/**
 * StringBuffer:可变长字符串，JDK1.0提供，运行效率慢，线程安全
 * StringBuilder:可变长字符串，JDK1.5提供，运行效率快，线程不安全
 * 两者比String效率高，占用内存少。
 */
public class demo {
    public static void main(String[] args) {
        //1.追加 append
        StringBuffer sb = new StringBuffer();
        sb.append("ok");
        System.out.println(sb.toString());
        sb.append("=====================");
        System.out.println(sb.toString());

        //2.插入 insert
        sb.insert(0,"I'm ");
        System.out.println(sb.toString());

        //3.替换 replace
        sb.replace(0,3,"Are u");
        System.out.println(sb.toString());

        //4.删除 delete
        sb.delete(0,3);
        System.out.println(sb.toString());

        long star = System.currentTimeMillis();
        StringBuilder string = new StringBuilder("");
        for (int i = 0; i < 99999 ; i++) {
            string.append(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("用时:"+(end-star));
    }
}
