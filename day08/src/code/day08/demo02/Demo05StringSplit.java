package code.day08.demo02;
/*
* 分割字符串的方法
* public String[] split(String regex);,按照参数规则，将字符串分割成若干部分
参数是一个正则表达式
* */


public class Demo05StringSplit {
    public static void main(String[] args) {
        String s = "aaa,bbb,ccc";
        String[] split = s.split(",");
        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i]);
        }
        System.out.println("=============");

    }
}
