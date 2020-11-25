package code.day08.demo01;
/*
* java.long.String类代表字符串；
* API当中说：java程序当中所有的字符串字面值（如 “abc”）都作为此类的实例实现
* 也就是，程序当中所有的双引号字符串，都是String类的对象，（就算没有new，也是）
*
* 字符串的特点：
* 1.字符串的内容永不可变。
* 2.正是因为字符串永不可变，所以字符串是可以共享使用的
* 3.字符串效果上是相当于char[]字符数组，但是底层原理也是byte[]字节数组。
*
* 创建字符串的3+1种方式。
* 三种构造方法：
* public String(); //创建一个空白字符串，不含有任何内容
* public String(char[] array); //根据字符数组的内容，来创建对应的字符串
* public String(byte[] array); //根据字节数组的内容，来创建对应的字符串
* 一种直接创建：
* String str = "Hello";
* */
public class Demo01String {
    public static void main(String[] args) {
        //使用空参构造；
        String str1 = new String();
        System.out.println("空白字符串："+ str1);

        //根据字符数组创建
        char[] charArray= {'A','B','C'};
        String str2 = new String(charArray);
        System.out.println("字符数组:" + str2);

        //根据字节
        byte[] byteArray = {97,98,99};
        String str3 = new String(byteArray);
        System.out.println("字节数组："+str3);



    }

}
