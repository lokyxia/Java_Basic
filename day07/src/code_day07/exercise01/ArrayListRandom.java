package code_day07.exercise01;

import java.util.ArrayList;
import java.util.Random;

/*
* 生产6个1~33之间的随机整数，添加到集合，并遍历集合
* */
public class ArrayListRandom {
    public static void main(String[] args) {
        //创建一个存放int的集合
        ArrayList<Integer> list = new ArrayList<>();
        //创建一个随机
        Random rn = new Random();
        //
        for (int i = 0; i < 6; i++) {
            list.add(rn.nextInt(33)+1);
        }
        //遍历
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
    
    
    
 }
