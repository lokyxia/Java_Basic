package code.day08.demo02;
/*
*
* z字符串的截取方法 ：
*
* public String substring(int index);// 截取从参数位置到字符串末尾，返回新字符串
  public String substring(int begin, int end);//从begin开始，到end结束中间的字符串[begin,end)
*
*
* */
public class DemoSubSring {

    public static void main(String[] args) {
        String str1 = "HelloWorld";
        String str2 = str1.substring(5);
        String str3 = str1.substring(0,5);
        System.out.println("截取后的字符串是：" + str2);
        System.out.println("截取后的字符串是：" + str3);

    }

}
