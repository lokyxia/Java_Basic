package code_day07.Demo05;

import java.util.ArrayList;

/*
* 题目：
* 定义以指定格式打印集合的方法（ArrayList类型作为参数），使用{}括起来，使用@分隔每个元素
* 参照格式{元素@元素@元素}
*
* System.out.println(list);   [10,20,30]
* printArrayList(list);       {10@20@30}
* */
public class ArrayListPrint {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("loky");
        list.add("Tom");
        list.add("James");
        list.add("Wendy");
        System.out.println(list);//[loky, Tom, James, Wendy]
        printArrayList(list);
    }
    public static void printArrayList(ArrayList<String> list){
        //{10@20@30}
        System.out.print('{');
        for (int i = 0; i < list.size(); i++) {
            String name = list.get(i);
            if (i == list.size() -1){
                System.out.print(name + "}");
            }else
            System.out.print(name + "@");
        }
    }


}
