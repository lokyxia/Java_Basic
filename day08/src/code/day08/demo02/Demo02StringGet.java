package code.day08.demo02;
/*
*
* String当中常用于获取相关的常用方法：
*
* public int length();//获取字符串当前含有的字符个数
* public String concat;//将当前字符串和参数字符串拼接返回新的字符串
* public char charAt(int index);//获取指定索引位置的单个字符（索引从0开始）
* public int indexOf(String str);//查找参数字符串在本字符串中首次出现的位置，如果没有返回-1.
* */
public class Demo02StringGet {
    public static void main(String[] args) {

        //获取字符串长度
        int length = "jhdjhjkhkja".length();
        System.out.println("字符串长度" + length);

        //拼接
        String str1 = "I";
        String str2 = "love";
        String str3 = "You";
        String str4= str1.concat(str2).concat(str3);
        System.out.println(str4);
        System.out.println("============");

        //索引
        char c = "Hello".charAt(1);
        System.out.println("索引的第2个字母是：" + c);

        //查找第一次出现的位置
        String str5 = "Hello";
        int lo = str5.indexOf("lo");
        int e = str5.indexOf('e');
        System.out.println("lo定位在:" + lo);
        System.out.println("e定位在：" + e);


    }

}
