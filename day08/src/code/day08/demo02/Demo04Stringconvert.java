package code.day08.demo02;
/*
String当中与转换相关的常用方法有：

* public char[] toCharArray();//将当前字符拆分成为字符数组作为返回值
  public byte[] getBytes();//获得当前字符串底层的字节数组
  public String  replace(CharSequence oldString,CharSequence newString);
  将所有出现的老字符串替换成新字符串，返回新字符串
* */
public class Demo04Stringconvert {
    public static void main(String[] args) {
        //转换成为字符数组
        char[] chars = "Hello".toCharArray();
        System.out.println(chars[0]);
        System.out.println(chars.length);
        System.out.println("==========");

        byte[] bytes = "abc".getBytes();
        System.out.println(bytes[0]);
        System.out.println(bytes.length);
        System.out.println("===========");

        String replace = "hahahaa".replace("hah", "w");
        System.out.println(replace);

    }


}
