package code.day11.demo02_访问权限;
/*
四种访问权限：
            public  > protected > (default) > private
 同一个类：   YES        YES         YES         YES
 同一个包：   YES        YES         YES         NO
 不同包子类：  YES        YES         NO         NO
 不同包非子类：NO          NO          NO         NO
 */
public class demo01_main {
    public static void main(String[] args) {
        System.out.println(new Class01().num);
    }

}
