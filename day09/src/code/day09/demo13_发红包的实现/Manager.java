package code.day09.demo13_发红包的实现;

import java.util.ArrayList;

public class Manager extends User {

    public Manager(){}

    public Manager(String name, int money) {
        super(name, money);
    }

    public ArrayList<Integer> send(int totalmoney,int count){
        ArrayList<Integer> redlist = new ArrayList<>();
        int leftMoney = super.getMoney();
        if (leftMoney<totalmoney){
            System.out.println("余额不足");
            return redlist;
        }
        super.setMoney(leftMoney - totalmoney);

        int avg = totalmoney/count;
        int mod = totalmoney%count;
        for (int i = 0; i < count; i++) {
            redlist.add(avg);
            if (i == count-1 ){
                redlist.add(avg+mod);
                break;
            }
            }

        return redlist;
        }

}

