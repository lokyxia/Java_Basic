package code.day08.demo02;
/*
* == 是进行对象的地址比较，如果确实需要字符串比较，可以使用两个方法
*
*public boolean equals(Object obj); 参数可以是任何对象，只有参数是一个字符串并且内容相同的才会给true，否则返回false
* 1.任何对象都可以通过Object进行接收。
* 2.equals方法具有对称性，也就是a.equals(b)和b.equals(a)效果一样
*
* public boolean equalsIgnoreCase(Object obj);
* 忽略大小写比较
*
* */

public class Demo01StringEquals {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        char[] chararray = {'H','e','l','l','o'};
        String str3 = new String(chararray);

        System.out.println(str1.equals(str2));//true
        System.out.println(str2.equals(str3));//true
        System.out.println(str1.equals("Hello"));//true
        System.out.println("Hello".equals(str1));//true 【推荐写法】

        String str4 = "hello";
        System.out.println(str1.equals(str4));//false

        //忽略大小写进行比较
        String strA = "Java";
        String strB = "java";
        System.out.println(strA.equalsIgnoreCase(strB));//true



    }
}
