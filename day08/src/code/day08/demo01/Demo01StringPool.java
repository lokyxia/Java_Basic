package code.day08.demo01;
/*

字符串常量值：程序当中直接写上的双引号字符串，就在字符串常量池中

对于基本类型: == 是对数值的比较
对于引用类型： == 是对地址的比较
*/
public class Demo01StringPool {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";

        char[] charArray = {'a','b','c'};
        String str3 = new String(charArray);

        System.out.println(str1 == str2);//true
        System.out.println(str1 == str3);//false
        System.out.println(str2 == str3);//false

    }
}
