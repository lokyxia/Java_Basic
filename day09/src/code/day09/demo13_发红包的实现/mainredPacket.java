package code.day09.demo13_发红包的实现;

import java.util.ArrayList;

public class mainredPacket {
    public static void main(String[] args) {
        Manager M = new Manager("群主",100);

        member one = new member("成员A",20);
        member two = new member("成员B",0);
        member three = new member("成员C",100);
        member four = new member("成员D",30);
        M.show();
        one.show();
        two.show();
        three.show();
        four.show();
        System.out.println("=========");

        ArrayList<Integer> redlist = M.send(30,4);
        one.receive(redlist);
        two.receive(redlist);
        three.receive(redlist);
        four.receive(redlist);

        M.show();
        one.show();
        two.show();
        three.show();
        four.show();




    }
}
