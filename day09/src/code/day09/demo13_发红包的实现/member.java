package code.day09.demo13_发红包的实现;

import java.util.ArrayList;
import java.util.Random;

public class member extends User {

    public member() {
    }

    public member(String name, int money) {
        super(name, money);
    }

    public void receive(ArrayList<Integer> list){
        Random r  = new Random();
        int index = r.nextInt(list.size());
        Integer temp = list.remove(index);
        int money = super.getMoney()+temp;
        super.setMoney(money);
    }
}
